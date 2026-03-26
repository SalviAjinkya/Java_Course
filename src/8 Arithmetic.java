import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give input of 2 numbers to get following operations solved: +, -, *, /");
        System.out.println("Enter first number: ");
        int A = input.nextInt();
        System.out.println("Enter second number: ");
        int B = input.nextInt();

        int sum;
        sum = A + B;
        System.out.println("Addition of given numbers: " + sum);

        int sub;
        sub = A - B;
        System.out.println("Subtraction of given numbers: " + sub);

        int mul;
        mul = A * B;
        System.out.println("Multiplication of given numbers: " + mul);

        int div;
        div = A / B;
        System.out.println("Division of given numbers: " + div);

    }
}
