import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number to get its Bitwise XOR....");
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        int x = a ^ b;
        System.out.println("Bitwise And of given two numbers is: " + x);
    }
}