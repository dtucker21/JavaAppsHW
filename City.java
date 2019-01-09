import java.util.ArrayList;
import java.util.Random;
import cityproject.*;

public class City {

    ArrayList<Person> residents = new ArrayList<Person>();
    ArrayList<Police> cCops = new ArrayList<Police>();
    ArrayList<Teachers> cTeachers = new ArrayList<Teacher>();
    ArrayList<Kid> cKids = new ArrayList<Kid>();

    public static int main(String[] args) {

    }

    public Person makeResidents() {
        for (int i = 0; i < 50; i++) {
            if (i >= 0 && i < 20) {
                String[] candies = { "Snickers", "Gum", "Cookies", "Twizzlers" };
                Random rand = new Random();
                cKids.add(new Kid(Person(), rand.nextInt(4)));
            }
            else if (i >= 20 && i < 26) {
                Random rand = new Random();
                cCops.add(new Police(Person(), rand.nextInt(4)));
            }
            else if (i >= 26 && i < 28) {
                Random rand = new Random();
                String[] grades = { "First", "Second", "Third", "Fourth" };
                String[] certs = { "Master's", "Bachelor's", "Ph.D" };
                cTeachers.add(new Teacher(Person(), rand.nextInt(4), rand.nextInt(3)));
            }
            else {
                residents.add(Person());
            }
        }
    }
}