//PT -- missing javadoc. -2

public class Building {

    private String Name;
    private String Address;

    public void setName(String newName) {
        Name = newName;
    }

    public void setAddress(String newAddress) {
        Address = newAddress;
        //I don't know how a building would change addresses but ok
        //PT -- you don't need to allow this then?
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public Building() {
        Name = "QQ Sushi";
        Address = "1902 W Francis Ave";
    }

    public Building(String bName, String bAddress) {
        Name = bName;
        Address = bAddress;
    }
}
