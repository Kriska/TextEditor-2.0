package textEditor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopItems extends JOptionPane{
	
	
	PopItems(String whichCase) {
		switch (whichCase) {
		case "saveAs":  JOptionPane.showMessageDialog(new JFrame(),
			    		"Type a fle name.txt",
			    		"Unexisting file",
			    		JOptionPane.ERROR_MESSAGE); break;
		case "save": JOptionPane.showMessageDialog(new JFrame(),
			    		"Use the Save As Menu",
			    		"Unexisting file",
			    		JOptionPane.ERROR_MESSAGE); break;
		case "txt" : JOptionPane.showMessageDialog(new JFrame(),
							"Choose/Save as a .txt file",
							"Incorrect file",
							JOptionPane.ERROR_MESSAGE); break;
		default: JOptionPane.showMessageDialog(new JFrame(),
						"Error occured",
						"Error",
				JOptionPane.ERROR_MESSAGE); break;
		
		}
		
	}
}
