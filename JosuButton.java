package calc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class JosuButton extends JButton implements MouseListener{

	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private String josu;
	
	
	public JosuButton(TextArea textArea){
		josu = "^";
		this.textArea = textArea;
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.addjosu(josu);
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
