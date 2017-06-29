package com.rahul.temperatureconvert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TemperatureConvert tc=new TemperatureConvert();
        System.out.println("C to F"+tc.celsiusToFahrenheit(20));
        System.out.println("F to C"+tc.fahrenheitToCelsius(20));
    }
}
