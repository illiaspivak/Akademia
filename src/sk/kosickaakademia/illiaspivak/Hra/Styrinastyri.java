package sk.kosickaakademia.illiaspivak.Hra;

import java.util.Scanner;

public class Styrinastyri {
    private int[][] pole;
    private int player=1;
    private int count=0;

    public Styrinastyri() {
        pole=new int[5][5];
        initArray();
    }

    private void initArray() {
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                pole[i][j]=0;
    }

    public int isWinner(){  // return 0 or 1 or 2
        int i;
        for(i=0;i<5;i++ ){
            if(pole[i][0]*pole[i][1]*pole[i][2]*pole[i][3]==1 || pole[i][1]*pole[i][2]*pole[i][3]*pole[i][4]==1)
                return 1;
            if(pole[0][i]*pole[1][i]*pole[2][i]*pole[3][i]==1 || pole[1][i]*pole[2][i]*pole[3][i]*pole[4][i]==1)
                return 1;
            if(pole[i][0]*pole[i][1]*pole[i][2]*pole[i][3]==16 || pole[i][1]*pole[i][2]*pole[i][3]*pole[i][4]==16)
                return 2;
            if(pole[0][i]*pole[1][i]*pole[2][i]*pole[3][i]==16 || pole[1][i]*pole[2][i]*pole[3][i]*pole[4][i]==16)
                return 2;
            if(pole[i][0]*pole[i][1]*pole[i][2]*pole[i][3]==81 || pole[i][1]*pole[i][2]*pole[i][3]*pole[i][4]==81)
                return 3;
            if(pole[0][i]*pole[1][i]*pole[2][i]*pole[3][i]==81 || pole[1][i]*pole[2][i]*pole[3][i]*pole[4][i]==81)
                return 3;
        }
        if(pole[0][0]*pole[1][1]*pole[2][2]*pole[3][3]==1 || pole[1][1]*pole[2][2]*pole[3][3]*pole[4][4]==1)
            return 1;
        if(pole[0][4]*pole[1][3]*pole[2][2]*pole[3][1]==1 || pole[1][3]*pole[2][2]*pole[3][1]*pole[4][0]==1)
            return 1;
        if(pole[0][0]*pole[1][1]*pole[2][2]*pole[3][3]==16 || pole[1][1]*pole[2][2]*pole[3][3]*pole[4][4]==16)
            return 2;
        if(pole[0][4]*pole[1][3]*pole[2][2]*pole[3][1]==16 || pole[1][3]*pole[2][2]*pole[3][1]*pole[4][0]==16)
            return 2;
        if(pole[0][0]*pole[1][1]*pole[2][2]*pole[3][3]==81 || pole[1][1]*pole[2][2]*pole[3][3]*pole[4][4]==81)
            return 3;
        if(pole[0][4]*pole[1][3]*pole[2][2]*pole[3][1]==81 || pole[1][3]*pole[2][2]*pole[3][1]*pole[4][0]==81)
            return 3;
        if(pole[0][3]*pole[1][2]*pole[2][1]*pole[3][0]==1 || pole[1][4]*pole[2][3]*pole[3][2]*pole[4][1]==1 || pole[1][0]*pole[2][1]*pole[3][2]*pole[4][3]==1 || pole[0][1]*pole[1][2]*pole[2][3]*pole[3][4]==1)
            return 1;
        if(pole[0][3]*pole[1][2]*pole[2][1]*pole[3][0]==16 || pole[1][4]*pole[2][3]*pole[3][2]*pole[4][1]==16 || pole[1][0]*pole[2][1]*pole[3][2]*pole[4][3]==16 || pole[0][1]*pole[1][2]*pole[2][3]*pole[3][4]==16)
            return 2;
        if(pole[0][3]*pole[1][2]*pole[2][1]*pole[3][0]==81 || pole[1][4]*pole[2][3]*pole[3][2]*pole[4][1]==81 || pole[1][0]*pole[2][1]*pole[3][2]*pole[4][3]==81 || pole[0][1]*pole[1][2]*pole[2][3]*pole[3][4]==81)
            return 3;

        return 0;
    }

    public void play(){
        System.out.println("Mate pole:");
        System.out.println("1  2  3  4  5");
        System.out.println("6  7  8  9  10");
        System.out.println("11 12 13 14 15");
        System.out.println("16 17 18 19 20");
        System.out.println("21 22 23 24 25");
        Scanner sc = new Scanner(System.in);
        int input;
        while(isWinner()==0){
            System.out.println("Player "+player);
            input=sc.nextInt();
            if(input<1 || input>25) {
                System.out.println("Input must be between 1 and 9");
                continue;
            }
            int r=(input-1)/5;
            int c=(input-1)%5;
            if(pole[r][c]!=0) {
                System.out.println("Tile you chosed is not empty");
                continue;
            }
            pole[r][c]=player;
            printGame();
            count++;
            if(count==25){
                break;
            }
            nextPlayer();
        }

        if(isWinner()==1){
            System.out.println("Player 1 is winner");
        }
        else if(isWinner()==2){
            System.out.println("Player 2 is winner");
        }else{
            System.out.println("Cat");
        }
    }

    private void printGame() {
        System.out.println("- - - - -");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(pole[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("- - - - -");
    }

    private void nextPlayer() {
        if(player==1)
            player=2;
        else
        if(player==2)
            player=3;
        else
            player=1;
    }

    public static void main(String[] args) {
        Styrinastyri game = new Styrinastyri();
        game.play();
    }
}
