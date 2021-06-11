package chapterSeven;

public class CharArray {
    public static void main(String[] args) {

        char[][]tictactoe = new char[3][3];
        tictactoe[0][0]= 'X';
        tictactoe[0][1]= 'O';
        tictactoe[0][2]= 'X';
        tictactoe[1][0]= 'O';
        tictactoe[1][1]= 'O';
        tictactoe[1][2]= 'X';
        tictactoe[2][0]= 'O';
        tictactoe[2][1]= 'X';
        tictactoe[2][2]= 'O';
        for (char[] row : tictactoe) {
            for (char column : row) System.out.print(" " + column);
            System.out.println();
        }

        }


    }

