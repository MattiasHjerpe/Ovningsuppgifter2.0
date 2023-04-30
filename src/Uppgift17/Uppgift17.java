package Uppgift17;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Uppgift17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cashier(input);
    }

    public static void cashier(Scanner input){
        ArrayList <Artikel> kopeLista = new ArrayList<>();
        System.out.print("Hur många mjölpaket?");
        int antal = input.nextInt(), summa = 0;
        for (int i = 0; i < antal; i++){
            Artikel artikel = new Artikel("mjöl", 1, 15);
            kopeLista.add(artikel);
        }
        /*
        System.out.print("Hur många påsar socker?");
        for (int i = 0; i < antal; i++){
            Artikel artikel = new Artikel("socker", 1, 12);
            kopeLista.add(artikel);
        }
*/

        String[][] kvitto = new String[Artikel.antalInstanser+1][3];
        kvitto[0][0] = "Artikelnamn |";
        kvitto[0][1] = "Kvantitet |";
        kvitto[0][2] = "á Styckpris |";
        for (int i = 1; i < (Artikel.antalInstanser+1); i++){
            int k = 0;
            for(int y = 0; y < 3; y++){
                if (y == 0){
                    kvitto[i][y] = kopeLista.get(k).getArtikelNamn();
                } else if (y == 1){
                    kvitto[i][y] = "         " + kopeLista.get(k).getKvantitet();
                } else {
                    kvitto[i][y] = "          " + kopeLista.get(k).getPrisPerArtikel() + ":-";
                }
                k++;
            }
        }

        for (String[] i : kvitto){
            System.out.println(Arrays.toString(i));
        }
    }
}
