import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee Pete = new Employee();
        System.out.println("When adding an employee, enter Name, ID Number, Hire Date, Position, and then Boss in that order.");
        System.out.print("Would you like to add an employee? ( Yes = 1 / No = 0 ): ");
        Scanner add = new Scanner(System.in);
        int ans = add.nextInt();
        if (ans == 1) {
            System.out.print("What is the employee's name: ");
            Scanner strInput1 = new Scanner(System.in);
            String Ename = strInput1.next();
            System.out.print("What is the employee's ID number: ");
            Scanner strInput2 = new Scanner(System.in);
            String EID = strInput2.next();
            System.out.print("What is the employee's hire date: ");
            Scanner strInput3 = new Scanner(System.in);
            String Ehire = strInput3.next();
            System.out.print("What is the employee's position: ");
            Scanner strInput4 = new Scanner(System.in);
            String Epos = strInput4.next();
            System.out.print("Who is the employee's boss: ");
            Scanner strInput5 = new Scanner(System.in);
            String Eboss = strInput5.next();
            Employee newbie = new Employee(Ename, EID, Ehire, Epos, Eboss);
            System.out.print("Your new employee is named " + newbie.getName() + " has the ID number " + newbie.getID() + " is a " + newbie.getPos() + " who was hired on " + newbie.getHireDate() + " and their boss is " + newbie.getBoss() + ".");
        }
        
       
    }
}