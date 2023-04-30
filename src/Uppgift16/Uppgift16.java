package Uppgift16;

import java.util.Scanner;

public class Uppgift16 {
    static int antalVinster, antalGissningar, hogstaGissning = 0, lagstaGissning = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        meny(input);
    }

    public static void meny(Scanner input){
        System.out.printf("%n1. Spela%n2. Statistik%n3. Avsluta%n");
        int val = input.nextInt();
        switch (val) {
            case 1:
                spela(input);
                break;
            case 2:
                statistik(input);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;

        }
    }

    public static void spela(Scanner input){
        int hemligtNummer = 1+(int)(Math.random()*100);

        System.out.print("Det hemliga talet är mellan 0-100, skriv in din gissning: ");
        int gissning = input.nextInt();
        antalGissningar++;
        lagstaGissning = gissning;
        hogstaGissning = gissning;

        while (gissning != hemligtNummer){
            System.out.print("Tyvärr, du gissade fel,");
            if (gissning > hemligtNummer){
                System.out.print(" din gissning var högre än det hemliga talet.");
            } else {
                System.out.print(" din gissning var lägre än det hemliga talet.");
            }
            lagstaGissning = Math.min(lagstaGissning, gissning);
            hogstaGissning = Math.max(hogstaGissning, gissning);

            System.out.printf("%n%nGissa igen: ");
            gissning = input.nextInt();
            antalGissningar++;
        }
        System.out.println("Grattis, du gissade rätt. Det hemliga talet var: " + hemligtNummer);
        antalVinster++;
        meny(input);
    }

    public static void statistik(Scanner input){
        System.out.printf("Antal vinster: %s%nAntal Gissningar: %s%nHögsta gissningen: %s%nLägsta gissningen: %s",
                antalVinster, antalGissningar, hogstaGissning, lagstaGissning);
        meny(input);
    }
}
