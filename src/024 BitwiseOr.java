import java.util.Scanner;

class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number to get its Bitwise And....");
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        int o = a | b;
        System.out.println("Bitwise And of given two numbers is: " + o);
    }
}