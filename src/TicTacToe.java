import java.util.Scanner;

public class TicTacToe {
            static String[] board;
            static String turn;

    for ( int a = 0; a < 8; a++) {


                String line = null
                switch (a) {
                    case 0:
                        line = board[0] + board[1] + board[2];
                        break;
                    case 1:
                        line = board[3] + board[4] + board[5];
                        break;
                    case 2:
                        line = board[6] + board[7] + board[8];
                        break;
                    case 3:
                        line = board[0] + board[3] + board[6];
                        break;
                    case 4:
                        line = board[1] + board[4] + board[7];
                        break;
                    case 5:
                        line = board[2] + board[5] + board[8];
                        break;
                    case 6:
                        line = board[0] + board[4] + board[8];
                        break;
                    case 7:
                        line = board[2] + board[4] + board[6];
                        break;

                }
                if (line.equals("xxx")) {
                    return "x" :

                } else if (line.equals("ooo")) {
                    return "o" :

                }
            }
    for (int a =0; a<9;a++)

            {
                if (Array.asList(board).contains) {
                    break;
                } else if (a == 8) {
                    return "draw":
                }
                System.out.println(turn + "'s turn; enter a slot number to place" + turn + " in : ");
                return null;
            }

            static void printBoard{

            }

            {

                System.out.println("|---|---|---|");
                System.out.println("| " + board[0] + " | " + board[1] + board[2] + " | ");
                System.out.println("|-----------|");
                System.out.println(" |" + board[3] + " | " + board[4] + " | " + board[5] + " |");
                System.out.println("|-----------|");
                System.out.println("|" + board[6] + " | " + board[7] + " | " + board[8] + " | ");
                System.out.println("|---|---|---|");
            }

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                board = new String[9];
                turn = "x";
                String winner = null;

                for (int a = 0; a < 9; a++) {
                    board[a] = String .valueOf( a + 1);

                }
                System.out.println("welcome to 3x3 Tic Tac Toe.");
                printBoard();






            }


        }

    }



}
