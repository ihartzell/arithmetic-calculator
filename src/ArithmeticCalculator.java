// Isaac Hartzell
// January 20th, 2016
// This program demonstrates a basic calculator that can add, subtract, divide, or multiply, two numbers.

import java.util.Scanner;
public class ArithmeticCalculator 
{
	
	public static void main(String[] args) // TODO Auto-generated method stub
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Generate Random Number \n");
		
		System.out.print("What would you like to do? Pick a number 1-5:");
		int numberChoice = input.nextInt(); 									
		if (numberChoice < 1 || numberChoice > 5)	// validation for menu.
		{
			System.out.println("I'm sorry," + numberChoice + " wasn't one of the options.");
		}
		else if (numberChoice == 1)
		{
			System.out.print("What is the first number?");
			double firstNum = input.nextDouble();
			System.out.print("What is the second number?");
			double secondNum = input.nextDouble();
			System.out.println("Answer:" + (firstNum + secondNum));
		}
		else if (numberChoice == 2)
		{
			System.out.print("What is the first number?");
			double firstNum = input.nextDouble();
			System.out.print("What is the second number?");
			double secondNum = input.nextDouble();
			System.out.println("Answer:" + (firstNum - secondNum));
			
		}
		else if (numberChoice == 3)
		{
			System.out.print("What is the first number?");
			double firstNum = input.nextDouble();
			System.out.print("What is the second number?");
			double secondNum = input.nextDouble();
			System.out.println("Answer:" + (firstNum * secondNum));
		}
		else if (numberChoice == 4)
		{
			System.out.print("What is the first number?");
			double firstNum = input.nextDouble();
			System.out.print("What is the second number");
			double secondNum = input.nextDouble();
			if (secondNum == 0)
			{
				System.out.println("I'm sorry, you can't divide by zero making this undefined");
			}
			System.out.println("Answer:" + (firstNum / secondNum));
		}
		else if (numberChoice == 5)
		{
			System.out.print("What is the lower limit?");
			double lowerLim = input.nextDouble();
			System.out.print("What is the upper limit?");
			double upperLim = input.nextDouble();
			System.out.println("Answer:" + (Math.random() * (upperLim - lowerLim) + (lowerLim)));
		}
	}

}
