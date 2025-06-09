public class Vote {
    public static void main(String[] args) {
        int age = 18;

        // Check if age is 18 or above
        if (age < 0) {
            System.out.println("Invalid age");
        }
        else{
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
      } 
    }
}
