package textEditor;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends Component{
	MenuBar() {
	
	super();
	myBar= new JMenuBar();
	fileMenu = new JMenu("File");
	editMenu = new EditMenu();
	formatMenu= new JMenu("Format");
	newField = new NewMenuItem();
	openField = new JMenuItem("Open");
	saveField = new JMenuItem("Save");
	exitField= new ExitMenuItem();
	wordWrap = new JCheckBoxMenuItem("Wordwrap");
	fontMenuItem = new JMenuItem("Font");

	myBar.add(fileMenu);
	myBar.add(editMenu.getEdit());
	myBar.add(formatMenu);
	fileMenu.add(newField.getNewItem());
	fileMenu.add(openField);
	fileMenu.add(saveField);
	fileMenu.addSeparator();
	fileMenu.add(exitField.getExit());
	formatMenu.add(wordWrap);
	formatMenu.add(fontMenuItem);
	
	}
	public EditMenu getEditMenu() {
		return editMenu;
	}
	public void setEditMenu(EditMenu editMenu) {
		this.editMenu = editMenu;
	}
	public NewMenuItem getNewField() {
		return newField;
	}
	public void setNewField(NewMenuItem newField) {
		this.newField = newField;
	}
	public JCheckBoxMenuItem getWordWrap() {
		return wordWrap;
	}
	public void setWordWrap(JCheckBoxMenuItem wordWrap) {
		this.wordWrap = wordWrap;
	}
	public JMenuItem getFontMenuItem() {
		return fontMenuItem;
	}
	public void setFont(JMenuItem fontMenuItem) {
		this.fontMenuItem = fontMenuItem;
	}
	private JMenuBar myBar;
	private JMenu fileMenu;
	private EditMenu editMenu;
	private JMenu formatMenu;
	private NewMenuItem newField;
	private JMenuItem openField;
	private JMenuItem saveField;
	private ExitMenuItem exitField;
	
	private JCheckBoxMenuItem wordWrap;

	private JMenuItem fontMenuItem;	
	
	public JMenuBar getMyBar() {
		return myBar;
	}
	public void setMyBar(JMenuBar myBar) {
		this.myBar = myBar;
	}
	public JMenu getFileMenu() {
		return fileMenu;
	}
	public void setFileMenu(JMenu fileMenu) {
		this.fileMenu = fileMenu;
	}
	
	public JMenu getFormatMenu() {
		return formatMenu;
	}
	public void setFormatMenu(JMenu formatMenu) {
		this.formatMenu = formatMenu;
	}
	
	public JMenuItem getOpenField() {
		return openField;
	}
	public void setOpenField(JMenuItem openField) {
		this.openField = openField;
	}
	public JMenuItem getSaveField() {
		return saveField;
	}
	public void setSaveField(JMenuItem saveField) {
		this.saveField = saveField;
	}
	public ExitMenuItem getExitField() {
		return exitField;
	}
	public void setExitField(ExitMenuItem exitField) {
		this.exitField = exitField;
	}
}
