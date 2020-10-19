package sk.kosickaakademia.illiaspivak.homework;

public class Homework {
    public static void main(String[] args) {
        Homework homework = new Homework();
        homework.Tekst("SKOLA");
        homework.Delenie91();
        homework.SumaZlomok(100);
        homework.Vypis();

    }
    public void Tekst(String text){
        int n = text.length();
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(text.charAt(j));
            }
            System.out.println();
        }
    }

    public void Delenie91(){
        int result=0;
        for(int i=0; i<=9; i++){
            for(int j=0; j<=9; j++){
                result=807502+i*10000+j*10;
                if(result%91==0){
                    System.out.println(result);
                }
            }
        }

    }

    public void SumaZlomok(int cislo){
        double suma = 0;
        for (int i=1; i<=cislo; i++){
            suma = suma + 1.0/i;
        }
        System.out.println(suma);
    }
    public void Vypis(){
        int i;
        for (i=65; i<90; i++){
            System.out.print((char)i + " ");
        }
    }
}
