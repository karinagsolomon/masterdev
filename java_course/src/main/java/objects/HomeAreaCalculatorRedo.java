package objects;
import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangles room1 = calculator.getRoom();
        Rectangles room2 = calculator.getRoom();
        double totalArea = calculator.calculateAreaOfRoom(room1, room2);
        System.out.println("Area of both rooms " + totalArea);
    }

    public Rectangles getRoom(){
        System.out.println("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room: ");
        double width = scanner.nextDouble();

        return new Rectangles(length, width);
    }

    public double calculateAreaOfRoom(Rectangles room1, Rectangles room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
