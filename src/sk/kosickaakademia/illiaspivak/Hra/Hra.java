package sk.kosickaakademia.illiaspivak.Hra;

import java.util.Scanner;

public class Hra {
    public static void main(String[] args) {
        Hra hra = new Hra();
        hra.Number(100);
        hra.nasobilka(10);

    }
    public void Number(int max){
        Scanner sc=new Scanner(System.in);
        int pokus = 0;
        System.out.println("Vitalte! Uhadni si cislo od 1 az "+max + "Mas 8 pokusov");
        int number=(int)(Math.random()*max +1);
        int result;

        do{
            System.out.print("Napis cislo ");
            result = sc.nextInt();
            pokus++;
            System.out.println("Pokus " + pokus);
            if(result==number)
                System.out.println("Super, vyhral si!");
            else if(result<number){
                System.out.println("Skus viac");
            }
            else
                System.out.println("Skus menej");

            if(pokus>8) {
                System.out.println("Prehral si");
                break;
            }

        }
        while(result!=number);
    }

    public void nasobilka(int max){
        Scanner sc=new Scanner(System.in);

        System.out.println("Vitajte! Skontrolujeme vase matematicke skusenosti");
        System.out.println("To je hra: Kolko bude a * b");
        int kontrol=0;
        for (int i = 0; i<10; i++) {
            int a = (int) (Math.random() * max + 1);
            int b = (int) (Math.random() * max + 1);
            System.out.println("Kolko bude " + a + "*" + b + "?");
            int c = sc.nextInt();
            if(a*b==c){
                kontrol++;
            }
        }
        System.out.println("Vas resultat " + kontrol*10 + "%");
    }
}
