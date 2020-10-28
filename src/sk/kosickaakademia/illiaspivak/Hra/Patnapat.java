package sk.kosickaakademia.illiaspivak.Hra;

import java.util.Scanner;

public class Patnapat {
    private int[][] pole;
    private int player=1;
    private int count=0;

    public Patnapat() {
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
            if(pole[i][0]*pole[i][1]*pole[i][2]*pole[i][3]*pole[i][4]==1 || pole[0][i]*pole[1][i]*pole[2][i]*pole[3][i]*pole[4][i]==1)
                return 1;
            if(pole[i][0]*pole[i][1]*pole[i][2]*pole[i][3]*pole[i][4]==32 || pole[0][i]*pole[1][i]*pole[2][i]*pole[3][i]*pole[4][i]==8)
                return 2;
            if(pole[i][0]*pole[i][1]*pole[i][2]*pole[i][3]*pole[i][4]==243 || pole[0][i]*pole[1][i]*pole[2][i]*pole[3][i]*pole[4][i]==243)
                return 3;
        }
        if(pole[0][0]*pole[1][1]*pole[2][2]*pole[3][3]*pole[4][4]==1 || pole[0][4]*pole[1][3]*pole[2][2]*pole[3][1]*pole[4][0]==1)
            return 1;
        if(pole[0][0]*pole[1][1]*pole[2][2]*pole[3][3]*pole[4][4]==32 || pole[0][4]*pole[1][3]*pole[2][2]*pole[3][1]*pole[4][0]==32)
            return 2;
        if(pole[0][0]*pole[1][1]*pole[2][2]*pole[3][3]*pole[4][4]==234 || pole[0][4]*pole[1][3]*pole[2][2]*pole[3][1]*pole[4][0]==234)
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
        Patnapat game = new Patnapat();
        game.play();
    }
}
