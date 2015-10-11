package textEditor;

import java.awt.BorderLayout;
import java.awt.color.ColorSpace;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPaneAdjustable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.html.parser.ContentModel;

public class Graphic extends JFrame {
	
	private JPanel middlePanel  = new JPanel();
	private Container pane = getContentPane();
	public Graphic(){
		setTitle("Untitled");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void start() {
		setSize(860, 460);
		pane.setLayout(new BorderLayout());
		Text textArea= new Text();

		MenuBar menuBar= new MenuBar();	
		TextLinkedToBar textLinkedToBar = new TextLinkedToBar(textArea, menuBar);
		pane.add(textLinkedToBar.getText().getScroll(), BorderLayout.CENTER);
		pane.add(textLinkedToBar.getMenuBar().getMyBar(), BorderLayout.NORTH);
		
	
	}
	
}
