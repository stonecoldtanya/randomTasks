package DayFour.ShapeTask;

public class Triangle extends Shape{
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;

    public Triangle(Point center, Point pointOne, Point pointTwo, Point pointThree) {
        super(center);
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
    }

    double area(Point pointOne, Point pointTwo, Point pointThree) {
        return Math.abs(pointOne.getSideX() * (pointTwo.getSideY() - pointThree.getSideY())
                + pointTwo.getSideX() * (pointThree.getSideY() - pointOne.getSideY()) + pointThree.getSideX() * (pointOne.getSideY() - pointTwo.getSideY())) / 2.0f;
    }

    @Override
    boolean contains(Point point) {
        double x = point.getSideX();
        double y =  point.getSideY();
        double smallArea = area(pointOne, pointTwo, point) + area(pointOne, pointThree, point) + area(pointThree, pointTwo, point);
        if( smallArea == area(pointOne, pointTwo, pointThree)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    double circumference() {
        return  Math.abs(Math.sqrt(Math.pow((pointThree.getSideX() - pointTwo.getSideX()), 2) + Math.pow((pointThree.getSideY() - pointTwo.getSideY()), 2)) +
                Math.sqrt(Math.pow((pointTwo.getSideX() - pointOne.getSideX()), 2) + Math.pow((pointTwo.getSideY() - pointOne.getSideY()), 2)) +
                Math.sqrt(Math.pow((pointOne.getSideX() - pointThree.getSideX()), 2) + Math.pow((pointOne.getSideY() - pointThree.getSideY()), 2)));
    }

    public Point getCenter() {
        return center;
    }

    private void setCenter(Point center) {
        this.center = center;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Point getPointThree() {
        return pointThree;
    }

    public void setPointThree(Point pointThree) {
        this.pointThree = pointThree;
    }
}
