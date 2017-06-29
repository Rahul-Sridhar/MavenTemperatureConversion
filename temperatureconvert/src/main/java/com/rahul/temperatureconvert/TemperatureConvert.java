package com.rahul.temperatureconvert;

public class TemperatureConvert
{
	public double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit-32)*5/9;
	}
	
	public double celsiusToFahrenheit(double celsius)
	{
		return (celsius*9/5)+32;
	}	
}
