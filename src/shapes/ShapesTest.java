package shapes;


public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("box1");
        System.out.println(" Area: " + box1.getArea() + " Perimeter: " + box1.getPerimeter());

        Square box2 = new Square(5);
        System.out.println("box2");
        System.out.println(" Area: " + box2.getArea() + " Perimeter: " + box2.getPerimeter());
    }



}