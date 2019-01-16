import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class TownGUI extends JFrame implements ActionListener {
	private JButton peoplePresent;
	private JButton payPeople;
	private JButton personStats;
	private JTextArea outputWindow;
	private JPanel panel;
	private JTextArea pictureWindow;
	private JTextArea statsWindow;
	private JLabel location;
	
	public TownGUI() {
		setSize(600, 600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.add(outputWindow);
		peoplePresent.addActionListener(this);
		payPeople.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == payPeople) {
			//pays employees
		}
		else if (e.getSource() == peoplePresent) {
			//lists people present
		}
		else {
			//displays person stats (Name, Age, Phone)
			//if (cop or teacher)
				//output ID
			//else if (kid)
				//output favorite candy
		}
	}
	
}