package Uppgift11;

import java.util.Scanner;

public class Uppgift11 {
    public static void main(String[] args) {
        menyn();
        }
    public static void menyn () {
        Scanner input = new Scanner(System.in);
        System.out.printf("Meny:%n1. Sågtand%n2. Sågtänder%n3. Sågtänder 2.0%n4. Avsluta%n%nVal: ");
        int val = input.nextInt();
        switch (val) {
            case 1:
                sagTand(input);
                break;
            case 2:
                sagTander(input);
                break;
            case 3:
                sagTander2(input);
                break;
            default:
                System.exit(0);
                break;

        }
    }

    public static void sagTand(Scanner input){
        System.out.print("Skriv in hur stor sågen ska vara: ");
        int langd = input.nextInt();
        String sagen = "*";
        for (int i = 0; i < langd; i++){
            System.out.println(sagen);
            sagen += "*";
        }
        fragaOmMenyn(input);
    }

    public static void sagTander(Scanner input){
        System.out.printf("%nSkriv in hur många rader varje sågtand ska ha: ");
        int rader = input.nextInt();
        System.out.printf("%nSkriv in hur många sågtänder sågen ska ha: ");
        int antalTrianglar = input.nextInt();
        System.out.println();

        for (int i = 0; i < antalTrianglar; i++){
            String sagen = "*";
            for (int y = 0; y < rader; y++){
                System.out.println(sagen);
                sagen += "*";
            }
        }
        fragaOmMenyn(input);
    }

    public static void sagTander2(Scanner input){
        System.out.printf("%nSkriv in hur många rader varje sågtand ska ha: ");
        int rader = input.nextInt();
        System.out.printf("%nSkriv in hur många sågtänder sågen ska ha: ");
        int antalTrianglar = input.nextInt();
        System.out.println();

        for (int i = 0; i < antalTrianglar; i++){
            String sagen = "_";
            for (int y = 0; y < rader; y++){
                System.out.println(sagen);
                sagen = "*" + sagen;
            }
        }
        fragaOmMenyn(input);
    }

    public static void fragaOmMenyn(Scanner input){
        System.out.printf("%nTillbaka till menyn? (J/N)");
        String tillbaka = input.nextLine().toLowerCase();
        tillbaka = input.nextLine().toLowerCase();
        if (tillbaka.equals("j")){
            menyn();
        }
    }
}
