package textEditor;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SaveAsChooser extends JFileChooser {
	
	SaveAsChooser(Text text) {
	JFileChooser fileChooser = new JFileChooser();
	fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
		if (fileChooser.showSaveDialog(null) == fileChooser.APPROVE_OPTION) {
			 try
             { 
				 FileWriter writer = new FileWriter(fileChooser.getSelectedFile());
                 BufferedWriter bw = new BufferedWriter( writer );
                 writer.write(text.getText().getText().toString());
                 bw.close();
             }
             catch(Exception e2) {
            	PopItems unexistingFile = new PopItems("saveAs");
             } 
		}
	}

}
