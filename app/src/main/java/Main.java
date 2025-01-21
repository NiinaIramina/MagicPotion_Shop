import jp.ac.uryukyu.ie.e245728.*;

/**
 * ゲームのメインメソッドとなるクラスです
 * GameMasterクラスをインスタンス化してゲームを開始します
 */
public class Main {

    /**
     * アプリケーションのメインメソッド
     * GameMasterクラスをインスタンス化してゲームを開始します。
     * 
     * @param args コマンドライン引数（使用されていません）。
     */
    public static void main(String[] args){
        //ゲームを管理するGameMasterクラスのインスタンスを生成
        GameMaster gm = new GameMaster();
        //ゲームを開始
        gm.gameStart();
    }
}
