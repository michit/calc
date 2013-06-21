package calc;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class RootButton extends JButton implements MouseListener {

	private static final long serialVersionUID = 1L;
	private TextArea textArea;
	private String root;
	

	public RootButton(TextArea textArea){
		root = "Å„";
		this.textArea = textArea;
		addMouseListener(this);
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.addroot(root);
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
