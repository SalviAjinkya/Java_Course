import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base and Perpendicular Height of your triangle to get its area.");
        System.out.println("Base: ");
        double B = input.nextDouble();
        System.out.println("Perpendicular Height: ");
        double H = input.nextDouble();

        System.out.println("Area of Triangle is: " + (0.5*B*H));
    }
}
