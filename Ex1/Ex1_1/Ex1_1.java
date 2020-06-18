import java.util.Scanner;

public class Ex1_1 {

    public static void main(String[] args) {
        System.out.print("Please enter a number between 10 and 100: ");
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();
        while (x >=10 && x <= 100) {
            if (x >= 10 && x <= 100) {
                for(int i = 0; i < x; i++) {
                    if ((i % 2) == 0)
                        System.out.println(i + " is an even number");
                    else
                        System.out.println(i + " is an odd number");
                }
                break;
            }
            else {
                //PT -- Because you won't get into this loop without a valid number, you don't need this.
                // Probably this should be outside the loop. -1
                System.out.println("Please enter a number between 10 and 100: ");
                Scanner scnr2 = new Scanner(System.in);
                int y = scnr2.nextInt();
            }
        }
    }
}
