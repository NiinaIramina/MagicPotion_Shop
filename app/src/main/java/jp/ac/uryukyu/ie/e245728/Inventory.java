package jp.ac.uryukyu.ie.e245728;

import java.util.HashMap;
import java.util.Map;

/**
 * ゲームの在庫・売上・所持金を表示するクラス。
 */

public class Inventory {
    /**
     * 材料の在庫の一覧を管理するマップ。
     */
    Map<String, Integer> ingredients;

    /**
     * ゲーム内の売上を表す。
     */
    private int sales; //売上

    /**
     * ゲーム内の所持金を表す。
     */
    private int funds; //所持金

    /**
     * Inventoryクラスのインスタンスを生成するコンストラクタ。
     * 初期在庫を設定し、売上と所持金を初期化する。
     */
    Inventory (){
        this.ingredients = new HashMap<>();
        this.sales = 0;
        this.funds = 300;

        //材料(素材名と個数)を初期化
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

    /**
     * 在庫・売上・所持金を表示する
     */
    public void CheckInventory() {
        System.out.println("\n在庫・売上・所持金を表示します\n");
        System.out.println("在庫");

        for(Map.Entry<String, Integer> entry : ingredients.entrySet()){
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        System.out.println("\n目標売上金額は 3000 です"); //売上目標金額
        System.out.println("売上：" + sales);
        System.out.println("所持金：" + funds);

    }

    /**
     * 売上と所持金を指定された金額で更新する。
     * 
     * @param money 追加する金額
     */
    public void record(int money){ //収入を得る
        sales += money;
        funds += money; //同じクラス内で使う時はsetter,getterはいらない。
    }

    /**
     * 指定された金額を支出し、所持金を減少させる。
     * 
     * @param money 支出する金額
     */
    public void payment(int money){ //支出
        funds -= money;
    }

    /**
     * 目標金額に達したかを判定する。
     * 
     * @return 目標金額に達した場合はtrue、それ以外はfalse
     */
    public boolean judgeGameClear(){ //目標金額に達した時
        //sales >= 3000;
  
        if (sales >= 3000){ //目標金額の設定
            return true;
        } else {
            return false;
        }

        //return sales >= 3000;
    }

    /**
     * 現在の売上を取得する。
     * 
     * @return 売上金額
     */
    public int getSales(){
        return this.sales;
    }

    /**
     * 現在の所持金を取得する。
     * 
     * @return 所持金額
     */
    public int getFunds(){
        return this.funds;
    }
    
}