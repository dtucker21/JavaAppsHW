import java.util.Scanner;

public class BuildingTest {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String b2Name;
        String b2Address;
        Building b1 = new Building();
        System.out.print("Enter your building's name: ");
        b2Name = scnr.nextLine();
        System.out.print("Enter your building's address: ");
        b2Address = scnr.nextLine();
        Building b2 = new Building(b2Name, b2Address);
        System.out.println(b1.getName() + " is located at " + b1.getAddress());
        System.out.println(b2.getName() + " is located at " + b2.getAddress());
    }
}