import java.util.Scanner;

class DiscountOnBasisOfAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate you Discount percentage ");
        System.out.println("Are you a female? (true/false)");
        boolean gender = input.nextBoolean();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age <= 5) {
            System.out.println("You got 75% discount");
        } else if (gender){
            System.out.println("You got 50% discount");
        }else if (age >= 60){
            System.out.println("You got 30% discount");
        } else {
            System.out.println("You are not eligible for any discount");
        }

    }
}

