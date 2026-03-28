import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your percentage to know your grade: ");
        int grade = input.nextInt();

        if ( grade <=100 && grade>=0){
            if (grade >= 90){
                System.out.println("Your Grade is A");
            } else if (grade >= 75){
                System.out.println("Your Grade is B");
            } else if(grade>=60){
                System.out.println("Your Grade is C");
            } else if(grade>=30){
                System.out.println("Your Grade is D");
            } else{
                System.out.println("Your Grade is F");
            }
        } else {
            System.out.println(" Please enter valid percentage!!");
        }
    }
}
