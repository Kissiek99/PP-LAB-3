package geometry;

import geometry.Circle;
import geometry.Point;

public class main {
    public static void main(String[] args) {
        /
        Point center = new Point(3.0, 4.0);
        
        
        Circle circle = new Circle(center, 5.0);
        
        
        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
    }
}