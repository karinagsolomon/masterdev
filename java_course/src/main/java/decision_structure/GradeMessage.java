import java.util.Scanner;


public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("What was your letter grade? ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent!";
                break; // you need a break statement after every case
            case "B":
                message = "Good job!";
                break;
            case "C":
                message = "You passed!";
                break;
            case "D":
                message = "You almost passed!";
                break;
            case "F":
                message = "Try again";
                break;

            default:
                message = "Please enter a valid letter grade";
                break;
        }

        System.out.println(message);
    }
}
