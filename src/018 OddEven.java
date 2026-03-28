import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check whether given number is even or odd");
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Given number is Even");
            } else {
                System.out.println("Given number is Odd");
            }
        } else {
            System.out.println("Given number is zero");
        }
    }
}