package DayFour.ShapeTask;

public class Square extends Shape{
    private double side;

    public Square(Point center, double side) {
        super(center);
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    boolean contains(Point point) {
        return findPoint(side, center.getSideX(), center.getSideY(), point.getSideX(), point.getSideY());
    }

    boolean findPoint(double side, double centerX, double centerY, double pointX, double pointY) {
        if ((pointX > side / 2 + centerX) || (pointX < centerX - side / 2)) {
            return false;
        }
        return !(centerY + (side / 2) < pointY) && !(centerY - (side / 2) > pointY);
    }

    @Override
    double circumference() {
        return 4 * side;
    }

    @Override
    Point center() {
        return super.center();
    }

    public Square(Point center) {
        super(center);
    }

    public double getSide() {
        return side;
    }

    private void setSide(double side) {
        this.side = side;
    }
}
