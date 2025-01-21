package jp.ac.uryukyu.ie.e245728;
import java.util.Scanner;

/**
 * ゲームのメインメニュー画面を表示するクラスです。
 * プレイヤーはここでやりたいことを選択し、在庫確認、材料購入、魔法薬作成、ゲーム終了などの操作を行います。
 */
public class MainMenu {

    /**
     * メインメニューを表示し、プレイヤーにやりたいことを選ばせるメソッドです。
     * プレイヤーが選んだオプションに応じて、在庫確認、材料購入、魔法薬作成、ゲーム終了の各処理を呼び出します。
     * 
     * @param ci Inventoryクラスのインスタンス。プレイヤーの在庫や所持金を管理します。
     * @param bp Buyクラスのインスタンス。材料の購入処理を担当します。
     * @param mp Potionクラスのインスタンス。魔法薬の作成処理を担当します。
     */
    public void showMenu(Inventory ci, Buy bp ,Potion mp){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("遊び方はREADMEを参照してね！");
            System.out.println("------------------");
            System.out.println("メインメニュー画面です。");
            System.out.println("やりたいことを選んでください。");
            System.out.println("1.在庫・売上・所持金の確認");
            System.out.println("2.材料の購入");
            System.out.println("3.魔法薬を作る");
            System.out.println("4.ゲームを終了する");
            if (ci.judgeGameClear()){
                System.out.println("5.そしてエンディングへ…");
            }

            int choose_num = scan.nextInt();

            if (choose_num == 1){ //在庫・売上・所持金の表示画面
                ci.CheckInventory();
            }
            else if (choose_num == 2){
                bp.purchase(ci);
            }
            else if (choose_num == 3){
                mp.makePotion(ci);
            }
            else if (choose_num == 4){
                System.out.println("ゲームを終了します。");
                System.exit(0);
                break;
            }
            else if (choose_num == 5 && ci.judgeGameClear()){
                System.out.println("目標金額まで達しました！");
                System.out.println("ゲームクリア！おめでとう！");
                System.exit(0);
            }
            else {
                System.out.println("1~4 を入力してね！");
            }
        }

        //scan.close();
    }
}