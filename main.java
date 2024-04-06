import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class main {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "blue");
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor());
        System.out.println("Center: " + coloredCircle.getCenter());
    }
}