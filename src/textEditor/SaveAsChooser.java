package textEditor;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SaveAsChooser extends JFileChooser {
	SaveAsChooser(Text text) {
	//JFileChooser fileChooser = new JFileChooser();
	setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	
	
	 JComboBox encodingBox = new JComboBox();
	 JLabel encodingLabel = new JLabel("Choose encoding:");
     encodingBox.setModel(new DefaultComboBoxModel(new String[] { "ANSI", "Unicode", "UTIF-8" }));
     JPanel panel = new JPanel();
     panel.setLayout(new BorderLayout());
     panel.add(encodingLabel, BorderLayout.CENTER);
     panel.add(encodingBox, BorderLayout.SOUTH);
     setAccessory(panel); 
		if (showSaveDialog(null) == APPROVE_OPTION) {
			 try
             { 
					 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.getSelectedFile()),
							 (String) encodingBox.getSelectedItem()));
	                 BufferedWriter bw = new BufferedWriter( writer );
	                 writer.write(text.getText().getText().toString());
	                 bw.close();
             }
             catch(Exception e2) {
            	 
            	//PopItems unexistingFile = new PopItems("saveAs");
             } 
			 System.out.println(encodingBox.getSelectedItem());
		}
	}
}