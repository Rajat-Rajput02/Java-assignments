import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three angles of a triangle:");

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        // Check if angles form a valid triangle
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
            System.out.println("The angles form a triangle.");

            // Determine type of triangle by angles
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("It is a right-angled triangle.");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("It is an obtuse-angled triangle.");
            } else {
                System.out.println("It is an acute-angled triangle.");
            }
        } else {
            System.out.println("The angles do NOT form a triangle.");
        }

        sc.close();
    }
}
