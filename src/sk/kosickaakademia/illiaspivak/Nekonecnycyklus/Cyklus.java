package sk.kosickaakademia.illiaspivak.Nekonecnycyklus;

import java.util.Scanner;

public class Cyklus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int b;
        number = sc.nextInt();
        int[] a = new int[100];
        int i = 0;
        a[0] = number;
        b = number;
        while (0 < 1) {
            i++;
            number = sc.nextInt();
            a[i] = number;
            if (number == b) {
                break;
            } else {
                b = number;
            }

        }
        for (int j = 0; j < i + 1; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
