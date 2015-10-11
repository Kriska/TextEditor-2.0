package textEditor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class NewMenuItem extends Component {
	JMenuItem newItem;
	public JMenuItem getNewItem() {
		return newItem;
	}
	public void setNewItem(JMenuItem newItem) {
		this.newItem = newItem;
	}
	NewMenuItem() {
		super();
		newItem = new JMenuItem("New");
		JFileChooser fileChooser=new JFileChooser();
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        if (fileChooser.showOpenDialog(null) == fileChooser.APPROVE_OPTION) {
			        	System.out.println("Selected");
			        }
				 
				
			}
			});
	}
}