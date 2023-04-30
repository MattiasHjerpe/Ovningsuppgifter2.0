package Uppgift4;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in ett tal: ");
        int tal = 0;
        tal = input.nextInt();
        int kvadraten = tal * tal;
        System.out.printf("Kvadraten av %s är %s", tal, kvadraten);
    }
}
