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
        System.out.print("introdu nr 1 de preferabil 10: ");
        int nr1 = scanner.nextLine();

        //citesc al doilea numar
        System.out.print("introdu nr 2 de preferabil 3: ");
        int nr2 = scanner.nextLine();


        System.out.println("rezultatul= " + nr1/nr2);


    }

}
