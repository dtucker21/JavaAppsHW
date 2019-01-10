import java.util.ArrayList;
import java.util.Random;

public class School extends Building {

    /** 
    * This class models the school and holds the teachers and the kids that went to school today
    * @author Daniel Tucker
    * @version 1.1, January 9th 2019
    */
    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static ArrayList<Kid> kids = new ArrayList<Kid>();
    public static ArrayList<Person> people = new ArrayList<Person>();

    /** 
    *@param al an arraylist of teacher objects, the for loop copies the teachers from the parameter's home class, then removes that teacher from its home class
    */
    public static void teachersCome(ArrayList<Teacher> al) {
        for (int i = 0; i < al.size(); i++) {//All the teachers need to be at the school
            teachers.add(al.get(i));
            al.remove(i);
            i--;//skip preventions
        }
    }

    /** 
    *@param al an arraylist of kid objects, the for loop copies the kids from the parameter's home class, then removes that kid from its home class
    */
    public static void kidsCome(ArrayList<Kid> al) {
        Random rand = new Random();
        for (int i = 0; i < al.size(); i++) {//9 in 10 kids go to school
            if (rand.nextInt(10) != 9) {
                kids.add(al.get(i));
                al.remove(i);
                i--; //makes sure nobody gets skipped as ArrayList shortens
            }
        }
    }

    /** 
    *@param al an arraylist of person objects, the for loop copies the people from the parameter's home class, then removes that person from the home class
    */
    public static void peopleCome(ArrayList<Person> al) {
        Random rand = new Random();
        for (int i = 0; i < al.size(); i++) {
            if (rand.nextInt(10) == 9) {//1 in 10 chance that a Person also goes to the School
                people.add(al.get(i));
                al.remove(i);
                i--; //skip preventions
            }
        }
    }

    /** 
    *Prints out all Teacher objects in the school class
    */
    public static void teachersHere() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getName() + " the " + teachers.get(i).getGrade() + " grade teacher is here.");
        }
    }

    /** 
    *Prints out all Kid objects in the school class
    */
    public static void kidsHere() {
        for (int i = 0; i < kids.size(); i++) {
            System.out.println(kids.get(i).getName() + " is in class today.");
        }
    }

    /** 
    *Prints out all Person objects in the school class
    */
    public static void peopleHere() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + " is at the school today.");
        }
    }
}