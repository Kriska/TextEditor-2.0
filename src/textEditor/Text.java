package textEditor;

import java.awt.Component;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Text extends Component {
	
	public Text() {
		super();
		this.text = new JTextArea();
		this.scroll = new JScrollPane(text);
	}
	
	private JTextArea text;
	private JScrollPane scroll;
	
	public JTextArea getText() {
		return text;
	}
	public void setText(JTextArea text) {
		this.text = text;
	}
	public JScrollPane getScroll() {
		return scroll;
	}
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

}
