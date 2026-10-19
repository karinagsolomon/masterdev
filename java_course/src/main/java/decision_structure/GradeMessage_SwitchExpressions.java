import java.util.Scanner;


public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("What was your letter grade? ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A", "B" -> "Excellent!"; // breaks aren't necessary for switch expressions bc there's no fall thru
            // case "B" -> "Good job!";
            case "C" -> {
                yield "You passed!"; }
            case "D" -> "You almost passed!";
            case "F" -> "Try again";
            default -> "Please enter a valid letter grade";
        };

        System.out.println(message);
    }
}
