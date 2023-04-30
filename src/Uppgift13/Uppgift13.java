package Uppgift13;

import java.util.Scanner;

public class Uppgift13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mata in ett heltal, eller 0 för att avsluta: ");
        int tal = input.nextInt(), summa = tal;
        String allaTalen = "";
        allaTalen += tal;
        while (tal != 0){
            System.out.print("Mata in ett heltal, eller 0 för att avsluta: ");
            tal = input.nextInt();

            if (tal == 0){
                break;
            }
            summa *= tal;
            allaTalen += (" " + tal);
        }
        System.out.printf("Summan av talen %s är %s", allaTalen, summa);
    }
}
