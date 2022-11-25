package DayFour.ShapeTask;

import java.util.ArrayList;
import java.util.List;

public class MainShapes {
    public static void main(String[] args) {
        Point A = new Point(1, 2);
        Point B = new Point(4, 2);
        Point C = new Point(3, 5);
        Point peepee = new Point(3.8,2);
        Point center = new Point(10,10);
        Triangle triangle = new Triangle(center, A, B,C);
        List<Shape> shapies = new ArrayList<>();
        shapies.add(triangle);
        Rectangle rect = new Rectangle(B, 2.4, 5);
        shapies.add(rect);
        Square square = new Square(C, 4);
        shapies.add(square);
        System.out.println(square.contains(peepee));
        System.out.println(rect.contains(peepee));
        System.out.println(Shape.allContain(shapies,peepee));

        Circle circle = new Circle(A, 4);
        System.out.println(circle.contains(C));

    }
}
