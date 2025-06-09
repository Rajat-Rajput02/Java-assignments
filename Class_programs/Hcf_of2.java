import java.util.Scanner;

public class Hcf_of2 {
    public static void main(String args[]) {
 
           Scanner sc = new Scanner(System.in);
 
           System.out.println("Enter first number : ");
           int firstNumber = sc.nextInt();
 
           System.out.println("Enter second number : ");
           int secondNumber = sc.nextInt();
 
           System.out.println("HCF of " + firstNumber + " and " + secondNumber
                        + " is = ");
           
            // Now we will calculate HCF of Two Numbers In Java
            
           int remainder;
           //Use while loop to find HCF
           while (secondNumber != 0) {
                  remainder = firstNumber % secondNumber;
                  firstNumber = secondNumber;
                  secondNumber = remainder;
           }
 
           System.out.println("HCF is :"+ firstNumber);
 
    }
 
}

