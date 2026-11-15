package objects;

public class HomeAreaCalculator {
    public static void main(String args[]){
        Rectangles room1 = new Rectangles();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangles room2 = new Rectangles(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms " + totalArea);
    }
}
