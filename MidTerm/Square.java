

public class Square implements Shape {

    private int s; //side length
    private String color;
    private int area;
    private int perim;
    private String kind = "Square";
    private int ID;

    public int findArea(int s) { return (s * s); }
    public int findPerim(int s) { return (s * 4); }
    public int getArea() { return area; }
    public int getPerim() { return perim; }
    public int getSide() { return s; }
    public String getColor() { return color; }

    public Square() {
        ID = 0;
        s = 7;
        color = "yellow";
        area = findArea(s);
        perim = findPerim(s);
    }

    public Square(int id, int S, String hue) {
        ID = id;
        s = S;
        color = hue;
        area = findArea(s);
        perim = findPerim(s);
    }

    //Shape implementation
    public String toString() { return (kind + " ID# " + getID()); }
    public String getKind() { return kind; }
    public String getDetailString() { return (kind + "\nColor: " + getColor() + "\nLength: " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerim() + "\nID# " + getID()); }
    public int getID() { return ID; }
}