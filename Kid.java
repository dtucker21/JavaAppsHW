package cityproj;
import java.util.Random;

public class Kid extends Person {

    private String favCandy;
    private Random rand = new Random();

    public String getFave() {
        return favCandy;
    }

    public Kid() {
        Name = "Jack Doe";
        Age = 9;
        phoneNum = "(123) 456 7890";
        favCandy = "Chocolate";
    }

    public Kid(String N, int A, String P, String C) {
        Name = N;
        Age = A;
        phoneNum = P;
        favCandy = C;
    }

    public Kid(Person base, String C) {
        Name = base.getName();
        Age = rand.nextInt(4) + 9;
        phoneNum = base.getPhone();
        ID = base.getID();
        favCandy = C;
    }
}