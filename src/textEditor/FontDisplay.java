package textEditor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class FontDisplay extends JFrame {

	private Container pane;
	private JLabel fontName;
	private JLabel fontSize;
	private JLabel fontStyle;
	private JButton okButton;
	private JTextField previewFont;
	//private ArrayList<Font> fontNames;
	private JComboBox nameBox;
	private JComboBox sizeBox;
	private JComboBox styleBox;
	
	private ActionListener actionListener;
	private Font[] fonts;
	private int[] sizes;
	private String[] styles;
	FontDisplay() {
		 pane = getContentPane();
		 fontName = new JLabel("Font name:");
		 fontSize = new JLabel("Font size:");
		 fontStyle = new JLabel("Font style:");
		 okButton = new JButton("OK");
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    Font[] fonts = e.getAllFonts(); //get the Fonts
	    Integer[] sizes= new Integer[16];
	    String[] styles= new String[3];
	    styles[0] = "Regular";
	    styles[1] = "Bold";
	    styles[2] = "Italic";
	    ArrayList<String> fontNames= new ArrayList<String>(); //make their normal names show in combobox
	    for (Font f : fonts) {
	    	fontNames.add(f.getFontName());
	    }
	    for(int i=10, j=0; i<41; j++, i+=2) {
	    	sizes[j] = i;
	    }
	    
		nameBox = new JComboBox(fontNames.toArray());
		sizeBox =new JComboBox(sizes);
		styleBox= new JComboBox(styles);
		previewFont =new JTextField("AaBbCcDd");
		previewFont.setEditable(false);
		previewFont.setBackground(new Color(255,255,255)); //white background
		previewFont.setHorizontalAlignment(JTextField.CENTER);
		
		ActionListener a= new ActionListener(){	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int st = Font.PLAIN;
				if (styleBox.getSelectedItem().equals("Bold")) {
					st = Font.BOLD;
				}
				if (styleBox.getSelectedItem().equals("Italic")) {
					st = Font.ITALIC;	
				}
				if(styleBox.getSelectedItem().equals("Regular")) {
					st = Font.PLAIN;
				}
				  previewFont.setFont(new Font((String)nameBox.getSelectedItem(), 
			   				st, (int) sizeBox.getSelectedItem()+10));
			}
		};
		nameBox.addActionListener(a);
		sizeBox.addActionListener(a);
		styleBox.addActionListener(a);
		
	setTitle("Font chooser");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(360, 200);
	
	pane.setLayout(new GridLayout(4,2));
	pane.add(fontName);
	pane.add(nameBox);
	pane.add(fontSize);
	pane.add(sizeBox);
	pane.add(fontStyle);
	pane.add(styleBox);
	pane.add(previewFont);
	pane.add(okButton);
	}
	public JButton getOkButton() {
		return okButton;
	}
	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}
	public Container getPane() {
		return pane;
	}
	public void setPane(Container pane) {
		this.pane = pane;
	}
	public JLabel getFontName() {
		return fontName;
	}
	public void setFontName(JLabel fontName) {
		this.fontName = fontName;
	}
	public JLabel getFontSize() {
		return fontSize;
	}
	public void setFontSize(JLabel fontSize) {
		this.fontSize = fontSize;
	}
	public JLabel getFontStyle() {
		return fontStyle;
	}
	public void setFontStyle(JLabel fontStyle) {
		this.fontStyle = fontStyle;
	}
	public JTextField getPreviewFont() {
		return previewFont;
	}
	public void setPreviewFont(JTextField previewFont) {
		this.previewFont = previewFont;
	}
	public JComboBox getNameBox() {
		return nameBox;
	}
	public void setNameBox(JComboBox nameBox) {
		this.nameBox = nameBox;
	}
	public JComboBox getSizeBox() {
		return sizeBox;
	}
	public void setSizeBox(JComboBox sizeBox) {
		this.sizeBox = sizeBox;
	}
	public JComboBox getStyleBox() {
		return styleBox;
	}
	public void setStyleBox(JComboBox styleBox) {
		this.styleBox = styleBox;
	}
	public Font[] getFonts() {
		return fonts;
	}
	public void setFonts(Font[] fonts) {
		this.fonts = fonts;
	}
	public int[] getSizes() {
		return sizes;
	}
	public void setSizes(int[] sizes) {
		this.sizes = sizes;
	}
	public String[] getStyles() {
		return styles;
	}
	public void setStyles(String[] styles) {
		this.styles = styles;
	}
	public ActionListener getActionListener() {
		return actionListener;
	}
	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	}
}
