package Uppgift8;

import java.util.Scanner;

public class Uppgift8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in ett tal: ");
        int tal = input.nextInt();
        int uppTal = 1;

        if (tal < 1){
            System.exit(0);
        }
        do {
            if (uppTal<10){
                System.out.printf("%n0%s Hej!", uppTal);
            } else{
                System.out.printf("%n%s Hej!", uppTal);
            }
            uppTal++;
        } while (uppTal <= tal);
    }
}
