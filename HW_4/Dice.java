import java.util.Random;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Dice implements Runnable {

    private Random rand;
    public JLabel _label;

    public static URL dice1, dice2, dice3, dice4, dice5, dice6;
    public static ArrayList<ImageIcon> dices;
    public static ImageIcon side1, side2, side3, side4, side5, side6;
    public int d;
    public static int sum = 0;

    public static int getInt() {
        return sum;
    }
    
    public Dice(JLabel l) {
        _label = l;
    } 
    
   JLabel sumDisplay = new JLabel("You need to change this text");


    public void run() {
        rand = new Random();        
        for (int i = 0; i < 50; i++) {
        	try {
        		_label.setText("");
        		String dir = System.getProperty("user.dir");
        		d = rand.nextInt(6) + 1;
        		_label.setIcon(new ImageIcon(dir + "\\resources\\d6_" + d + ".png"));
                Thread.sleep(200);
            }
            catch (Exception ex) { System.out.printf("Dice roll interrupted by error %s. Did you drop a die under the table?\n(The thread threw an exception instead of sleeping)\n", ex); }
        }
        System.out.print(d + "\t");
        sum += d;
        DiceRoller.sumOut.setText("Sum: " + sum);
      }
}