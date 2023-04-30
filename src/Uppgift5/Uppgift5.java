package Uppgift5;

import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double dagsKurs = 0.090;

        System.out.println("Ange ny dagskurs? (J/N)");
        String svar = input.nextLine();

        if (svar.equals("J")){
            System.out.println("Ange den uppdaterade dagskursen: ");
            dagsKurs = input.nextDouble();
        }

        System.out.println("Ange pris i SEK: ");
        int prisSek = input.nextInt();
        System.out.printf("Priset för %s SEK är %s EURO", prisSek, (int)(prisSek*dagsKurs));
    }
}
