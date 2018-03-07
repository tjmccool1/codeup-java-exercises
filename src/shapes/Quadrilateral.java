package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

//setting properties
    protected double length;
    protected double width;
// getters methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
// method to be used
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
// abstract setters methods
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
