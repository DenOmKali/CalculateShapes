public class Triangle implements Shape{

    private final double a;

    private final double b;

    private final double c;

    private final double h;


    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return c * h / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

}