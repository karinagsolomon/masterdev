package methods;
import java.util.Scanner;

public class InstantCreditCheck {
    static int reqSalary = 25000;
    static int reqCredScore = 700;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        double salary = getSalary();
        int credScore = getCreditScore();
        scanner.close();

        boolean qualified = isQualified(salary, credScore);

        notifyUser(qualified);
    }

    public static void  notifyUser(boolean qualified){
        if (qualified) 
            System.out.println("Congrats, you qualify for a loan!");
         else 
            System.out.println("Sorry, you do not qualify for a loan");
    }

    public static boolean isQualified(double salary, int credScore){
        if(salary >= reqSalary && credScore >= reqCredScore) {
            return true;
        } else return false;
    }

    public static double getSalary(){
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int credit = scanner.nextInt();

        return credit;
    }
}
