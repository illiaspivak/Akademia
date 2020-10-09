package sk.kosickaakademia.illiaspivak.pole;

public class Pole {
    /**
     * Vypocet arifmetickeho priemeru
     */
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        double average;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        average = sum/array.length;
        System.out.println(average);
    }
}
