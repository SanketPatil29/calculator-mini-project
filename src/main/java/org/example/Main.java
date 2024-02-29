package org.example;

import java.util.Scanner;
System.out.println("Scientific Calculator");
public class Main {
    public static void main(String[] args){
        while(true){
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Operations:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power of");            
            System.out.println("5. Quit");


            System.out.print("Enter the operation number: ");
            int operation = scanner.nextInt();

            if (operation == 5){
                System.out.println("Exiting the calculator.");
                System.exit(0);
            }

            System.out.print("Enter the number: ");
            double x = scanner.nextDouble();

            switch (operation) {
                case 1:
                    System.out.println("Square Root: " + calculator.squareRoot(x));
                    break;
                case 2:
                    System.out.println("Factorial: " + calculator.factorial(x));
                    break;
                case 3:
                    System.out.println("Natural Logarithm: " + calculator.naturalLogarithm(x));
                    break;
                case 4:
                    System.out.print("Enter the power: ");
                    double y = scanner.nextDouble();
                    System.out.println("Power of: " + calculator.power(x, y));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
