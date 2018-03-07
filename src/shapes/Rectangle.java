package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

// rectangle constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }
//    setting properties
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
// getting calculations
    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public double getArea() {
        return (2 * this.width) + (2 * this.length);
    }
}




// below was from original exercise inheritance and poly
//    public class Rectangle {
//    protected int length, width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//        return (2 * this.width) + (2 * this.length);
//    }
//    public int getPerimeter() {
//        return this.length * this.width;
//    }
//    }
