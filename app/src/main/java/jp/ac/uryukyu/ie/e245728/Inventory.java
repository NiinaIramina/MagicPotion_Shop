package jp.ac.uryukyu.ie.e245728;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Integer> ingredients;
    int sales; //売上
    int funds; //所持金

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
        System.out.println("在庫・売上・所持金を表示します");
        System.out.println("在庫");

        for(Map.Entry<String, Integer> entry : ingredients.entrySet()){
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
        System.out.println("売上：" + sales);
        System.out.println("所持金：" + funds);

    }

    //売上を更新するメソッド
    public void a() {
        sales += 1;
    }


    //在庫を表示するメソッド

    //所持金を表示するメソッド

}