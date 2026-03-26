import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Compound Interest(SI) Calculator....");
        System.out.println("To calculate CI we need Principal amount, Time is years and Rate of interest");
        System.out.println("Please Enter Principal amount: ");
        double P = input.nextDouble();
        System.out.println("Please Enter, for how many years have you borrowed for(Time in years): ");
        double T = input.nextDouble();
        System.out.println("Please Enter Rate of Interest: ");
        double R = input.nextDouble();

        double CI = P * Math.pow((1+R/100), T);
        System.out.println("Simple Interest is equal t: " + CI);
    }
}
