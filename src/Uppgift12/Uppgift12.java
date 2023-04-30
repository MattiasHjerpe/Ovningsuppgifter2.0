package Uppgift12;

import java.sql.Array;
import java.util.Scanner;

public class Uppgift12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hur många slumpmässiga heltal? ");
        int antalTal = input.nextInt(), summan = 0, lagsta = 0, hogsta = 0;
        int[] arrayen = new int[antalTal];

        System.out.print("Arrayen är: ");
        for (int i = 0; i < arrayen.length; i++){
            arrayen[i] = 1 + (int)(Math.random() * 100);
            System.out.printf("%s ", arrayen[i]);
            summan += arrayen[i];
            if (i == 0){
                lagsta = arrayen[0];
                hogsta = arrayen[0];
            }
            lagsta = Math.min(lagsta, arrayen[i]);
            hogsta = Math.max(hogsta, arrayen[i]);
        }

        System.out.printf("%nTotalsumman är: %s", summan);
        System.out.printf("%nHögsta talet är: %s", hogsta);
        System.out.printf("%nLägsta talet är: %s", lagsta);
    }
}
