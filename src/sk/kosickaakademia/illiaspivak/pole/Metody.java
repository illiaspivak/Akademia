package sk.kosickaakademia.illiaspivak.pole;

import java.util.Random;

public class Metody {
    public static void main(String[] args) {
        int[][] arr = new int[][]{ {-2,4,9,0},{0,15,2,13},{-17,-6,8,0}};
        changeArray(arr);
    }


    public static void changeArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                int cislo = arr[i][j];
                if (cislo < 0){
                    cislo = modul(cislo);
                }
                else if (cislo > 0 && cislo%2!=0){
                    cislo = neparne(cislo);
                }
                else{
                    cislo = nulky(cislo);
                }
                arr[i][j] = cislo;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int modul(int cislo){
        cislo = -cislo;
        return cislo;
    }

    public static int neparne(int cislo){
        int sameNum = cislo;
        int find = sameNum/10;
        if (cislo>10)
            cislo = (find%2==0)?cislo-1:cislo+1;
        return cislo;
    }

    public static int nulky(int cislo){
        Random rnd = new Random();
        if (cislo == 0){
            cislo = (int) (rnd.nextInt(89)+10);
        }
        return cislo;
    }
}
