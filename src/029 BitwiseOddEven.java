import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to know whether its odd or even: ");
        int a = input.nextInt();

        if (a != 0) {
            int result = a & 1;

            if (result == 1) {
                System.out.println(a + " is a odd number.");
            } else{
                System.out.println(a+ " is a even number.");
            }
        } else {
            System.out.println("Your number is neither odd nor even(its zero).");
        }
    }
}