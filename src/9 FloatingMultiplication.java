import java.util.Scanner;

class FloatingMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Floating Numbers to get them multiplied");
        System.out.println("Enter First Floating number: ");
        float A = input.nextFloat();

        System.out.println("Enter second number: ");
        float B = input.nextFloat();

        float mul;
        mul = A * B;
        System.out.println("Multiplication of given Floating numbers is: " + mul);
    }
}
