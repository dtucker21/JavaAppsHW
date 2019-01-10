import java.util.Random;

public class Kid extends Person {

    /** 
    *Kid class extends Person, and adds a favorite candy
    * @author Daniel Tucker
    * @version 1, January 7th 2019
    */
    private String favCandy;
    private Random rand = new Random();

    /** 
    * @return returns the string "favCandy" of this Kid object
    */
    public String getFave() {
        return favCandy;
    }

    /** 
    *Default constructor
    */
    public Kid() {
        Name = "Jack Doe";
        Age = 9;
        phoneNum = "(123) 456 7890";
        favCandy = "Chocolate";
    }

    /** 
    * @param N sets the name
    * @param A sets the age
    * @param P sets the phone number
    * @param C sets the favorite candy
    */
    public Kid(String N, int A, String P, String C) {
        Name = N;
        Age = A;
        phoneNum = P;
        favCandy = C;
    }

    /** 
    * @param base takes a Person object's name, phone number, and ID number.
    * Age is a random number from 9 to 12
    * @param C sets the favorite candy
    */
    public Kid(Person base, String C) {
        Name = base.getName();
        Age = rand.nextInt(4) + 9;
        phoneNum = base.getPhone();
        ID = base.getID();
        favCandy = C;
    }
}