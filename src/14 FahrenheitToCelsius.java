import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fahrenheit to Celsius Convertor");
        System.out.println("Please enter temperature in Fahrenheit: ");
        float F = input.nextFloat();

        float C = (F - 32) * 5.0f / 9.0f;
        System.out.println("Temperature in celsius is: " + C);
    }
}
