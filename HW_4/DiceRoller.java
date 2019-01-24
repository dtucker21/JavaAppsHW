import java.lang.Thread;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DiceRoller extends JFrame
                        implements ActionListener {
    
    static JFrame dice = new JFrame("Yahtzee!");
    static JButton roll = new JButton("Roll!");
    static JLabel sumOut = new JLabel("");
    Dice[] diceCup = new Dice[5];
    
    public DiceRoller() {
        dice.setSize(350, 300);
        dice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dice.setLayout(new FlowLayout());
        dice.setVisible(true);
        for (int i = 0; i < diceCup.length; i++) {
            JLabel l = new JLabel("dice");
            diceCup[i] = new Dice(l);
            DiceRoller.dice.add(l);
        }
        dice.add(roll);
        roll.addActionListener(this);
        dice.add(sumOut);
    }

    public static void main(String[] args) {
        DiceRoller yahtzee = new DiceRoller();
    }

    public void actionPerformed(ActionEvent e) {
    	System.out.println("");
    	Dice.sum = 0;
    	for (int i = 0; i < diceCup.length; i++) {
        	Thread t = new Thread(diceCup[i]); 
        	t.start();
        	try {
        		Thread.sleep(100);
        	} catch (Exception ex) {;}
        }
    }
}