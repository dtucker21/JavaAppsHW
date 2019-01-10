import java.util.ArrayList;
import java.util.Random;

public class City {

    /**
    * This class gathers and distributes all the Person, Police, Teacher, and Kid objects
    * @author Daniel Tucker
    * @version 1.00, January 9th 2019
    */
    public static ArrayList<Person> residents = new ArrayList<Person>();
    public static ArrayList<Police> cCops = new ArrayList<Police>();
    public static ArrayList<Teacher> cTeachers = new ArrayList<Teacher>();
    public static ArrayList<Kid> cKids = new ArrayList<Kid>();
    public static ArrayList<Police> patrol = new ArrayList<Police>();
    
    /**
    *This is the function that makes all the Person objects that are used to occupy the city and construct Police, Kid, and Teacher objects
    */
    public static void makeResidents() {
        for (int i = 0; i < 50; i++) {
            if (i >= 0 && i < 20) {//makes 20 Kid objects
                String[] candies = { "Snickers", "Gum", "Cookies", "Twizzlers" };
                Random rand = new Random();
                cKids.add(new Kid(new Person(), candies[rand.nextInt(4)]));
            }
            else if (i >= 20 && i < 26) {//makes 6 Police objects
                Random rand = new Random();
                cCops.add(new Police(new Person(), rand.nextInt(4)));
            }
            else if (i >= 26 && i < 28) {//makes 2 Teacher objects
                Random rand = new Random();
                String[] grades = { "First", "Second", "Third", "Fourth" };
                String[] certs = { "Master's", "Bachelor's", "Ph.D" };
                cTeachers.add(new Teacher(new Person(), grades[rand.nextInt(4)], certs[rand.nextInt(3)]));
            }
            else {//everyone else is a normal Person object
                residents.add(new Person());
            }
        }
    }

    /**
    *This function takes all Patrol rank officers and sends them out into the city 
    * @param al is the ArrayList of all the Police objects in the city
    */
    public static void setPatrol(ArrayList<Police> al) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getRole() == Police.Role.Patrol) {//sends all patrol officers out to patrol the city
                patrol.add(al.get(i));
                al.remove(i);
                i--; //make sure nobody gets skipped as ArrayList gets shorter
            }
        }
    }

    /** 
    *This function outputs all the Police objects patrolling the city, or displays a different message when no one is patrolling
    */
    public static void patrolHere() {
        if (patrol.size() > 0) {
            for (int i = 0; i < patrol.size(); i++) {
                System.out.println(patrol.get(i).getName() + " is patrolling the city.");
            }
        }
        else
            System.out.println("It seems nobody is patrolling the city at this time.");
    }

    /** 
    *This function outputs all the Person objects who didn't go anywhere today 
    */
    public static void peopleHere() {
        for (int i = 0; i < residents.size(); i++) {
            System.out.println(residents.get(i).getName() + " is hanging out around the city today.");
        }
    }

    /** 
    *This function outputs all the Kid objects that didn't go to school today.
    */
    public static void kidsHere() {
        for (int i = 0; i < cKids.size(); i++) {
            System.out.println("It looks like " + cKids.get(i).getName() + " is skipping school today. For shame, " + cKids.get(i).getName() + ".");
        }
    }
}