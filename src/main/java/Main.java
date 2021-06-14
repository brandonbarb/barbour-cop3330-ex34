/*
 *  UCF COP3330 Summer 2021 Assignment 34 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int count = employees.length;
        System.out.printf("There are %d employees:\n", count);
        for (int i = 0; i <= count - 1; i++) {
            System.out.printf("%s\n", employees[i]);
        }
        System.out.print("Enter an employee name to remove: ");
        Scanner input = new Scanner(System.in);
        String remove = input.nextLine();
        count = count - 1;
        System.out.printf("There are %d employees:\n", count);
        for (int i = 0; i <= count; i++) {
            if (employees[i].equals(remove)) {
                employees[i] = "";
            }
            else {
                System.out.printf("%s\n", employees[i]);
            }
        }
    }
}
