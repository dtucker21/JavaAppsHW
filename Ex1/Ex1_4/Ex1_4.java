import java.util.Scanner;

public class Ex1_4
{
    public static void main(String[] args)
    {
        System.out.print("Please enter your weight in pounds: "); //ask for pounds
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double pounds = x;
        System.out.print("Please enter your height in inches: "); //ask for inches
        int y = input.nextInt();
        double inches = y;
        double kg = pounds / 2.205; //divide pounds by 2.205 to get kg
        double m = inches / 39.37; //divide inches by 39.37 to get m
        double BMI = kg/(m * m);
        System.out.println("Your Body/Mass Index is " + BMI);
    }
}