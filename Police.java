

public class Police extends Person implements Employee {

    /** 
    *Class that models a police officer
    *@author Daniel Tucker
    *@version 1, January 7th 2019
    */
    public enum Role {Patrol, Sargeant, Captain, Chief};
    private Role rank;
    private int ID;
    private String Job = "Police"; 

    /** 
    *@return Role of the officer, Patrol Sargeant Captain or Chief
    */
    public Role getRole() {
        return rank;
    }

    /** 
    *Default constructor
    */
    public Police() {
        Name = "John Doe";
        Age = 35;
        phoneNum = "(123) 456-7890";
        rank = Role.Patrol;
        ID = IDNUM;
        IDNUM++;
    }

    /** 
    *@param N name of new Police
    *@param A age of new Police
    *@param P phone number of new Police
    *@param R role of new police
    */
    public Police(String N, int A, String P, Role R) {
        Name = N;
        Age = A;
        phoneNum = P;
        rank = R;
        ID = IDNUM;
        IDNUM++;
    }

    /** 
    *@param base Person that the Police builds off of. Takes name age phone number and ID
    *@param i integer that corresponds to a role as in the enumerated class
    */
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

    /** 
    *Outputs a message to the screen declaring that the police officer has been paid
    */
    public void payDay() {
        System.out.println("Policeman " + this.getName() + " just recieved their paycheck!");
    }

    /** 
    *@return the ID number of the Police
    */
    public int getID() {
        return this.ID;
    }
}