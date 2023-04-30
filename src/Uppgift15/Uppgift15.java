package Uppgift15;

import java.util.Arrays;
import java.util.Scanner;

public class Uppgift15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namn = new String[3];
        String[] namn2 = new String[3];
        int count = 0;

        System.out.print("Skriv in första namnet: ");
        namn[0] = input.nextLine();
        System.out.print("Skriv in andra namnet: ");
        namn[1] = input.nextLine();
        System.out.print("Skriv in tredje namnet: ");
        namn[2] = input.nextLine();

        for (int i = 0; i < namn.length; i++){
            if(!Arrays.asList(namn2).contains(namn[i])){
                namn2[i] = namn[i];
            }
            count++;
        }
        
        String[] namnKlar = new String[count];
        for (int i = 0; i < namn2.length; i++){
            if(!Arrays.asList(namnKlar).contains(namn[i])){
                namnKlar[i] = namn[i];
                System.out.println(namnKlar[i]);
            }
        }
    }
}
