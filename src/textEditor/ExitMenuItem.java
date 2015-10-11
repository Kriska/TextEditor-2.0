package textEditor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class ExitMenuItem extends Component {
	
		JMenuItem exit;
		ExitMenuItem() {
			 exit= new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
				
			} 
		});
		}
		public JMenuItem getExit() {
			return exit;
		}
		public void setExit(JMenuItem exit) {
			this.exit = exit;
		}
	
}
