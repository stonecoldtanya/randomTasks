package DayFour.ShapeTask;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(Point center, double sideA, double sideB) {
        super(center);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(Point center) {
        super(center);
    }

    @Override
    Point center() {
        return super.center();
    }

    @Override
    double area() {
        return sideA * sideB;
    }

    @Override
    boolean contains(Point point) {
        return findPoint(sideA, sideB, center.getSideX(), center.getSideY(), point.getSideX(), point.getSideY());
    }

     boolean findPoint(double sideA, double sideB, double centerX, double centerY, double pointX, double pointY) {
        if ((pointX > sideB / 2 + centerX) || (pointX < centerX - sideB / 2)) {
            return false;
        }
        return !(centerY + (sideA / 2) < pointY) && !(centerY - (sideA / 2) > pointY);
    }

    @Override
    double circumference() {
        return 2 * (sideA + sideB);
    }

    private void setCenter(Point center) {
        this.center = center;
    }

    private void setSideA(double sideA) {
        this.sideA = sideA;
    }

    private void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Point getCenter() {
        return center;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
