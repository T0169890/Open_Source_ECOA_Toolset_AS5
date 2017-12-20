/*
 * Copyright 2017, BAE Systems Limited.
 *  
 * This software and its outputs are not claimed to be fit or safe for any purpose. Any user should
 * satisfy themselves that this software or its outputs are appropriate for its intended purpose.
*/
package tech.ecoa.osets.eclipse.plugin.editors.parts.deploy.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import tech.ecoa.osets.eclipse.plugin.common.TooltipFigure;
import tech.ecoa.osets.eclipse.plugin.editors.parts.deploy.model.DeployedTriggerInstanceNode;

public class DeployedTriggerInstanceFigure extends AbstractFigure {
	private Label display = new Label();
	private DeployedTriggerInstanceNode node;

	public DeployedTriggerInstanceFigure() {
		super();
		setLayout(new XYLayout());
		setCornerDimensions(new Dimension(15, 15));
	}

	@Override
	public void rebuildFigure() {
		getDisplay().setForegroundColor(ColorConstants.black);
		add(getDisplay());
		setConstraint(getDisplay(), new Rectangle(10, 10, -1, -1));

		setForegroundColor(DeployedTriggerInstanceNode.FONT_COLOR);
		setBackgroundColor(DeployedTriggerInstanceNode.DEF_COLOR);
		TooltipFigure tooltip = new TooltipFigure();
		tooltip.setMessage("Deployed Trigger");
		setToolTip(tooltip);
		setOpaque(true);
		setVisible(true);
	}

	public Label getDisplay() {
		String dis = "Component Instance : " + node.getCompName() + "\nTrigger Instance : " + node.getTriggerName() + "\nPriority : " + node.getPriority();
		display.setText(dis);
		return display;
	}

	public void setDisplay(Label display) {
		this.display = display;
	}

	public DeployedTriggerInstanceNode getNode() {
		return node;
	}

	public void setNode(DeployedTriggerInstanceNode node) {
		this.node = node;
	}

}
