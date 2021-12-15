package Home_Works.HomeWork11.firstTask;

public class AppsFigure {
    public static void main(String[] args) {
        ThisInterface triangle = new Triangle(2,2,2);
        ThisInterface rectangle = new Rectangle(2,2);
        ThisInterface square = new Square(2);
        System.out.println("Triangle perimeter: " + triangle.getPerimeter() + "\n" +
                           "Rectangle perimeter: " + rectangle.getPerimeter() + "\n" +
                           "Square perimeter: " + square.getPerimeter());
    }
}
