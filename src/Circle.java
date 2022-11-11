public class Circle {
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double circumference(double radius){
        final double pi = 3.14;
        return pi * 2 * radius;
    }

    public static double area(double radius){
        final double pi = 3.14;
        return pi * (radius * radius);
    }
}