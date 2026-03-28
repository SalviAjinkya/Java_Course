import java.util.Scanner;

class GenderTitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is name?");
        String name = input.next();

        System.out.println("Is " + name + " male?");
        System.out.println("Please answer 1 if true or 2 if false:");
        int option = input.nextInt();

        boolean male = false;
        boolean isValid = true;

        if (option == 1) {
            male = true;
        } else if (option == 2) {
            male = false;
        } else {
            System.out.println("Enter valid input");
            isValid = false;
        }

        System.out.println("before if");
        if (isValid) {
            if (male) {
                System.out.println("Mr." + name);
            } else {
                System.out.println("Mrs." + name);
            }
            System.out.println("after if");
        }
    }

}
