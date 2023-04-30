package Uppgift18;

import java.util.Scanner;

public class Uppgift18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vad har du för jobb? Receptinist(R), Officer(O) eller Chef(C)");
        String val = input.nextLine();
        switch(val) {
            case "R":
                mySalary(10000, input);
                break;
            case "O":
                mySalary(17000, input);
                break;
            case "C":
                mySalary(23000, input);
                break;
            default:
                // code block
        }
    }

    public static void mySalary(int extraLon, Scanner input){
        System.out.println("Hur många timmar extra har du jobbat den här månaden?(0-24)");
        int ob = input.nextInt();
        while (ob < 0 || ob > 24){
            System.out.println("Ange en siffra mellan 0-24");
            ob = input.nextInt();
        }
        int lon = 15000 + extraLon + (int)(ob * 0.04 * extraLon);
        System.out.printf("Din lön för förra månaden är: %s", lon);
    }
}
