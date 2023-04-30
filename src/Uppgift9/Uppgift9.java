package Uppgift9;

import java.util.Scanner;

public class Uppgift9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your age: ");
        int age = input.nextInt();

        if (age >= 65)
        System.out.println("Age is greater than or equal to 65");
        else
            System.out.println("Age is less than 65");

        int x = 1, total = 0;
        while (x <= 10){
            total += x;
            ++x;
        }
        System.out.println("Totalen i del b är: " + total);

        total = 0;
        while (x <= 100){
            total += x;
            ++x;
        }
        System.out.println("Totalen i del c är: " + total);

        int y = 5;
        while (y > 0){
            System.out.println(y);
            --y;
        }
    }

}
