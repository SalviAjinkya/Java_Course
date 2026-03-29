import java.util.Scanner;

class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to get its Bitwise Left Shift by 1:");
        int a = input.nextInt();

        int l = a << 1 ;
        System.out.println("Bitwise And of given two numbers is: " + l);
    }
}