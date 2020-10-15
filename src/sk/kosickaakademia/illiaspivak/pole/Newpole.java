package sk.kosickaakademia.illiaspivak.pole;

public class Newpole {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int paired = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                paired++;
            }
        }
        int[] newArray = new int[paired];
        int n =0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                newArray[n]=array[i];
                System.out.print(newArray[n] + ", ");
                n++;
            }
        }


    }
}
