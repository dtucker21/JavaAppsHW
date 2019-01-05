

public class Employee {

    private String ID;
    private String name;
    private String hireDate;
    private String pos;
    private String boss;

    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getHireDate() {
        return hireDate;
    }
    public String getPos() {
        return pos;
    }
    public String getBoss() {
        return boss;
    }

    public Employee() {
        ID = "Ext. 4664";
        name = "Pete Tucker";
        hireDate = "I can't find the date, but you were hired in 2003";
        pos = "Computer Science Professor";
        boss = "Martha Gady";
    }

    public Employee(String Ename, String Enumber, String Ehired, String Epos, String Eboss) {
        ID = Enumber;
        name = Ename;
        hireDate = Ehired;
        pos = Epos;
        boss = Eboss;
    }
}