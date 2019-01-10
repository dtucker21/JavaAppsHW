

public class Building {

    /** 
    *This class models a building in the city
    *@author Daniel Tucker
    *@version 1, January 7th 2019
    */
    private String Name;
    private String Address;

    /** 
    *@param newName sets name of building
    */
    public void setName(String newName) {
        Name = newName;
    }

    /** 
    *@param newAddress sets address of building
    */
    public void setAddress(String newAddress) {
        Address = newAddress;
        //I don't know how a building would change addresses but ok
    }

    /** 
    *@return returns name of the building
    */
    public String getName() {
        return Name;
    }

    /** 
    *@return returns the name of the building
    */
    public String getAddress() {
        return Address;
    }

    /** 
    *Default constructor
    */
    public Building() {
        Name = "QQ Sushi";
        Address = "1902 W Francis Ave";
    }

    /** 
    *@param bName sets the name the constructor will use for the new building
    *@param bAddress sets the address the constrcutor will use for the new building
    */
    public Building(String bName, String bAddress) {
        Name = bName;
        Address = bAddress;
    }
}