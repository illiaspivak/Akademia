package sk.kosickaakademia.illiaspivak.numeralsystem;

import java.util.Scanner;

public class Numeralsystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Napiste cislo: ");
            number=sc.nextInt();
        }while(number<0);
        int cislo;
        do {
            System.out.print("Napiste 2, alebo, 8, alebo 16: ");
            cislo=sc.nextInt();
        }while(cislo!=2 && cislo != 8 && cislo!=16);

        String result="";
        Prechod prechod=new Prechod();
        switch(cislo){
            case 2: result = prechod.DecToBinary(number);
                break;
            case 8: result = prechod.DecToOctal(number);
                break;
            case 16: result = prechod.DecToHex(number);

        }
        System.out.println("Result: "+result);
    }
}
