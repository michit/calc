package calc;

import java.awt.event.*;

import javax.swing.JButton;

public class ClearButton extends JButton implements MouseListener{

	
	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private NumArea numArea;
	public ClearButton(TextArea textArea,NumArea numArea){
	//	super("C");
		this.textArea = textArea;
		this.numArea = numArea;
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.clear();
		numArea.clear();
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
