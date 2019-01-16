

public class Circle implements Shape{

    private int r; //radius
    private String color;
    private double area;
    private double circ;
    private String kind = "Circle";
    private int ID;
    private final double pi = 3.14;

    public double findArea(int R, double PI) { return (R * R * PI); }
    public double findCirc(int R, double PI) { return (2 * PI * R); }
    public double getArea() { return area; }
    public double getCirc() { return circ; }
    public int getR() { return r; }
    public String getColor() { return color;}

    public Circle() {
        ID = 0;
        r = 5;
        color = "blue";
        area = findArea(r, pi);
        circ = findCirc(r, pi);
    }

    public Circle(int id, int R, String hue) {
        ID = id;
        r = R;
        color = hue;
        area = findArea(r, pi);
        circ = findCirc(r, pi);
    }

    //Shape implementation
    public String toString() { return (kind + "ID# " + getID()); }
    public String getKind() { return kind; }
    public String getDetailString() { return (kind + "\nColor: " + getColor() + "\nRadius: " + getR() + "\nArea: " + getArea() + "\nCircumference: " + getCirc() + "\nID# " + getID()); }
    public int getID() { return ID; }
}