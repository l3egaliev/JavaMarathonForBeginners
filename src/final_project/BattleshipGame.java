package final_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class BattleshipGame {
    static String [] playerMove;
    static Scanner scanner = new Scanner(System.in);

    static int player1Score;
    static int player2Score;
   
  


    public static void main(String[] args) {
        String [][] board1 = new String[10][10];
        String [][] board2 = new String[10][10];

        go(board1, board2);

    }

    static void initializeBoard(String[][] board){
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){

                board[i][j] ="-"; // \uF6A2
            }
        }
    }

    static void printBoard(String [][] board){
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.printf(board[i][j]+"\t");
            }
            System.out.println();

        }
    }

    static void selectCoordinates(String [][] board){
        int ships = 0;
        while(ships < 3){
            String [] coordinates = scanner.nextLine().split(",");
            int c1 = Integer.parseInt(coordinates[0]);
            int c2 = Integer.parseInt(coordinates[1]);
            board[c1][c2] = "+"; // + is ships
            ships++;
        }
    }

    static void start(String [][] board1,String [][] board2){


        System.out.println("игра начинается!");
        System.out.println("Ход первого игрока, у вас 3 попытки");
        int attempt = 3;
        int player1Score = gameScore(attempt, board2);

        System.out.println(player1Score);

        System.out.println("Ход второго игрока, у вас 3 попытки");
        int attempt2 = 3;
        int player2Score = gameScore(attempt2, board1);
        System.out.println(player2Score);

        winner(player1Score, player2Score);
        System.out.println();
        System.out.println("Поле игрока #1");
        printBoard(board1);
        System.out.println();
        System.out.println("Поле игрока #2");
        printBoard(board2);


    }

    static int gameScore(int attempt, String [][] board){
        int playerScore = 0;
        while(attempt > 0){
            attempt--;
            playerMove = scanner.nextLine().split(",");
            int c1 = Integer.parseInt(playerMove[0]);
            int c2 = Integer.parseInt(playerMove[1]);
            if(Objects.equals(board[c1][c2], "+")){
                System.out.println("Попал!");
                playerScore++;
                board[c1][c2] = "&"; // & is a bomb
            } else {
                System.out.println("Мимо!");
            }
            System.out.println("Осталось "+attempt+" попыток");
        }
        return playerScore;
    }

    static void winner(int player1Score, int player2Score){
        if(player1Score > player2Score){
            System.out.println();
            System.out.println("Победил игрок #1, со счетом "+player1Score+":"+player2Score);
        } else if (player2Score > player1Score) {
            System.out.println();
            System.out.println("Победил игрок #2, со счетом "+player2Score+":"+player1Score);
        }else {
            System.out.println();
            System.out.println("Ничья");
        }
    }


    static void go(String[][] board1, String [][] board2){
        initializeBoard(board1);

        System.out.println("Поле 1го игрока, второй игрок не смотри!");
        printBoard(board1);

        System.out.println("игрок №1 расставьте свои корабли, формат (x,y)"+"\nВы можете ставить 3 корабля");
        selectCoordinates(board1);


        initializeBoard(board2);

        System.out.println("Поле 2го игрока, первый игрок не смотри!");
        printBoard(board2);

        System.out.println("игрок №2 расставьте свои корабли, формат (x,y)"+"\nВы можете ставить 3 корабля");

        selectCoordinates(board2);

        start(board1, board2);
    }


}
