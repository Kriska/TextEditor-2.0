package textEditor;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SaveChooser extends JFileChooser {
	
	SaveChooser(Text text) {
		 try
       { 
			FileWriter writer = new FileWriter(text.getFile());
           BufferedWriter bw = new BufferedWriter( writer );
           writer.write(text.getText().getText().toString());
           bw.close();
       }
       catch(Exception e2) {
    		JOptionPane.showMessageDialog(new JFrame(),
				    "Use the Save As Menu",
				    "Unexisting file",
				    JOptionPane.ERROR_MESSAGE);
       } 
	}

}
