import java.util.Scanner;

 class BitwiseSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of A: ");
        int a = input.nextInt();
        System.out.println("Enter value of B: ");
        int b = input.nextInt();

        System.out.println("Before swap: A = " + a + ", B = " + b);

        if (a != b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("After swap: A = " + a + ", B = " + b);
        } else {
            System.out.println("Numbers are already equal, no swap needed!");
        }
    }
}