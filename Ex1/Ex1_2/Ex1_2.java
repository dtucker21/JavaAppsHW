import java.util.Scanner;

public class Ex1_2 {

    public static void main(String[] args) {
        int x = -1;
        System.out.print("Please enter the radius of a circle: ");
        while (x <= 0) {
            Scanner scnr = new Scanner(System.in);
            x = scnr.nextInt();
            final double PI = 3.14;
            if (x < 0)
                System.out.print("Please enter a value that is not negative: ");
            else if (x == 0)
                System.out.print("Please enter a value that is not zero: ");
            else {
                double area = PI * x * x;
                System.out.print("The area of a circle with radius " + x + " is " + area + ".");
            }
        }
    }
    
}