import java.util.Scanner;

class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise Right Shift calculator....");
        System.out.println("By how much you want Right Shift?");
        int s = input.nextInt();
        System.out.println("Enter number to get its Bitwise Right Shift:");
        int a = input.nextInt();

        int r = a >> s ;
        System.out.println("Bitwise And of given two numbers is: " + r);
    }
}