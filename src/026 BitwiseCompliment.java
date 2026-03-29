import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to get its Bitwise Compliment:");
        int a = input.nextInt();

        int c = ~ a ;
        System.out.println("Bitwise And of given two numbers is: " + c);
    }
}