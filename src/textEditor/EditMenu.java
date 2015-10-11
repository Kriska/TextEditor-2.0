package textEditor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.text.DefaultEditorKit;

public class EditMenu extends Component {
	private JMenu edit;
private JMenuItem undo;
	private Action cut;
	private Action copy;
	private Action paste;
	private JMenuItem timeDate;
	private JMenuItem selectAll;
	public EditMenu() {

		super();
	   edit= new JMenu("Edit");
	  undo = new JMenuItem("Undo");
		  cut = new DefaultEditorKit.CutAction();
		  cut.putValue(Action.NAME, "Cut");
	      copy = new DefaultEditorKit.CopyAction();
	      copy.putValue(Action.NAME, "Copy");
	      paste = new DefaultEditorKit.PasteAction();
	      paste.putValue(Action.NAME, "Paste");
	  timeDate = new JMenuItem("Time and Date");
	  selectAll = new JMenuItem("Select All");
		
		//edit.add(undo);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(timeDate);
		edit.add(selectAll);
	}
	public JMenu getEdit() {
		return edit;
	}
	public void setEdit(JMenu edit) {
		this.edit = edit;
	}
	public JMenuItem getUndo() {
		return undo;
	}
	public void setUndo(JMenuItem undo) {
		this.undo = undo;
	}
	public Action getCut() {
		return cut;
	}
	public void setCut(Action cut) {
		this.cut = cut;
	}
	public Action getCopy() {
		return copy;
	}
	public void setCopy(Action copy) {
		this.copy = copy;
	}
	public Action getPaste() {
		return paste;
	}
	public void setPaste(Action paste) {
		this.paste = paste;
	}
	public void setSelectAll(JMenuItem selectAll) {
		this.selectAll = selectAll;
	}
	public JMenuItem getTimeDate() {
		return timeDate;
	}
	public void setTimeDate(JMenuItem timeDate) {
		this.timeDate = timeDate;
	}
	public JMenuItem getSelectAll() {
		return selectAll;
	}

}
