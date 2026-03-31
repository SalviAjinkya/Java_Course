import java.util.Scanner;

class BitwisePowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check if it's a Power of Two: ");
        int n = input.nextInt();

        if (n > 0) {
            int result = n & (n - 1);

            if (result == 0) {
                System.out.println(n + " is a Power of Two.");
            } else {
                System.out.println(n + " is NOT a Power of Two.");
            }
        } else {
            System.out.println("Please enter a positive number greater than 0.");
        }
    }
}