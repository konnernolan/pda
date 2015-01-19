package temperature;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        System.out.println("Input a temperature in degrees fahrenheit to convert to degrees celsius:");
	System.out.println("Note that input must be an integer");
        
        int input;
        float output;
        
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextInt( );
        output = input - 32;
        output = output * 5;
        output = output / 9;
        
        System.out.println(output + " degrees celcius");
        
                                

    }

}