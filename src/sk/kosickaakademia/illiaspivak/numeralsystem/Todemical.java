package sk.kosickaakademia.illiaspivak.numeralsystem;

import java.util.Scanner;

public class Todemical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte v ktorek sustave bude zadane cislo");
        int cislo;
        int number;
        String number1 = "CAC";
        do {
            System.out.print("Napiste 2, alebo, 8, alebo 16: ");
            cislo=sc.nextInt();
        }while(cislo!=2 && cislo != 8 && cislo!=16);
        System.out.print("Napiste cislo: ");
        number=sc.nextInt();

        int result;
        Prechod prechod=new Prechod();
        switch(cislo){
            case 2: result = prechod.convertBinaryToDecimal(number);
                System.out.println(result);
                break;
            case 8: result = prechod.convertOctalToDecimal(number);
                System.out.println(result);
                break;
            case 16: result = prechod.convertHexToDecimal(number1);
                System.out.println(result);

        }



    }
}
