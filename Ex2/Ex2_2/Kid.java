//PT -- missing javadoc. -2

public class Kid extends Person {

    private String favCandy;

    public String getFave() {
        return favCandy;
    }

    public Kid() {
        Name = "Jack Doe";
        Age = 9;
        phoneNum = "(123) 456-7890";
        favCandy = "Chocolate";
    }

    public Kid(String N, int A, String P, String C) {
        //PT -- call the base constructor:
        // super(N, A, C);
        Name = N;
        Age = A;
        phoneNum = P;
        favCandy = C;
    }
}
