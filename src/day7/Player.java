package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private final int MAX_STAMINA=100;
    private final int MIN_STAMINA=0;

    public static int countPlayers = 0;

    public Player(int stamina){
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina(){
        return this.stamina;
    }

    public void run(){
         stamina -= 1;
        if(stamina == 0){
            System.out.println("����� �����, ������� �� ����");
            countPlayers -= 1;
        }
    }

    public static void info(){
        if (countPlayers < 6){
            System.out.println("������� �� ������. �� ���� ��� ���� " +(6-countPlayers)+ " ��������� ����");
        }else{
            System.out.println("�� ���� ��� ��������� ����");
        }
    }

    public static void main(String[] args) {
        Player player1 = new Player(91);
        Player player2 = new Player(100);
        Player player3 = new Player(79);
        Player player4 = new Player(95);
        Player player5 = new Player(93);
//        Player player6 = new Player();
        for(int i=0; i < 100;i++){
            player1.run();
        }
       Player.info();
    }

}
