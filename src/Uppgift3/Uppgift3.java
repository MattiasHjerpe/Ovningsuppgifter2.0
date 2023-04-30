package Uppgift3;

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in köpesumma: ");
        int kopeSumma = 0;
        kopeSumma = input.nextInt();

        if (kopeSumma >= 1000){
            kopeSumma *= 0.9;
            System.out.println("Du får 10% rabatt, betalsumman är: " + kopeSumma + ":-");
        } else {
            System.out.println("Du får betala fullpris, betalsumman är: " + kopeSumma + ":-");
        }

        while (kopeSumma != 0){
            double rabatt = 0;
            System.out.println("Mata in din rabatt i %: ");
            rabatt = input.nextInt();

            System.out.println("Mata in ditt betalbelopp(0 för att avsluta): ");
            kopeSumma = input.nextInt();
            if (kopeSumma == 0){
                break;
            }

            System.out.println("Din rabatt är: " + rabatt + "%.");
            rabatt = (100 - rabatt)/100;
            System.out.println(rabatt);
            kopeSumma *= rabatt;
            System.out.println("Ditt betalbelopp blir då: " + kopeSumma + ":-");
        }

    }
}
