package Uppgift10;

import java.util.Map;
import java.util.Scanner;

public class Uppgift10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hemligtNummer = 1+(int)(Math.random()*100);

        System.out.printf("Det hemliga talet är mellan 0-100, skriv in din gissning: ");
        int gissning = input.nextInt();

        while (gissning != hemligtNummer){
            System.out.printf("Tyvärr, du gissade fel,");
            if (gissning > hemligtNummer){
                System.out.print(" din gissning var högre än det hemliga talet.");
            } else {
                System.out.print(" din gissning var lägre än det hemliga talet.");
            }
            System.out.printf("%n%nGissa igen: ");
            gissning = input.nextInt();
        }
        System.out.println("Grattis, du gissade rätt. Det hemliga talet var: " + hemligtNummer);
    }
}
