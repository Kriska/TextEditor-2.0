package textEditor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

public class TextLinkedToBar extends Component{
	Text text;
	MenuBar menuBar;
	public TextLinkedToBar(Text text, MenuBar menuBar) {
		super();
		this.text = text;
		this.menuBar = menuBar;
		//TIME AND DATE FUNCTIONING
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
					JMenuItem editPopupUndoField = menuBar.getEditMenu().getUndo();
					JMenuItem editPopupCutField = menuBar.getEditMenu().getCut();
					JMenuItem editPopupCopyField = menuBar.getEditMenu().getCopy();
					JMenuItem editPopupPasteField = menuBar.getEditMenu().getPaste();
					editPopup.add(editPopupUndoField);
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
