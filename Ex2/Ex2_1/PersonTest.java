import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);
        String N2;
        int A2;
        String P2;

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
    }
}