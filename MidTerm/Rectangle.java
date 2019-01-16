

public class Rectangle implements Shape {

    private int l; //length
    private int h; //height
    private String color;
    private int area;
    private int perim;
    private String kind = "Rectangle";
    private int ID;

    public int findArea(int l, int h) { return (l * h); }
    public int findPerim(int l, int h) { return (l + l + h + h); }
    public int getArea() { return area; }
    public int getPerim() { return perim; }
    public int getLength() { return l; }
    public int getHeight() { return h; }
    public String getColor() { return color; }

    public Rectangle() {
        ID = 0;
        l = 15;
        h = 5;
        color = "red";
        area = findArea(l, h);
        perim = findPerim(l, h);
    }

    public Rectangle(int id, int L, int H, String hue) {
        ID = id;
        l = L;
        h = H;
        color = hue;
        area = findArea(l, h);
        perim = findPerim(l, h);
    }

    //Shape implementation
    public String toString() { return (kind + " ID# " + getID()); }
    public String getKind() { return kind; }
    public String getDetailString() { return (kind + "\nColor: " + getColor() + "\nLength: " + getLength() + "\nHeight: " + getHeight() + "\nArea: " + getArea() + "\nPerimeter: " + getPerim() + "\nID# " + getID()); }
    public int getID() { return ID; }
}