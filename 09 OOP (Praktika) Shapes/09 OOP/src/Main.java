import shapes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Sukuriame objektus
        Shape circle = new Circle(5.0, "red", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "blue", false);
        Shape square = new Square(4.0, "green", true);
        Shape triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0, "yellow", false);

        // Įdedame objektus į kolekciją
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(triangle);

        // a) Atspausdiname visus kolekcijos elementus
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // b) Apskaičiuojame visų figūrų plotą
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("Total area of all shapes: " + totalArea);

        // c) Randame figūrą su didžiausiu perimetru
        Shape maxPerimeterShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter()) {
                maxPerimeterShape = shape;
            }
        }
        System.out.println("Shape with the largest perimeter: " + maxPerimeterShape);

        // d) Atspausdiname tik kvadratų kraštines
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square squareShape = (Square) shape;
                System.out.println("Square side: " + squareShape.getSide());
            }
        }
    }
}
