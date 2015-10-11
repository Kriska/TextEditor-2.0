package textEditor;

import java.awt.Component;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu extends Component {
	private JMenu edit;
	private JMenuItem undo;
	private JMenuItem cut;
	private JMenuItem copy;
	private JMenuItem paste;
	private JMenuItem timeDate;
	private JMenuItem selectAll;
	public EditMenu() {

		super();
		edit= new JMenu("Edit");
		undo = new JMenuItem("Undo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		timeDate = new JMenuItem("Time and Date");
		selectAll = new JMenuItem("Select All");
		
		edit.add(undo);
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
	public JMenuItem getCut() {
		return cut;
	}
	public void setCut(JMenuItem cut) {
		this.cut = cut;
	}
	public JMenuItem getCopy() {
		return copy;
	}
	public void setCopy(JMenuItem copy) {
		this.copy = copy;
	}
	public JMenuItem getPaste() {
		return paste;
	}
	public void setPaste(JMenuItem paste) {
		this.paste = paste;
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
