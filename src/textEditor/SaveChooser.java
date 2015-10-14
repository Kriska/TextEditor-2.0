package textEditor;

import java.io.BufferedWriter;
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
    		PopItems unexistingFile = new PopItems("save");
       } 
	}

}
