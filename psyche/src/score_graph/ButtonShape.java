package score_graph;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class ButtonShape extends JButton {
	public ButtonShape() {
		super();
	}

	public ButtonShape(String text) {
		super(text);
	}

	public ButtonShape(Action action) {
		super(action);
	}

	public ButtonShape(Icon icon) {
		super(icon);
	}

	public ButtonShape(String text, Icon icon) {
		super(text, icon);
	}

	public void decorate() {
		setBorderPainted(true);
		setOpaque(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (getModel().isArmed()) {
			graphics.setColor(new Color(36, 79, 225)); // 클릭했을 때
		} else if (getModel().isRollover()) {
			graphics.setColor(new Color(97, 128, 233)); // 커서를 올렸을 때
		} else {
			graphics.setColor(new Color(137, 160, 239)); // 평소에
		}

//		Button 모양
		graphics.fillRoundRect(0, 0, width, height, 20, 20);

		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

//		Button 안의 text 위치
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();

		graphics.setColor(getForeground());
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();

		super.paintComponent(g);
	}

}
