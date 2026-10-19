package loops;
import java.util.Scanner;

public class GrossPayayInputValidation {
    public static void main (String args []){
        double rate = 15;
        double maxHours = 40;
        
        System.out.println("How many hours did you work? ");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        while(hours > maxHours){
            System.out.println("You must enter up to 40 hours");
            hours = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hours * rate;
        System.out.println("Your gross pay is " + grossPay);
    }
}
