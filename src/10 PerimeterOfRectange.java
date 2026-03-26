import java.util.Scanner;

class PerimeterOfRectange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter lengths of all 4 sides of Rectange to get its perimeter: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        System.out.println("Perimeter of your given rectangle is : " + (a+b+c+d));
    }
}
