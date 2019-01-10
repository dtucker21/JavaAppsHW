

public class CityTest {

    public static void main(String[] args) {

        /** 
        *Test class for the City class.
        *@author Daniel Tucker
        *@version 1, January 9th 2019
        */
        City.makeResidents();
        CityHall.copsCome(City.cCops);
        CityHall.copsHere();
        City.setPatrol(City.cCops);
        City.patrolHere();
        CityHall.peopleCome(City.residents);
        CityHall.peopleHere();
        School.teachersCome(City.cTeachers);
        School.teachersHere();
        School.kidsCome(City.cKids);
        School.kidsHere();
        School.peopleCome(City.residents);
        School.peopleHere();
        City.peopleHere();
        City.kidsHere();
    }
}