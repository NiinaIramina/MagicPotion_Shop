package jp.ac.uryukyu.ie.e245728;

public class GameMaster {
    
    public GameMaster(){
    }

    public void gameStart(){
        System.out.println("ゲームスタート！");

        //インスタンス生成エリア
        MainMenu sm = new MainMenu();
        Inventory ci = new Inventory();
        Buy bp = new Buy();
        Potion mp = new Potion();



        sm.showMenu(ci, bp, mp);
    }
}