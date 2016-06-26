/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infonep;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber, secondNumber, result;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        
        while(true){
        
        System.out.println("Choose from the above: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the First Number: ");
                firstNumber = input.nextInt();
                System.out.println("Enter the Second Number: ");
                secondNumber = input.nextInt();

                result = firstNumber + secondNumber;
                System.out.println("The Addition : " + result);

                break;
            case 2:
                System.out.println("Enter the First Number: ");
                firstNumber = input.nextInt();
                System.out.println("Enter the Second Number: ");
                secondNumber = input.nextInt();

                result = firstNumber - secondNumber;
                System.out.println("The subtraction : " + result);
                break;
            case 3:
                System.out.println("Enter the First Number: ");
                firstNumber = input.nextInt();
                System.out.println("Enter the Second Number: ");
                secondNumber = input.nextInt();

                result = firstNumber * secondNumber;
                System.out.println("The Multiplication : " + result);
                break;
            case 4:
                System.out.println("Enter the First Number: ");
                firstNumber = input.nextInt();
                System.out.println("Enter the Second Number: ");
                secondNumber = input.nextInt();

                result = firstNumber / secondNumber;
                System.out.println("The Division : " + result);
                
                break;
        }
            System.out.println("Do you want to continoue") ;
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
    }
}
