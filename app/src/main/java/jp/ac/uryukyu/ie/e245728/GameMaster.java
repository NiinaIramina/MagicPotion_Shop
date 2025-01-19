package jp.ac.uryukyu.ie.e245728;
import java.util.Scanner;

public class GameMaster {
    
    public GameMaster(){
    }

    public void gameStart(){
        System.out.println("ゲームスタート！");

        MainMenu sm = new MainMenu();
        sm.showMenu();
    }
}