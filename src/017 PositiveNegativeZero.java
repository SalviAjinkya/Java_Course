import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check whether the given number is positive, negative or zero");
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("Given number is zero");
        } else if ( num > 0){
            System.out.println("Given number is positive");
        } else {
            System.out.println("Given number is negative");
        }
    }
}

