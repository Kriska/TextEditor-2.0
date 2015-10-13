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
	JFileChooser fileChooser = new JFileChooser();

		if (fileChooser.showSaveDialog(null) == fileChooser.APPROVE_OPTION) {
			text.setFile( new File(fileChooser.getSelectedFile().getName()));
			System.out.println(text.getFile().getAbsolutePath());
			 try
             {
                 FileWriter writer = new FileWriter(text.getFile().getAbsolutePath());
                 BufferedWriter bw = new BufferedWriter( writer );
                 text.getText().write( bw );
                 bw.close();
                 text.getText().requestFocus();
             }
             catch(Exception e2) {
             }
			 //always makes a file in workspace
			//if() {
				
				//this means it's a brand new file
				//!!TAKE THE DIRECTORY +NAME
		//	}
		//	else {
				
				//save over existing file
		//	}
		}
	}

}
