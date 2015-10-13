package textEditor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoableEdit;

public class TextLinkedToBar extends Component{
	Text text;
	MenuBar menuBar;
	public TextLinkedToBar(Text text, MenuBar menuBar) {
		super();
		this.text = text;
		this.menuBar = menuBar;	
		//NEW FILE
		menuBar.getNewField().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        text.getText().setText(null);
			}
		});
		//OPEN FILE
		menuBar.getOpenField().addActionListener(new ActionListener() {
			JFileChooser fileChooser=new JFileChooser();
			public void actionPerformed(ActionEvent e) {
		        if (fileChooser.showOpenDialog(null) == fileChooser.APPROVE_OPTION) {
		        	text.setFile( fileChooser.getSelectedFile());
		        	//DISPLAY FILE TEXT IN TEXT AREA
		        	try
	                {
	                    FileReader reader = new FileReader(text.getFile());
	                    BufferedReader br = new BufferedReader(reader);
	                    text.getText().read( br, null );
	                    br.close();
	                    text.getText().requestFocus();
	                }
	                catch(Exception e2) { System.out.println(e2); }
	            }
	        }
		});
		//SAVE FILE
		menuBar.getSaveField().addActionListener(new ActionListener() {
			JFileChooser fileChooser=new JFileChooser();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (fileChooser.showSaveDialog(null) == fileChooser.APPROVE_OPTION) {
						//1) save over existing file
						//2) make new file !!TAKE THE DIRECTORY +NAME
				}
			}
		} );
		menuBar.getEditMenu().getTimeDate().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				String textWithDate = new String(text.getText().getText()+dateFormat.format(new Date()));
				text.getText().setText(textWithDate);
			}
		});
		//WORDWRAP FUNCTIONING
		menuBar.getWordWrap().addItemListener(new ItemListener() {
		
			@Override
			public void itemStateChanged(ItemEvent e) {
				 if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
					 text.getText().setLineWrap(true);
					 text.getText().setWrapStyleWord(true);        	
			        } else {									//checkbox has been deselected
			        	 text.getText().setLineWrap(false);
						 text.getText().setWrapStyleWord(false); 
			        };
			}
		});
		//RIGHT CLICK POPUP FUNCTONING

		text.getText().addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)) {
					JPopupMenu editPopup = new JPopupMenu();
					Action editPopupCutField = menuBar.getEditMenu().getCut();
					Action editPopupCopyField = menuBar.getEditMenu().getCopy();
					Action editPopupPasteField = menuBar.getEditMenu().getPaste();
					editPopup.add(editPopupCutField);
					editPopup.add(editPopupCopyField);
					editPopup.add(editPopupPasteField);
				    editPopup.show(e.getComponent(), e.getX(), e.getY());
				}
				
			}
		});
		//SELECT ALL FUNCTIONING
		menuBar.getEditMenu().getSelectAll().addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.getText().selectAll();
			}
			
		});
	}
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
	public MenuBar getMenuBar() {
		return menuBar;
	}
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

}