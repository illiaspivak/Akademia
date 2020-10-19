package sk.kosickaakademia.illiaspivak.cvicenie;

public class Cvik {
    public static void main(String[] args) {
        Cvik cvik = new Cvik();
        cvik.Pocet(200, 0.9);
        cvik.Skratka(12,24);

    }
    public void Skratka (int citatel, int menovatel){
        System.out.println("Mame povodny zlomok " + citatel + "/" + menovatel);
        int min = Math.min(citatel, menovatel);
        for (int i=min; i>0; i--){
            if(citatel%i==0 && menovatel%i==0){
                citatel=citatel/i;
                menovatel=menovatel/i;
            }
        }
        System.out.println("Mame vysledny zlomok " + citatel +"/" + menovatel);
    }

    public void Pocet (double vyska, double koeficient){
        double a = vyska;
        int i = 0;
        while (a>vyska/2){
            a=a*koeficient;
            i++;
        }
        System.out.println("Pocet odrazov " + i);
    }
}
