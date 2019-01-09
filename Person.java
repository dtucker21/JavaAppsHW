package cityproj;
import java.util.Random;

public class Person {

    protected String Name;
    protected int Age;
    protected String phoneNum;
    protected static int IDNUM = 1111;
    protected int ID;
    protected int job;

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
        Age = age;
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

    public Person() {
        Name = firstNames[f.nextInt(20)] + " " + lastNames[l.nextInt(14)];
        Age = a.nextInt(4) + 18;
        phoneNum = Integer.toString(p.nextInt(9000000) + 1000000);
        ID = IDNUM;
        IDNUM++;
        
    }

    public Person(String N, int A, String P) {
        Name = N;
        Age = A;
        phoneNum = P;
        ID = IDNUM;
        IDNUM++;
        Random rand = new Random();
        job = rand.nextInt(4);
    }

    //all of the first names are from BMAC people
    public String firstNames[] = {"Gerrit", "Devin", "Slater", "James", "Kyle", "Mitchel", "Chad", "Mason", "Casey", "Daniel",
     "Liz", "Sophie", "Emma", "Rebecca", "Katie", "Danielle", "Caitlin", "Meghan", "Meredith", "Sarah"};
    public String lastNames[] = {"Tucker", "Toney", "Udby", "Caird", "Sweet", "Parrish", "Shepard", "Pierce", "Ross", "Lizberg", "Littrell", "Perkins", "Devereaux", "Kunz"};

    public Random f = new Random();
    public Random l = new Random();
    public Random a = new Random();
    public Random p = new Random();

    public int first;
    public int last;
    public int age;
    public int phone;
}
