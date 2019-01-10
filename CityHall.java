import java.util.ArrayList;
import java.util.Random;

public class CityHall extends Building {

    /** 
    *This class models a city hall, and stores most Police objects and random Person objects
    *@author Daniel Tucker
    *@version 1.1, January 9th 2019
    */
    public static ArrayList<Police> cops = new ArrayList<Police>();
    public static ArrayList<Person> people = new ArrayList<Person>();
    
    /**
    *@param al arraylist of Police objects that are moved from al's location to cityhall
    */
    public static void copsCome(ArrayList<Police> al) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getRole() != Police.Role.Patrol) {//Patrol cops arent in City Hall
                cops.add(al.get(i));
                al.remove(i);
                i--;//skip preventions
            }
        }
    }

    /** 
    *@param al arraylist of Person objects that have a random chance to move from al's location to cityhall
    */
    public static void peopleCome(ArrayList<Person> al) {
        Random rand = new Random();
        for (int i = 0; i < al.size(); i++) {
            if (rand.nextInt(5) == 4) {//1 in 5 chance that a person object goes to City Hall
                people.add(al.get(i));
                al.remove(i); //No longer in City so they can't go somewhere else
                i--;//skip preventions
            }
        }
    }

    /** 
    * outputs all Police objects in cityhall to the screen
    */
    public static void copsHere() {
        for (int i = 0; i < cops.size(); i++) {
            System.out.println(cops.get(i).getName() + " the " + cops.get(i).getRole() + " ranked police officer is at City Hall.");
        }
    }

    /** 
    * outputs all Person objects in cityhall to the screen
    */
    public static void peopleHere() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Citizen " + people.get(i).getName() + " is at City Hall.");
        }
    }
}