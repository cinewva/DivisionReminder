package com.itfactory;

import java.util.Scanner;


/*
Problem 4. 
Create a Java project in which you have the following default package: "com.itfactory".
➔ Create a class (you will choose the name) in which you have a main method.
➔ The requirement is to read two numbers from the keyboard and display the remainder of their division.
Example: If we read 10 and 3, the remainder of dividing 10 by 3 will be 1. (You can look up division by remainder to understand the remainder of division).
 */
public class Main {


    public static void main(String[] args) {

        //citesc primul numar
        System.out.print("enter first number: ");
        int nr1 = scanner.nextLine();

        //citesc al doilea numar
        System.out.print("enter second number: ");
        int nr2 = scanner.nextLine();


        System.out.println("The remainder % of the division bertween " + nr1 + " and " + nr2 + nr1 % nr2);


    }

}
