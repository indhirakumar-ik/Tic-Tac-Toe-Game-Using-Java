import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[]  args) {
        Scanner scanner=new Scanner(System.in);
        char[][] charArray=new char[3][3];
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<charArray[i].length;j++) {
                charArray[i][j] = ' ';
            }
        }
        char player='X';
//
        boolean gameOver=false;
        while(!gameOver){
            showArray(charArray);
            System.out.println("enter Your row: "+player);
            int a=scanner.nextInt();
            System.out.println("enter Your column: "+player);
            int b=scanner.nextInt();
            charArray[a][b]=player;
            if(player=='X'){
                player='O';
            }else {
                player='X';
            }
            gameOver=isgameOver(charArray,player);
        }
        if(player=='X'){
            System.out.println("player X is win");
        }else{
            System.out.println("player O is win");
        }
//
//        char charArray[][] ={
//                {'O','O','X'},
//                {'O','X','O'},
//                {'X','O','X'}
//        };
//        showArray(charArray);
//        System.out.println(isgameOver(charArray,'X'));
    }

    public static void showArray(char[][] charArray){
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<charArray[i].length;j++) {
                System.out.print(charArray[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static boolean isgameOver(char[][] charArray,char user){
        for(int row=0;row< charArray.length;row++){
            if(charArray[row][0]==user&&charArray[row][1]==user&&charArray[row][2]==user) {
                return true;
            }
        }
        for(int col=0;col<charArray.length;col++){
            if(charArray[0][col]==user&&charArray[1][col]==user&&charArray[2][col]==user) {
                return true;
            }
        }
        if(charArray[0][0]==user&&charArray[1][1]==user&&charArray[2][2]==user){
            return true;
        }
        if(charArray[0][2]==user&&charArray[1][1]==user&&charArray[2][0]==user){
            return true;
        }

        return false;
    }
}
