package Uppgift14;

import java.util.Scanner;

public class Uppgift14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in texten som ska krypteras: ");
        String textInput = input.nextLine();
        char[] text = new char[textInput.length()];

        System.out.printf("Krypterad text: ");
        for (int i = 0; i < text.length; i++){
            text[i] = textInput.charAt(i);
            text[i] += 3;
            System.out.print(text[i]);
        }
    }
}