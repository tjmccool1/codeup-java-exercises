package shapes;

public class Square extends Rectangle{


    public Square(int side) {
        super(side, side);
    }
    public int getArea() {
//        return length * length;
        return (int) Math.pow(length, 2);
    }
    public int getPerimeter () {
//        return length * 4;
        return 4 * length;
    }
}
