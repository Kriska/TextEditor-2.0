package textEditor;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Graphic extends JFrame {
	
	private Container pane = getContentPane();
	public Graphic() {
		setTitle("My UltraCool TextEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(860, 460);
		pane.setLayout(new BorderLayout());
		Text textArea= new Text();

		MenuBar menuBar= new MenuBar();	
		TextLinkedToBar textLinkedToBar = new TextLinkedToBar(textArea, menuBar);
		pane.add(textLinkedToBar.getText().getScroll(), BorderLayout.CENTER);
		pane.add(textLinkedToBar.getMenuBar().getMyBar(), BorderLayout.NORTH);
	}
	
}
