import java.util.Scanner;

public class NumberToBinary {

    // Main function to get input and display the binary format
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert to binary and display
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary format: " + binary);

        scanner.close();
    }
}
