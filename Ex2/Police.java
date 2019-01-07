

public class Police extends Person implements Employee {

    private enum Role {Patrol, Sargeant, Captain, Chief};
    private Role rank;
    private int ID;

    public Role getRole() {
        return rank;
    }

    public Police() {
        Name = "John Doe";
        Age = 35;
        phoneNum = "(123) 456-7890";
        rank = Role.Patrol;
        ID = IDNUM;
        IDNUM++;
    }

    public Police(String N, int A, String P, Role R) {
        Name = N;
        Age = A;
        phoneNum = P;
        rank = R;
        ID = IDNUM;
        IDNUM++;
    }

    public void payDay() {
        System.out.println("Policeman " + this.getName() + " just recieved their paycheck!");
    }

    public int getID() {
        return this.ID;
    }
}