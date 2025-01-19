package jp.ac.uryukyu.ie.e245728;

import java.util.Map;
import java.util.Scanner;

public class Buy {

    public void purchase (Inventory ci){
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println("店主：何を買うんだ？冷やかしなら帰ってくれよ。");

        while (true) {

            System.out.println("");
            System.out.println("欲しいものを選んでください");
            System.out.println("売り物一覧");
            System.out.println("1.スライムのジェル");
            System.out.println("2.聖水");
            System.out.println("3.すごい酒");
            System.out.println("4.ドラゴンの尻尾");
            System.out.println("5.薬草");
            System.out.println("6.魔獣の角");
            System.out.println("7.マンドラゴラ");
            System.out.println("8.毒キノコ");
            System.out.println("9.ターボイナゴ");
            System.out.println("10.購入を終了する");

            int item_num = scan.nextInt();
            //x = x+1;

            if (item_num == 1){

                //int i = ci.ingredients.get("スライムのジェル");
                //int j = i+1;

                System.out.println("スライムのジェルを購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("スライムのジェル") + "個だった！");
                ci.ingredients.put("スライムのジェル", ci.ingredients.get("スライムのジェル")+1);
                System.out.println("購入後は" + ci.ingredients.get("スライムのジェル") + "個になった！");
                ci.payment(1);//スライムの値段

                //ci.ingredients.put("スライムのジェル", 0=+1);これは間違った書き方だよ

                /* 

                System.out.println("購入する前は、" + i + "個だった！");  
                System.out.println("購入後は" + j + "個になった！");
                */
            }
            else if (item_num == 2){
                System.out.println("聖水を購入した！");
            }
            else if (item_num == 3){
                System.out.println("すごい酒を購入した！");
            }
            else if (item_num == 4){
                System.out.println("ドラゴンの尻尾を購入した！");
            }
            else if (item_num == 5){
                System.out.println("薬草を購入した！");
            }
            else if (item_num == 6){
                System.out.println("魔獣の角を購入した！");
            }
            else if (item_num == 7){
                System.out.println("マンドラゴラを購入した！");
            }
            else if (item_num == 8){
                System.out.println("毒キノコを購入した！");
            }
            else if (item_num == 9){
                System.out.println("ターボイナゴを購入した！");
            }
            else if (item_num == 10){
                System.out.println("ゲームを終了します。");
                //scan.close();
                break;
            }
            else {
                System.out.println("1~10 を入力してね！");
            }

        }
    }
}