package weekly2Homework;

import java.util.Scanner;

public class Employee_Main {
    public static void main (String [] args){

        System.out.println("Enter the year you worked at this company: ");
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();

        Employee employee = new Employee();

        employee.year = year;
        employee.raise();


    }
}
