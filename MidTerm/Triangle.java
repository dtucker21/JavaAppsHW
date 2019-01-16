import java.lang.Math.*;

public class Triangle implements Shape {

    private int s1; //side1
    private int s2; //side2
    private int s3; //side3
    private String color;
    private double area;
    private int perim;
    private String kind = "Triangle";
    private int ID;
    private boolean valid = false;

    public double findArea(int S1, int S2, int S3) {
        valid = verify();
        if (valid == false)
            return 0;
        else { //Heron's Formula
            double s = (s1 + s2 + s3) / 2; //half-perimeter
            area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
            return area;
        }
    }
    public int findPerim(int S1, int S2, int S3) { return (S1 + S2 + S3); }
    public double getArea() { return area; }
    public int getPerim() { return perim; }
    public int getS1() { return s1; }
    public int getS2() { return s2; }
    public int getS3() { return s3; }
    public String getColor() { return color; }
    
    public void sortSides() {//orders sides by length for ease of verification
        if(s3 > s2) {
            int temp = s2;
            s2 = s3;
            s3 = temp;
        }
        if(s2 > s1) {
            int temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if(s3 > s2) {
            int temp = s2;
            s2 = s3;
            s3 = temp;
        }
    }

    public boolean verify() {
        sortSides();
        if (s1 >= (s2 + s3))
            return false;
        else
            return true;
    }

    public Triangle() {
        ID = 0;
        s1 = 15;
        s2 = 13;
        s3 = 4;
        color = "green";
        area = findArea(s1, s2, s3);
        perim = findPerim(s1, s2, s3);
    }

    public Triangle(int id, int S1, int S2, int S3, String hue) {
        ID = id;
        s1 = S1;
        s2 = S2;
        s3 = S3;
        color = hue;
        area = findArea(s1, s2, s3);
        perim = findPerim(s1, s2, s3);
        verify();
    }
    
    //Shape implementation
    public String toString() { return (kind + " ID# " + getID()); }
    public String getKind() { return kind; }
    public String getDetailString() { return (kind + "\nColor: " + getColor() + "\nSide 1: " + getS1() + "\nSide 2: " + getS2() + "\nSide 3: " + getS3() + "\nArea: " + getArea() + "\nPerimeter: " + getPerim() + "\nID# " + getID()); }
    public int getID() {return ID; }
}