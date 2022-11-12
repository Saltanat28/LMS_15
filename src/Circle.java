public class Circle {
    private static final double PI =Math.PI;


    public Circle() {
    }


    public static double circumference(double radius){
        return PI*(radius*radius);

    }

    public static double area(double radius){

        return PI * (radius * radius);
    }
}