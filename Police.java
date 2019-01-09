package cityproj;

public class Police extends Person implements Employee {

    public enum Role {Patrol, Sargeant, Captain, Chief};
    private Role rank;
    private int ID;
    private String Job = "Police"; 

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

    public Police(Person base, int i) {
        Name = base.getName();
        Age = base.getAge();
        phoneNum = base.getPhone();
        ID = base.getID();
        if (i == 0)
            rank = Role.Patrol;
        else if (i == 1)
            rank = Role.Sargeant;
        else if (i == 2)
            rank = Role.Captain;
        else
            rank = Role.Chief;
    }

    public void payDay() {
        System.out.println("Policeman " + this.getName() + " just recieved their paycheck!");
    }

    public int getID() {
        return this.ID;
    }
}