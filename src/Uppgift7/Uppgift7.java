package Uppgift7;

import java.util.Scanner;

public class Uppgift7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in ett tal att räkna ner ifrån: ");
        int tal = input.nextInt();

        for (int i = tal; i >= 0; i--){
            System.out.println(tal);
            tal--;
        }

    }


}
