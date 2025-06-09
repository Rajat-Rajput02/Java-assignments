public class Largestof3 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // Compare three numbers using if-else ladder
        if (a > b && a > c) {
            System.out.println("a is greatest");
        } else if (b > c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }
    }
}
