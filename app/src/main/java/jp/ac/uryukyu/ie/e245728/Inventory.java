package jp.ac.uryukyu.ie.e245728;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Integer> ingredients;
    private int sales; //売上
    private int funds; //所持金

    Inventory (){
        this.ingredients = new HashMap<>();
        this.sales = 0;
        this.funds = 300;

        //材料(素材名と個数)
        ingredients.put("スライムのジェル", 0);
        ingredients.put("聖水", 0);
        ingredients.put("すごい酒", 0);
        ingredients.put("ドラゴンの尻尾", 0);
        ingredients.put("薬草", 0);
        ingredients.put("魔獣の角", 0);
        ingredients.put("マンドラゴラ", 0);
        ingredients.put("毒キノコ", 0);
        ingredients.put("ターボイナゴ", 0);

    }

    //在庫・売上・所持金を表示する
    public void CheckInventory() {
        System.out.println("");
        System.out.println("在庫・売上・所持金を表示します");
        System.out.println("");
        System.out.println("在庫");

        for(Map.Entry<String, Integer> entry : ingredients.entrySet()){
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
        System.out.println("");
        System.out.println("目標売上金額は 3000 です"); //売上目標金額
        System.out.println("売上：" + sales);
        System.out.println("");
        System.out.println("所持金：" + funds);

    }

    //売上を更新するメソッド
    public void a() {
        sales += 1;
    }

    public void record(int money){ //収入を得る
        sales += money;
        funds += money; //同じクラス内で使う時はsetter,getterはいらない。
    }

    public void payment(int money){ //支出
        funds -= money;
    }

    public boolean judgeGameClear(){ //目標金額に達した時
        //sales >= 3000;
  
        if (sales >= 3000){ //目標金額の設定
            return true;
        } else {
            return false;
        }

        //return sales >= 3000;

    }

    public int getSales(){
        return this.sales;
    }

    public int getFunds(){
        return this.funds;
    }

    //在庫を表示するメソッド

    //所持金を表示するメソッド

}