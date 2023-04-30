package Uppgift6;

import java.util.Scanner;

public class Uppgift6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in ett tal: ");
        int tal = input.nextInt();
        int totalen = 0;

        for (int i = 0; i <= tal; i++){
            if ((i % 2) == 0){
                totalen += i;
            }
        }
        System.out.printf("Totalen av alla jämna tal upp till %s är %s", tal, totalen);
    }
}
