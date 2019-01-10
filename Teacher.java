

public class Teacher extends Person implements Employee {

    /**
    *Class that models a Teacher. Has Name, ID, Phone Number, and Age from person, as well as a Grade level they teach and a degree. Job string is unused
    *@author Daniel Tucker
    *@version 1, January 7th 2019
    */
    private String Grade;
    private String Cert;
    private int ID;
    private String Job = "Teacher";

    /** 
    *@return grade level the teacher teaches
    */
    public String getGrade() {
        return Grade;
    }

    /** 
    *@return the degree the teacher holds
    */
    public String getCert() {
        return Cert;
    }
    
    /** 
    *Default constructor
    */
    public Teacher() {
        Name = "Jane Doe";
        Age = 35;
        phoneNum = "(123) 456-7890";
        Grade = "Third Grade";
        Cert = "Master's in Teaching";
        ID = IDNUM;
        IDNUM++;
    }

    /** 
    *@param N name of new teacher
    *@param A age of new teacher
    *@param P phone number of new teacher
    *@param G grade level of new teacher
    *@param C degree of new teacher
    */
    public Teacher(String N, int A, String P, String G, String C) {
        Name = N;
        Age = A;
        phoneNum = P;
        Grade = G;
        Cert = C;
        ID = IDNUM;
        IDNUM++;
    }

    /** 
    *@param base Person that the teacher builds off of. Takes the Person object's name age phone number and ID.
    *@param G grade of new teacher
    *@param C degree of new teacher
    */
    public Teacher(Person base, String G, String C) {
        Name = base.getName();
        Age = base.getAge();
        phoneNum = base.getPhone();
        ID = base.getID();
        Grade = G;
        Cert = C;
    }

    /** 
    *outputs message saying the teacher specified has been paid
    */
    public void payDay() {
        System.out.println("Teacher " + this.getName() + " just recieved their paycheck!");
    }

    /**
    *@return the ID number of the teacher
    */
    public int getID() {
        return this.ID;
    }
}