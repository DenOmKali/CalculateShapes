import java.util.Scanner;

public class Calculator {

    private static final int CIRCLE = 1;

    private static final int SQUARE = 2;

    private static final int RECTANGLE = 3;

    private static final int TRIANGLE = 4;

    public void shapesCalculator(){
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        System.out.println("(1) CIRCLE; (2) SQUARE; (3) RECTANGLE; (4) TRIANGLE;");
        System.out.print("Enter the shape you want to calculate: ");


        boolean valid = false;
        while (!valid) {
            switch (scanner.nextInt()) {
                case CIRCLE: {
                    System.out.print("Enter the radius: ");
                    double r = scanner.nextDouble();

                    shape = new Circle(r);
                    valid = true;
                    break;
                }
                case SQUARE: {
                    System.out.print("Enter the square side length: ");
                    double a = scanner.nextDouble();

                    shape = new Square(a);

                    valid = true;
                    break;
                }
                case RECTANGLE: {
                    System.out.print("Enter the rectangle sides length: ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();

                    shape = new Rectangle(a, b);

                    valid = true;
                    break;
                }
                case TRIANGLE: {
                    System.out.print("Enter the triangle sides length and height: ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    double h = scanner.nextDouble();

                    shape = new Triangle(a, b, c, h);
                    valid = true;
                    break;
                }
                default:
                    System.out.print("Enter the valid number: ");
                    break;
            }
        }

        System.out.println("Area is: " + shape.calculateArea());
        System.out.println("Perimeter is: " + shape.calculatePerimeter());

    }

}