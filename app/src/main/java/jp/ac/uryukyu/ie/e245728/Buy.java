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

                System.out.println("聖水を購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("聖水") + "個だった！");
                ci.ingredients.put("聖水", ci.ingredients.get("聖水")+1);
                System.out.println("購入後は" + ci.ingredients.get("聖水") + "個になった！");
                ci.payment(7);//聖水の値段

            }
            else if (item_num == 3){
                System.out.println("すごい酒を購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("すごい酒") + "個だった！");
                ci.ingredients.put("すごい酒", ci.ingredients.get("すごい酒")+1);
                System.out.println("購入後は" + ci.ingredients.get("すごい酒") + "個になった！");
                ci.payment(5); // すごい酒の値段
            }
            else if (item_num == 4){
                System.out.println("ドラゴンの尻尾を購入した！");
                System.out.println("ドラゴンの尻尾を購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("ドラゴンの尻尾") + "個だった！");
                ci.ingredients.put("ドラゴンの尻尾", ci.ingredients.get("ドラゴンの尻尾")+1);
                System.out.println("購入後は" + ci.ingredients.get("ドラゴンの尻尾") + "個になった！");
                ci.payment(9); // ドラゴンの尻尾の値段
            }
            else if (item_num == 5){
                System.out.println("薬草を購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("薬草") + "個だった！");
                ci.ingredients.put("薬草", ci.ingredients.get("薬草")+1);
                System.out.println("購入後は" + ci.ingredients.get("薬草") + "個になった！");
                ci.payment(3); // 薬草の値段
            }
            else if (item_num == 6){
                System.out.println("魔獣の角を購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("魔獣の角") + "個だった！");
                ci.ingredients.put("魔獣の角", ci.ingredients.get("魔獣の角")+1);
                System.out.println("購入後は" + ci.ingredients.get("魔獣の角") + "個になった！");
                ci.payment(8); // 魔獣の角の値段
            }
            else if (item_num == 7){
                System.out.println("マンドラゴラを購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("マンドラゴラ") + "個だった！");
                ci.ingredients.put("マンドラゴラ", ci.ingredients.get("マンドラゴラ")+1);
                System.out.println("購入後は" + ci.ingredients.get("マンドラゴラ") + "個になった！");
                ci.payment(6); // マンドラゴラの値段
            }
            else if (item_num == 8){
                System.out.println("毒キノコを購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("毒キノコ") + "個だった！");
                ci.ingredients.put("毒キノコ", ci.ingredients.get("毒キノコ")+1);
                System.out.println("購入後は" + ci.ingredients.get("毒キノコ") + "個になった！");
                ci.payment(2); // 毒キノコの値段
            }
            else if (item_num == 9){
                System.out.println("ターボイナゴを購入した！");
                System.out.println("購入する前は、" + ci.ingredients.get("ターボイナゴ") + "個だった！");
                ci.ingredients.put("ターボイナゴ", ci.ingredients.get("ターボイナゴ")+1);
                System.out.println("購入後は" + ci.ingredients.get("ターボイナゴ") + "個になった！");
                ci.payment(4); // ターボイナゴの値段
            }
            else if (item_num == 10){
                System.out.println("購入を終了します。");
                //scan.close();
                break;
            }
            else {
                System.out.println("1~10 を入力してね！");
            }

        }
    }
}