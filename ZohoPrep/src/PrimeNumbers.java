import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        boolean found=true;
        for(int i=2;i<=n;i++) {
            if(n%i==0 && n!=i) {
                found=false;
            }
        }
   
        return found;
    }

    // Main function to get input and find prime numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of integers in the list
        System.out.print("Enter the total number of integers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input the list of integers
        System.out.print("Enter the integers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        // Check if input is valid
        if (input.length != n) {
            System.out.println("The number of integers provided does not match the expected count.");
            scanner.close();
            return;
        }

        List<Integer> primes = new ArrayList<>();
        for (String numStr : input) {
            int num = Integer.parseInt(numStr);
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        // Display prime numbers
        System.out.print("Prime numbers: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }

        scanner.close();
    }
}
