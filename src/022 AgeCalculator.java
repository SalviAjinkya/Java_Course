import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age to know your age group: ");
        int age = input.nextInt();

        if (age>0){
            if(age<13){
                System.out.println("You are a child.");
            }else if (age<20){
                System.out.println("You are a teen.");
            }else if (age<=60){
                System.out.println("You are a adult.");
            }else{
                System.out.println("You are a senior citizen.");
            }
        } else{
            System.out.println("Invalid age");
        }
    }
}
