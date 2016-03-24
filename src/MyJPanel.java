
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	private int centerX;
	private int centerY;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		g.setColor(square.getRandomColor());
		g.fillRect(centerX, centerY, 100, 100);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		centerX = square.getCenterX(e.getX());
		centerY = square.getCenterY(e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
