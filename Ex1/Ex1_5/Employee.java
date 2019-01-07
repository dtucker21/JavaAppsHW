

public class Employee {

    private String ID;
    private String name;
    private String hireDate;
    private String pos;
    private String boss;

    String getID() {
        return Employee.ID;
    }
    String getName() {
        return Employee.name;
    }
    String getHireDate() {
        return Employee.hireDate;
    }
    String getPos() {
        return Employee.pos;
    }
    String getBoss() {
        return Employee.boss;
    }

    Void setID(String newID) {
        ID = newID;
    }

    Void setName(String newName) {
        name = newName;
    }

    Void setHireDate(String newHireDate) {
        hireDate = newHireDate;
    }

    Void setPos(String newPos) {
        pos = newPos;
    }
    
    Void setBoss(String newBoss) {
        boss = newBoss;
    }

    public Employee() {
        Employee.ID = "Ext. 4664";
        Employee.name = "Pete Tucker";
        Employee.hireDate = "I can't find the date, but you were hired in 2003";
        Employee.pos = "Computer Science Professor";
        Employee.boss = "Martha Gady"
    }

    public Employee(String Enumber, String Ename, String Ehired, String Epos, String Eboss) {
        Employee.ID = Enumber;
        Employee.name = Ename;
        Employee.hireDate = Ehired;
        Employee.pos = Epos;
        Employee.boss = Eboss;
    }
}