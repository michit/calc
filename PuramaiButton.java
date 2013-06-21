package calc;

import javax.swing.JButton;

import java.awt.event.*;
public class PuramaiButton extends JButton  implements MouseListener{

	private static final long serialVersionUID = 1L;
	private NumArea numArea;
	public PuramaiButton(NumArea numArea){
		this.numArea = numArea;
		addMouseListener(this);
	}


	
	@Override
	public void mouseClicked(MouseEvent e) {
		numArea.pm();
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
