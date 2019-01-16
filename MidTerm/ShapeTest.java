

public class ShapeTest {

    public static void main(String[] args) {
        Square sqr = new Square();
        Rectangle rct = new Rectangle();
        Circle cir = new Circle();
        Triangle tri = new Triangle();
        System.out.println(tri.toString());
        System.out.println(tri.getKind());
        System.out.println(tri.getDetailString());
        System.out.println(tri.getID());
    }
}