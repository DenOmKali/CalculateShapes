public class Circle implements Shape {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 3.14 * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * 3.14;
    }

}