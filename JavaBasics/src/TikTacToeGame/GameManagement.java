package TikTacToeGame;

public class GameManagement {

    String turn = "X";

    String[] board = new String[9];

    public GameManagement(){
        for(int i=0; i<9; i++){
            board[i] = String.valueOf(i+1);
        }
    }

    public void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |" );
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |" );
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |" );
        System.out.println("|---|---|---|");

    }

    public boolean checkSlot(int numInput){
        int index = numInput -1;
        if(board[index].equals(String.valueOf(numInput))){
            board[index] = turn;
            turn = turn.equals("X")? "O":"X";
            return true;
        }
        return false;
    }
}
