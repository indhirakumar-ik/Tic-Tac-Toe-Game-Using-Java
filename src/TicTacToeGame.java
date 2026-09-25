import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        System.out.println("====== TIC TAC TOE GAME CREATED BY 'INDHIRAKUMAR'=====");

        //--------------Initial array--------------

        Scanner scanner=new Scanner(System.in);
        char[][] charArray=new char[3][3];
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<charArray[i].length;j++) {
                charArray[i][j] = ' ';
            }
        }
        //----------------------------------------

        char player='X';

        boolean gameOver=false;
        //------------operation---------
        while(!isgameOver(charArray,player)){
            showArray(charArray);
            System.out.println("PLAYER IS: "+player);
            System.out.println("Your row 'ENTER' && column 'ENTER'");
            int a=scanner.nextInt()-1;
            int b=scanner.nextInt()-1;
            System.out.println();
            if(charArray[a][b]=='X'||charArray[a][b]=='O'){
                System.out.println("Invalid choise please try again");
            }
            else{
                charArray[a][b]=player;
//                if(player=='X'){
//                    player='O';
//                }else {
//                    player='X';
//                }
                if(!isgameOver(charArray,player)){
                    if(player=='X'){
                        player='O';
                    }else {
                        player='X';
                    }
                }else {
                    break;
                }

            }

        }
        System.out.println("====FINAL OUTPUT====");
        showArray(charArray);
        if(player=='X'){
            System.out.println("=====PLAYER X IS WON THE MATCH=====");
        }else{
            System.out.println("=====PLAYER O IS WON THE MATCH=====");
        }

    }

    //------------------------------------------------
    //------------------------show array--------------
    //----------------------------------------------
    public static void showArray(char[][] charArray){
        System.out.println("-------------");
        for(int i=0;i<charArray.length;i++){
            System.out.print("| ");
            for(int j=0;j<charArray[i].length;j++) {
                System.out.print(charArray[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.print("-------------");
        System.out.println();

    }

    //---------------------------------------------
    //---------------find player is win or not------
    //----------------------------------------------
    public static boolean isgameOver(char[][] charArray,char user){

        //----------check the rows---------------
        for(int row=0;row< charArray.length;row++){
            if(charArray[row][0]==user&&
                    charArray[row][1]==user&&
                    charArray[row][2]==user) {
                return true;
            }
        }
        //----------------check the column--------------
        for(int col=0;col<charArray.length;col++){
            if(charArray[0][col]==user&&
                    charArray[1][col]==user&&
                    charArray[2][col]==user) {
                return true;
            }
        }
        //--------------check the right to left diagonal---------
        if(charArray[0][0]==user&&
                charArray[1][1]==user&&
                charArray[2][2]==user){
            return true;
        }
        //-----------------check the left to right diagonal--------
        if(charArray[0][2]==user&&
                charArray[1][1]==user&&
                charArray[2][0]==user){
            return true;
        }
        // ----------if no result-------------
        return false;
    }
}
