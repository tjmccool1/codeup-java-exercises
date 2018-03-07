package shapes;

public class Square extends Quadrilateral{

//constructor for a square
    public Square(double side) {
        super(side, side);
    }
// setting protected properties with setters that are not defined in parent classes
    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = this.length = width;
    }
// gets info with only one property
    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }
}





// below was from original exercise inheritance and poly
//    public class Square extends Rectangle{
//    public Square(int side) {
//        super(side, side);
//    }
//    public int getArea() {
////        return length * length;
//        return (int) Math.pow(length, 2);
//    }
//    public int getPerimeter () {
////        return length * 4;
//        return 4 * length;
//    }
//    }
