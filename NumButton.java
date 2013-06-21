package calc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class NumButton extends JButton implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private int digit;
	private NumArea numArea;
	
	public NumButton(int text,TextArea textArea,NumArea numArea){
//		super(Integer.toString(text));
		this.textArea = textArea;
		this.numArea = numArea;
		digit = text;
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	//	textArea.addSignleDigit(digit);
		numArea.addnum(digit);
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
