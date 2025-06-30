package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membership = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (!(membership.equalsIgnoreCase("Regular") || membership.equalsIgnoreCase("VIP") || membership.equalsIgnoreCase("Premium"))){
            System.out.println("Invalid membership status entered.");
            return;
        }

        if (age < 0) {
            return;
        }

        double price = 0.00;
        if (membership.equalsIgnoreCase("Regular")) price = age < 18 ? 50: age >= 18 && age <= 64 ? 100: 75;
        else if (membership.equalsIgnoreCase("VIP")) price = age < 18 ? 75: age >= 18 && age <= 64 ? 150: 112.5;
        else if (membership.equalsIgnoreCase("Premium")) price = age < 18 ? 100: age >= 18 && age <= 64 ? 200: 150;

        System.out.printf("Price: $%.2f%n", price);

    }
}