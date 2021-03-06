/*
 * Copyright 2017, BAE Systems Limited.
 *  
 * This software and its outputs are not claimed to be fit or safe for any purpose. Any user should
 * satisfy themselves that this software or its outputs are appropriate for its intended purpose.
*/
package tech.ecoa.osets.eclipse.plugin.editors.parts.types;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import tech.ecoa.osets.eclipse.plugin.util.TypesUtil;
import tech.ecoa.osets.model.types.Field;
import tech.ecoa.osets.model.types.Record;

public class RecordTypesComposite {

	private Text nameText;
	private Text commentText;
	private TableViewer tabValues;
	private ArrayList<Field> fArr;
	private String containerName;
	private Composite ret;
	private Record record;
	private TypesUtil util;

	public void createPartControl(Composite parent) {
		ret = new Composite(parent, SWT.BORDER_SOLID);
		GridLayout layout = new GridLayout();
		ret.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		Label label = new Label(ret, SWT.NULL);
		label.setText("&Name:");
		nameText = new Text(ret, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		nameText.setText((record.getName() != null) ? record.getName() : "");
		nameText.setLayoutData(gd);
		label = new Label(ret, SWT.NULL);
		label.setText("&Comment:");
		commentText = new Text(ret, SWT.BORDER | SWT.SINGLE);
		commentText.setLayoutData(gd);
		commentText.setText((record.getComment() != null) ? record.getComment() : "");
		label = new Label(ret, SWT.NULL);
		label.setText("&Values:");
		tabValues = new TableViewer(ret, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		tabValues.setContentProvider(ArrayContentProvider.getInstance());
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		tabValues.getControl().setLayoutData(gridData);
		TableViewerColumn nameValCol = new TableViewerColumn(tabValues, SWT.BORDER);
		TableColumn nameTabCol = nameValCol.getColumn();
		nameTabCol.setWidth(200);
		nameTabCol.setText("Name");
		nameValCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Field) element).getName();
			}
		});
		nameValCol.setEditingSupport(new TextCellEditingSupport(tabValues, "getName"));
		TableViewerColumn valNumValCol = new TableViewerColumn(tabValues, SWT.BORDER);
		TableColumn valNumTabCol = valNumValCol.getColumn();
		valNumTabCol.setWidth(200);
		valNumTabCol.setText("Type");
		valNumValCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Field) element).getType();
			}
		});
		valNumValCol.setEditingSupport(new ComboCellEditingSupport(tabValues));
		TableViewerColumn comValCol = new TableViewerColumn(tabValues, SWT.BORDER);
		TableColumn comTabCol = comValCol.getColumn();
		comTabCol.setWidth(200);
		comTabCol.setText("Comment");
		comValCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Field) element).getComment();
			}
		});
		comValCol.setEditingSupport(new TextCellEditingSupport(tabValues, "getComment"));
		final Table table = tabValues.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		label = new Label(ret, SWT.NULL);
		label.setText("");
		tabValues.setInput(getfArr());
		ret.layout();
		Composite valComp = new Composite(ret, SWT.NULL);
		GridLayout valLayout = new GridLayout();
		valComp.setLayout(valLayout);
		valLayout.numColumns = 3;
		valLayout.verticalSpacing = 9;
		valLayout.horizontalSpacing = 9;
		GridData valGd = new GridData();
		valGd.verticalAlignment = GridData.FILL;
		valGd.grabExcessHorizontalSpace = true;
		valGd.grabExcessVerticalSpace = true;
		valGd.horizontalAlignment = GridData.FILL;
		Button button = new Button(valComp, SWT.PUSH);
		button.setText("Add");
		button.addMouseListener(new RecordTypeMouseListener());
		button.setLayoutData(valGd);
		button = new Button(valComp, SWT.PUSH);
		button.setText("Remove");
		button.addMouseListener(new RecordTypeMouseListener());
		button.setLayoutData(valGd);
		button = new Button(valComp, SWT.PUSH);
		button.setText("Clear");
		button.addMouseListener(new RecordTypeMouseListener());
		button.setLayoutData(valGd);
		ret.setVisible(true);
	}

	private class RecordTypeMouseListener implements MouseListener {

		@Override
		public void mouseDoubleClick(MouseEvent e) {
		}

		@Override
		public void mouseDown(MouseEvent e) {
		}

		@Override
		public void mouseUp(MouseEvent e) {
			if (((Button) e.getSource()).getText().equalsIgnoreCase("Add")) {
				Field val = new Field();
				val.setName("");
				val.setComment("");
				val.setType("");
				getfArr().add(val);
				tabValues.refresh();
			} else if (((Button) e.getSource()).getText().equalsIgnoreCase("Remove")) {
				int[] items = tabValues.getTable().getSelectionIndices();
				ArrayList<Field> rem = new ArrayList<Field>();
				for (int item : items) {
					rem.add(getfArr().get(item));
				}
				getfArr().removeAll(rem);
				tabValues.refresh();
			} else if (((Button) e.getSource()).getText().equalsIgnoreCase("Clear")) {
				getfArr().clear();
				tabValues.refresh();
			}
		}

	}

	private class TextCellEditingSupport extends EditingSupport {
		private final TableViewer viewer;
		private final CellEditor editor;
		private final String fName;

		public TextCellEditingSupport(TableViewer viewer, String fName) {
			super(viewer);
			this.viewer = viewer;
			this.fName = fName;
			this.editor = new TextCellEditor(viewer.getTable());
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return editor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			Field val = (Field) element;
			try {
				Method getter = val.getClass().getMethod(fName, null);
				Object data = getter.invoke(val, null);
				return data;
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
				return "";
			}
		}

		@Override
		protected void setValue(Object element, Object value) {
			Field val = (Field) element;
			try {
				Method setter = val.getClass().getMethod(StringUtils.replaceFirst(fName, "get", "set"), String.class);
				setter.invoke(element, value);
			} catch (IllegalArgumentException | IllegalAccessException | SecurityException | NoSuchMethodException | InvocationTargetException e) {
			}
			viewer.update(element, null);
		}

	}

	private class ComboCellEditingSupport extends EditingSupport {
		private final TableViewer viewer;
		private ArrayList<String> types;

		public ComboCellEditingSupport(TableViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			try {
				types = util.getAllTypes();
				String[] opts = new String[types.size()];
				int i = 0;
				for (String type : types) {
					opts[i] = type;
					i++;
				}
				return new ComboBoxCellEditor(viewer.getTable(), opts);
			} catch (IOException | JAXBException e) {
				return new TextCellEditor(viewer.getTable());
			}
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			Field val = (Field) element;
			int i = 0;
			for (String type : types) {
				if (type.equalsIgnoreCase(val.getType()))
					return i;
				i++;
			}
			return 0;
		}

		@Override
		protected void setValue(Object element, Object value) {
			Field val = (Field) element;
			val.setType(types.get((Integer) value));
			viewer.update(element, null);
		}
	}

	public String getContainerName() {
		return containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}

	public Composite getRet() {
		return ret;
	}

	public void setRet(Composite ret) {
		this.ret = ret;
	}

	public Record getRecord() {
		return record;
	}

	public Record getProcessedRecord() {
		Record ret = new Record();
		ret.setComment((commentText.getText().length() == 0) ? null : commentText.getText());
		ret.setName(nameText.getText());
		ret.getField().addAll(getfArr());
		return ret;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public ArrayList<Field> getfArr() {
		if (fArr == null) {
			fArr = new ArrayList<Field>();
			fArr.addAll(record.getField());
		}
		return fArr;
	}

	public void setfArr(ArrayList<Field> fArr) {
		this.fArr = fArr;
	}

	public TypesUtil getUtil() {
		return util;
	}

	public void setUtil(TypesUtil util) {
		this.util = util;
	}
}
