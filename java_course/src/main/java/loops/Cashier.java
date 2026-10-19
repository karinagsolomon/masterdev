package loops;
import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you are buying: ");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();

        double total = 0;

        for(int i=0; i < items; i++){
            System.out.println("enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = items + price;
        }

        System.out.println("Your total is $" + total);
    }
}
