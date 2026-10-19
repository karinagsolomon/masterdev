package decision_structure;
import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did the employee get? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congrats! You made your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You are short " + salesShort + " sales");
        }
    }
}
