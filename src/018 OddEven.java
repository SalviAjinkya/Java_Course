import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check whether given number is even or odd");
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("Given number is Even");
        } else if (num==0) {
            System.out.println("Given number is neither Even nor Odd (its zero)");
        } else {
            System.out.println("Given number is Odd");
        }
    }
}
