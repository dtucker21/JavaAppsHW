import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PersonTest {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);
        String N2;
        int A2;
        String P2;
        ArrayList<Person> citizens = new ArrayList<Person>();
        for (int i = 0; i < 15; i++) {
            citizens.add(new Person());
        }
        /*
        System.out.print("Your person's name is: ");
        N2 = scnr.nextLine();
        System.out.print("Your person's age is: ");
        A2 = scnr.nextInt();
        System.out.print("Your person's phone number is: ");
        P2 = scnr2.nextLine();
        
        Person p1 = new Person();
        Person p2 = new Person(N2, A2, P2);
        Police c1 = new Police();
        Teacher t1 = new Teacher();
        Kid k1 = new Kid();
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old at phone number " + p1.getPhone() + ".");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old at phone number " + p2.getPhone() + ".");
        System.out.println(c1.getName() + " is " + c1.getAge() + " years old at phone number " + c1.getPhone() + ". They are also a " + c1.getRole() + ".");
        System.out.println(t1.getName() + " is " + t1.getAge() + " years old at phone number " + t1.getPhone() + ". They are also a " + t1.getGrade() + " grade teacher with a " + t1.getCert() + ".");
        System.out.println(k1.getName() + " is " + k1.getAge() + " years old at phone number " + k1.getPhone() + ". Their favorite candy is " + k1.getFave() + ".");
        c1.payDay();
        t1.payDay();
        System.out.println("Policeman " + c1.getName() + " has the ID number " + c1.getID() + ".");
        System.out.println("Teacher " + t1.getName() + " has the ID number " + t1.getID() + ".");
        
        for (int i = 0; i < citizens.size(); i++) {
            System.out.println(citizens.get(i).getName() + " is " + citizens.get(i).getAge() + ". Their phone number is " + citizens.get(i).getPhone() + ".");
        }
        Kid k = new Kid(citizens.get(6), "Twix");
        System.out.print(k.getName() + " is " + k.getAge() + ". Their phone number is " + k.getPhone() + ".");
        */
        ArrayList<Kid> kids = new ArrayList<Kid>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        ArrayList<Police> cops = new ArrayList<Police>();
        for (int i = 0; i < citizens.size(); i++) {
            if (i >= 0 && i < 6) {
                //Makes 6 Kid objects from Person objects in citizens Arraylist
                String[] candies = { "Snickers", "Gum", "Cookies", "Twizzlers" };
                Random rand = new Random();
                kids.add(new Kid(citizens.get(i), candies[rand.nextInt(4)]));
            }
            else if (i >= 6 && i < 8) {
                //Makes 2 Teacher objects from Person objects
                String[] certs = { "Master's", "Bachelor's", "Ph.D" };
                String[] grades = { "First", "Second", "Third", "Fourth" };
                Random rand = new Random();
                teachers.add(new Teacher(citizens.get(i), grades[rand.nextInt(4)], certs[rand.nextInt(3)]));
            }
            else if (i >= 8 && i < 12) {
                //Makes 4 Police objects from Person objects
                cops.add(new Police(citizens.get(i), i - 8)); 
            }
        }
        for (int i = 0; i < kids.size(); i++) {
            System.out.println(kids.get(i).getName() + " is " + kids.get(i).getAge() + ". Their favorite candy is " + kids.get(i).getFave() + ".");
        }
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getName() + " is " + teachers.get(i).getAge() + ". They are a " + teachers.get(i).getGrade() + " grade teacher with a " + teachers.get(i).getCert() + ". Their phone number is " + teachers.get(i).getPhone() + " and their ID number is " + teachers.get(i).getID() + ".");
        }
        for (int i = 0; i < cops.size(); i++) {
            System.out.println(cops.get(i).getName() + " is " + cops.get(i).getAge() + ". They are a " + cops.get(i).getRole() + " police officer. Their phone number is " + cops.get(i).getPhone() + " and their ID number is " + cops.get(i).getID() + ".");
        }
    }
}