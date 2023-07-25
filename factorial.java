import java.util.Scanner;
public class factorial {

   
        public static void main(String[] args) {
            //to take input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            long factorial = 1;
            for (int i = 1; i <= num; ++i) {
                factorial *= i;
                
            }
            // here to show the output of the system.
            System.out.printf("Factorial of %d = %d", num, factorial);
        }
    }