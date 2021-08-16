//package helloworld;
import java.util.Scanner;
import java.lang.Math;

public class WelcomeJava
{
	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		System.out.println("Welcome to Java");
		int a = 3;
		int b = 4;
		int c = 5;
		System.out.println(b^2 - 4*a*c);

		//auto close scanner
		try (Scanner scanner = new Scanner(System.in))
		{
			System.out.println("Enter the width of the rectangle: ");
			double width = scanner.nextDouble(); //get width

			System.out.println("Enter the height of the rectangle: ");
			double height = scanner.nextDouble(); //get height

			double perimeter = (2*width) + (2*height);
			double area = width*height;
			double diagonal = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));

			System.out.println("The perimeter is " + perimeter);
			System.out.println("The area is " + area); 
			System.out.println("The length of the diagonal is " + diagonal);

			System.out.println("Enter the final account value: ");
			int finalAccountValue = scanner.nextInt();

			System.out.println("Enter the annual interest rate in percent: ");
			double annualInterestRate = scanner.nextDouble();

			System.out.println("Enter the number of years: ");
			int numberOfYears = scanner.nextInt();

			double monthlyInterestRate = annualInterestRate/1200;
			int numberOfMonths = 12*numberOfYears;

			double initalDepositAmount = finalAccountValue / Math.pow((1+ monthlyInterestRate), numberOfMonths);

			System.out.println("The initial deposit amount is " + initalDepositAmount);
		}
	}
}
