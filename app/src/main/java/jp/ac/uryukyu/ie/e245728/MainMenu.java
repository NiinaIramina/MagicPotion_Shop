package jp.ac.uryukyu.ie.e245728;
import java.util.Scanner;

public class MainMenu {

    public void showMenu(Inventory ci, Buy bp){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("メインメニュー画面です。");
            System.out.println("やりたいことを選んでください。");
            System.out.println("1.在庫・売上・所持金の確認");
            System.out.println("2.材料の購入");
            System.out.println("3.魔法薬を作る");
            System.out.println("4.ゲームを終了する");

            int choose_num = scan.nextInt();

            if (choose_num == 1){ //在庫・売上・所持金の表示画面
                ci.CheckInventory();
            }
            else if (choose_num == 2){
                bp.purchase();
            }
            else if (choose_num == 3){
                
            }
            else if (choose_num == 4){
                System.out.println("ゲームを終了します。");
                System.exit(0);
                break;
            }
            else {
                System.out.println("1~4 を入力してね！");
            }
        }

        scan.close();
    }
}