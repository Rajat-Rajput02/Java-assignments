public class LargestThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;

        // Compare all three numbers
        if (a > b && a > c) {
            System.out.println("a is the largest");
        } else if (b > c) {
            System.out.println("b is the largest");
        } else {
            System.out.println("c is the largest");
        }
    }
}

