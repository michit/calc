package calc;

import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class DotButton extends JButton implements MouseListener{

	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private NumArea numArea;
	
	public DotButton(TextArea textArea,NumArea numArea){
//		super(".");
		this.textArea = textArea;
		this.numArea = numArea;
		addMouseListener(this);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		numArea.addDot();
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
