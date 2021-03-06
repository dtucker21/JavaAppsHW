

public class Teacher extends Person implements Employee {

    private String Grade;
    private String Cert;
    private int ID;

    public String getGrade() {
        return Grade;
    }

    public String getCert() {
        return Cert;
    }
    
    public Teacher() {
        Name = "Jane Doe";
        Age = 35;
        phoneNum = "(123) 456-7890";
        Grade = "Third Grade";
        Cert = "Master's in Teaching";
        ID = IDNUM;
        IDNUM++;
    }

    public Teacher(String N, int A, String P, String G, String C) {
        Name = N;
        Age = A;
        phoneNum = P;
        Grade = G;
        Cert = C;
        ID = IDNUM;
        IDNUM++;
    }

    public void payDay() {
        System.out.println("Teacher " + this.getName() + " just recieved their paycheck!");
    }

    public int getID() {
        return this.ID;
    }
}