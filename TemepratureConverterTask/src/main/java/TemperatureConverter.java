import java.util.Scanner;

public class TemperatureConverter {

    private double temperatureInCelsius;
    private double temperatureInFahrenheit;
    private double temperatureInKelvin;


    public double fahrenheitToCelsius(double temperatureInf) {
        temperatureInCelsius = (temperatureInf - 32) * 5/9;
        return temperatureInCelsius;
    }

    public double celsiusToFahrenheit(double temperatureInC){
        temperatureInFahrenheit = (temperatureInC * 9/5) + 32;
        return temperatureInFahrenheit;
    }

    public boolean isExtremeTemperature(double temperatureInC) {
        // A temperature is considered extreme if it is:
        // Below -40°C, or
        // Above 50°C.
        if(temperatureInC < -40 || temperatureInC > 50){
            return true;
        } else {
            return false;
        }
    }

    public double KelvinToCelsius(double temperatureInK){
        temperatureInCelsius = (temperatureInK - 273.15);
        return temperatureInCelsius;
    }

    public static void main(String[] args){

        TemperatureConverter converter = new TemperatureConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        switch(choice){
            case 1 -> {
                System.out.println("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.printf("%.1f C = %.1f F ", celsius, converter.celsiusToFahrenheit(celsius));
            }
            case 2 -> {
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.printf("%.1f F = %.1f C \n", fahrenheit, converter.fahrenheitToCelsius(fahrenheit));

                System.out.println("Is the temperature extreme? " + converter.isExtremeTemperature(fahrenheit));
            }
            default -> System.out.println("Invalid choice");
        }

    }
}
