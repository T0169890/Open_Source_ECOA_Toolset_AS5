/*
 * Copyright 2017, BAE Systems Limited.
 *  
 * This software and its outputs are not claimed to be fit or safe for any purpose. Any user should
 * satisfy themselves that this software or its outputs are appropriate for its intended purpose.
*/
package tech.ecoa.osets.eclipse.plugin.common;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;

public class TooltipFigure extends FlowPage {

	private final Border TOOLTIP_BORDER = new MarginBorder(0, 2, 1, 0);
	private TextFlow message;

	public TooltipFigure() {
		setOpaque(true);
		setBorder(TOOLTIP_BORDER);
		message = new TextFlow();
		message.setText("");
		add(message);
	}

	@Override
	public Dimension getPreferredSize(int w, int h) {
		Dimension d = super.getPreferredSize(-1, -1);
		if (d.width > 150)
			d = super.getPreferredSize(150, -1);
		return d;
	}

	public void setMessage(String txt) {
		message.setText(txt);
		revalidate();
		repaint();
	}
}