package org.principal;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.printf("RectangleArea: %.2f\n", areaCalculator.calculateShape(rectangle));
        System.out.printf("RectanglePerimeter: %.2f\n", perimeterCalculator.calculatePerimeter(rectangle));
        Circle circle = new Circle(3);
        System.out.printf("CircleArea: %.2f\n", areaCalculator.calculateShape(circle));
        System.out.printf("CirclePerimeter: %.2f\n", perimeterCalculator.calculatePerimeter(circle));
    }
}
