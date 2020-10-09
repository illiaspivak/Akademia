package sk.kosickaakademia.illiaspivak.pole;

public class Pole {
    /**
     * Vypocet arifmetickeho priemeru
     */
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        double average;
        int sum = 0;
        System.out.print("Pole Array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
            sum = sum + array[i];
        }
        System.out.println();
        average = sum/array.length;
        System.out.println("Priemer pola Array: " +average);
        /**
         * Hladame minimum pola
         */
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Minimum pola Array: " + min);
        /**
         * Hladame parne a neparne cisla
         */
        int paired = 0;
        int unpaired = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                paired++;
            }
            if(array[i]%2!=0){
                unpaired++;
            }
        }
        System.out.println("Parnych cisel je: " + paired);
        System.out.println("Nepatmych cisel je: " + unpaired);
        /**
         * Hladame zaporne a kladne cisla
         */
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                positive++;
            }
            if(array[i]<0){
                negative++;
            }
        }
        System.out.println("Kladnych cisel je: " + positive);
        System.out.println("Zapornych cisel je: " + negative);
        /**
         * Vytvotime pole, ktore bude opacnym
         */
        int [] reserve = new int [array.length];
        System.out.print("Opacne pole (Reserve): ");
        for (int i = 0; i < array.length; i++){
            reserve[i]=array[array.length-1-i];
            System.out.print(reserve[i] + ", ");
        }
        System.out.println();
        /**
         * Vytvorime pole s randomnmi cislami
         */
        int [] random = new int[array.length];
        System.out.print("Pole random: ");
        for (int i =0; i<array.length; i++){
            random[i] = (int)(Math.random()*100);
            System.out.print(random[i] + " ");
        }
        System.out.println();
        /**
         * Suma dvoch poli
         */
        int [] suma = new int [array.length];
        System.out.print("Suma Array a Random: ");
        for(int i=0; i<array.length; i++){
            suma[i]=array[i]+random[i];
            System.out.print(suma[i] + ", ");
        }
        System.out.println();

    }
}
