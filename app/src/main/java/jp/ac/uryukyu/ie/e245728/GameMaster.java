package jp.ac.uryukyu.ie.e245728;

public class GameMaster {
    
    /**
     * GameMasterクラスのコンストラクタです。
     * 現在の実装では特別な初期化処理は行っていません。
     */
    public GameMaster(){
    }

    /**
     * ゲームを開始するメソッドです。
     * 必要なインスタンスを生成し、メインメニューを表示してゲームの進行を開始します。
     */
    public void gameStart(){
        System.out.println("ゲームスタート！");

        //インスタンス生成エリア
        MainMenu sm = new MainMenu();
        Inventory ci = new Inventory();
        Buy bp = new Buy();
        Potion mp = new Potion();


        //メインメニューを表示してゲームを開始
        sm.showMenu(ci, bp, mp);
    }
}