import java.util.Random;

public class Person {

    /** 
    * This class models a person, it has a first and last name condensed into one string, an age, phone number, an ID, and a job member variable. The job variable is now obsolete with how the city and citytest classes work
    * @author Daniel Tucker
    * @version 1.1 January 7th 2019
    * @depreciated int job
    */

    protected String Name;
    protected int Age;
    protected String phoneNum;
    protected static int IDNUM = 1111;
    protected int ID;
    protected int job;

    /** 
    * get and set functions for most member variables, and an unused birthday function to make someone one year older
    * @depreciated public void Birthday()
    */
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getPhone() {
        return phoneNum;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age; //PT -- validate age and phone number. -2
    }

    public void Birthday() {
        Age += 1;
    }

    public void setPhone(String newPhone) {
        phoneNum = newPhone;
    }

    public void setID(int id) {
        ID = id;
    }

    /**
    *Constructor that takes no arguments
    */
    public Person() {
        Name = firstNames[f.nextInt(20)] + " " + lastNames[l.nextInt(14)];
        Age = a.nextInt(4) + 18;
        phoneNum = Integer.toString(p.nextInt(9000000) + 1000000);
        ID = IDNUM;
        IDNUM++;
        
    }

    /** 
    *Constructor taking a String, int, String input
    * @param N sets the name of the Person
    * @param A sets the age of the Person
    * @param P sets the phone number of the Person
    */
    public Person(String N, int A, String P) {
        Name = N;
        Age = A;
        phoneNum = P;
        ID = IDNUM;
        IDNUM++;
        Random rand = new Random();
        job = rand.nextInt(4);
    }
    
    //PT -- make these static

    //all of the first names are from BMAC people
    public String firstNames[] = {"Gerrit", "Devin", "Slater", "James", "Kyle", "Mitchel", "Chad", "Mason", "Casey", "Daniel",
     "Liz", "Sophie", "Emma", "Rebecca", "Katie", "Danielle", "Caitlin", "Meghan", "Meredith", "Sarah"};
    public String lastNames[] = {"Tucker", "Toney", "Udby", "Caird", "Sweet", "Parrish", "Shepard", "Pierce", "Ross", "Lizberg", "Littrell", "Perkins", "Devereaux", "Kunz"};

    /**
    * ints first, last, age, and phone are all unused
    */
    public Random f = new Random();
    public Random l = new Random();
    public Random a = new Random();
    public Random p = new Random();

    public int first;
    public int last;
    public int age;
    public int phone;
}
