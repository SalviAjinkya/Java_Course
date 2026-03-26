//create a program to swap two numbers

import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping Station");
        System.out.println("Enter value of A: ");
        int A = input.nextInt();
        System.out.println("Enter value of B; ");
        int B = input.nextInt();
        //dont need to use int again and again
        int C = A;
        A = B;
        B = C;
        System.out.println("Swapping of Numbers is done, now A=" + A + " and B=" + B);
    }
}
