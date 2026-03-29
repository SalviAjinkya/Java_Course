import java.util.Scanner;

class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise Left Shift calculator....");
        System.out.println("By how much you want Left Shift?");
        int s = input.nextInt();
        System.out.println("Enter number to get its Bitwise Left Shift:");
        int a = input.nextInt();

        int l = a << s ;
        System.out.println("Bitwise And of given two numbers is: " + l);
    }
}