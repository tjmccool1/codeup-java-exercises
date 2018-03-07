package shapes;


public class ShapesTest {

    public static void main(String[] args) {
//        declare varible
        Measurable myShape;

//        init variable new
        myShape = new Square(5);
//        sout results
        System.out.println("Square");
        System.out.printf("Area: %f - Perimeter: %f\n", myShape.getArea(), myShape.getPerimeter());

        myShape = new Rectangle(5, 4);
        System.out.println("Rectangle");
        System.out.printf("Area: %f - Perimeter: %f\n", myShape.getArea(), myShape.getPerimeter());

    }



}


//below still works but is from original inheritance and ploy exercise
//    public static void main(String[] args) {
//
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1");
//        System.out.println(" Area: " + box1.getArea() + " Perimeter: " + box1.getPerimeter());
//
//        Square box2 = new Square(5);
//        System.out.println("box2");
//        System.out.println(" Area: " + box2.getArea() + " Perimeter: " + box2.getPerimeter());
//    }