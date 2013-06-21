package calc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class OpButton extends JButton implements MouseListener{

	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private String opStr;
	
	
	public OpButton(String text,TextArea textArea){
		//super(text);
		opStr = text;
		this.textArea = textArea;
		addMouseListener(this);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.addOp(opStr);
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
