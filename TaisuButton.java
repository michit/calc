package calc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class TaisuButton extends JButton implements MouseListener{

	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private String taisu;
	
	public TaisuButton(String text,TextArea textArea) {
		taisu = text;
		this.textArea = textArea;
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.addtaisu(taisu);
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
