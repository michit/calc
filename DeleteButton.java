package calc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class DeleteButton extends JButton implements MouseListener{

	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private NumArea numArea;
	private int j=0;
	
	public DeleteButton(TextArea textArea,NumArea numArea){
		this.textArea = textArea;
		addMouseListener(this);
		this.numArea = numArea;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//textArea.subStr();
		int i = numArea.subStr();
		if(j == 1)textArea.subStr();
		if(i == 1) j = 1; 
		else j=0;
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
