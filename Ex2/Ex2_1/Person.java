//PT -- missing javadoc. -2

public class Person {

    protected String Name;
    protected int Age;
    protected String phoneNum;
    protected static int IDNUM = 1111;
    protected int ID;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getPhone() {
        return phoneNum;
    }

    public Person() {
        Name = "John Doe";
        Age = 35;
        phoneNum = "(123) 456-7890";
        ID = IDNUM;
    }

    public Person(String N, int A, String P) {
        Name = N;
        Age = A;//PT -- validate age, phone number. -1
        phoneNum = P;
        ID = IDNUM;
    }
}
