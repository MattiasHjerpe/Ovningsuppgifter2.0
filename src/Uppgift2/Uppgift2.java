package Uppgift2;

import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String textTal[] = {"första", "andra", "tredje"};
        int tal1 = 0, tal2 = 0, tal3 = 0;

        for (int i = 0; i < 3; i++){
            System.out.printf("Mata in det %s talet: ", textTal[i]);
            if (i==0){
                tal1 = input.nextInt();
            } else if (i==1){
                tal2 = input.nextInt();
            } else {
                tal3 = input.nextInt();
            }
        }
        System.out.println("Totalen är: " + (tal1*tal2*tal3));
        hogstaTalet(tal1, tal2, tal3);
    }

    public static void hogstaTalet (int tal1, int tal2, int tal3){
        int hogsta;
        hogsta = Math.max(tal1, tal2);
        hogsta = Math.max(hogsta, tal3);
        System.out.println("Det högsta talet är: " + hogsta);
    }
}
