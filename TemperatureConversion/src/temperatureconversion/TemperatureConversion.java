/*
 * Program: TemperatureConvertion
 * Date: 3/7/2019
 * Programmer: Austin Goff 19004941
 * Description: This program demonstrates the conversion of Fahrenheit to 
Celsius
 */

package temperatureconversion;
import java.util.Scanner;

public class TemperatureConversion { 
    static double dblFahrenheit;
    static double dblCelsius;
    
    public static void main(String[] args) {
        ReadTemperature();
        CalculateConversion();
        PrintCelsius();
    }
    
    public static void ReadTemperature() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        dblFahrenheit = sc.nextDouble();
        

    }
    
    public static void CalculateConversion() {
        dblCelsius = (dblFahrenheit - 32) / 1.8;
        
    }
    
    public static void PrintCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println(dblFahrenheit + " degrees F is " + dblCelsius + " degrees C.");
    }
}
