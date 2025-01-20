package jp.ac.uryukyu.ie.e245728;

import java.util.Scanner;

public class Potion {

    public void makePotion(Inventory ci){
        Scanner scan = new Scanner(System.in);//scan閉じてないよ！という警告だが、scan.close()しちゃうとエラーが出ちゃうのでこのまま！

        System.out.println("");
        System.out.println("魔女：これから魔法薬を作っていくよ！");

        while (true) {
            System.out.println("");

            System.out.println("魔女：まずはBaseにするものを選んでね！");
            System.out.println("1.スライムのジェル");
            System.out.println("2.聖水");
            System.out.println("3.すごい酒");
            System.out.println("10.一旦やめとく？");

            int base_num = scan.nextInt();
            if (base_num == 10) {
                System.out.println("やめとこうかな");
                break;            
            }

            //if文で1~3以外を選んだらやり直し
            if (!(base_num  == 1 || base_num == 2 || base_num == 3)) {
                System.out.println("その素材はないよ！初めからやり直してね！");
                continue; //while文の一番下に行ってまた上から再開する
            }
            
            System.out.println("");
            System.out.println("魔女：次にCoreにするものを選んでね！");
            System.out.println("4.ドラゴンの尻尾");
            System.out.println("5.薬草");
            System.out.println("6.魔獣の角");
            System.out.println("10.一旦やめとく？");

            int core_num = scan.nextInt();
            if (core_num == 10) {
                System.out.println("やめとこうかな");
                break;
            }
            if (!(core_num  == 4 || core_num == 5 || core_num == 6)) {
                System.out.println("その素材はないよ！初めからやり直してね！");
                continue; //while文の一番下に行ってまた上から再開する
            }

            System.out.println("");
            System.out.println("魔女：最後にAccentにするものを選んでね！");
            System.out.println("7.マンドラゴラ");
            System.out.println("8.毒キノコ");
            System.out.println("9.ターボイナゴ");
            System.out.println("10.一旦やめとく？");

            int accent_num = scan.nextInt();
            if (accent_num == 10) {
                System.out.println("やめとこうかな");
                break;
            }
            if (!(accent_num  == 7 || accent_num == 8 || accent_num == 9)) {
                System.out.println("その素材はないよ！初めからやり直してね！");
                continue; //while文の一番下に行ってまた上から再開する
            }

            //在庫を減らすコード
            if (base_num == 1){
                ci.ingredients.put("スライムのジェル", ci.ingredients.get("スライムのジェル")-1);
            }

            if (base_num == 2){
                ci.ingredients.put("聖水", ci.ingredients.get("聖水")-1);
            }

            if (base_num == 3){
                ci.ingredients.put("すごい酒", ci.ingredients.get("すごい酒")-1);
            }
            
            if (core_num == 4){
                ci.ingredients.put("ドラゴンの尻尾", ci.ingredients.get("ドラゴンの尻尾")-1);
            }

            if (core_num == 5){
                ci.ingredients.put("薬草", ci.ingredients.get("薬草")-1);
            }

            if (core_num == 6){
                ci.ingredients.put("魔獣の角", ci.ingredients.get("魔獣の角")-1);
            }

            if (accent_num == 7){
                ci.ingredients.put("マンドラゴラ", ci.ingredients.get("マンドラゴラ")-1);
            }

            if (accent_num == 8){
                ci.ingredients.put("毒キノコ", ci.ingredients.get("毒キノコ")-1);
            }

            if (accent_num == 9){
                ci.ingredients.put("ターボイナゴ", ci.ingredients.get("ターボイナゴ")-1);
            }

            //魔法薬の結果
            if (base_num == 1 && core_num == 4 && accent_num == 7){
                System.out.println("");
                System.out.println("『パワーゼリー』ができた！");
                System.out.println("攻撃力がアップするぞ！");
                ci.record(120);
            }
            else if (base_num == 1 && core_num == 4 && accent_num == 9){
                System.out.println("");
                System.out.println("『スピードゼリー』ができた！");
                System.out.println("素早さがアップするぞ！");
                ci.record(120);
            }
            else if (base_num == 1 && core_num == 5 && accent_num == 8){
                System.out.println("");
                System.out.println("『軟膏』ができた！");
                System.out.println("皮膚を守ってくれるぞ！");
                ci.record(100);
            }
            else if (base_num == 1 && core_num == 5 && accent_num == 7){
                System.out.println("");
                System.out.println("『毒薬』ができた！");
                System.out.println("間違って飲まないように気をつけよう！");
                ci.record(160);
            }
            else if (base_num == 2 && core_num == 4 && accent_num == 7){
                System.out.println("");
                System.out.println("『魔法免疫薬』ができた！");
                System.out.println("魔法耐性がアップできるぞ！");
                ci.record(200);
            }
            else if (base_num == 2 && core_num == 4 && accent_num == 9) {
                System.out.println("");
                System.out.println("『防御薬』ができた！");
                System.out.println("防御力がアップするぞ！");
                ci.record(120);
            }
            else if (base_num == 2 && core_num == 5 && accent_num == 7) {
                System.out.println("");
                System.out.println("『回復薬』ができた！");
                System.out.println("回復できるぞ！");
                ci.record(110);
            }
            else if (base_num == 2 && core_num == 5 && accent_num == 8) {
                System.out.println("");
                System.out.println("『解毒薬』ができた！");
                System.out.println("毒を無効化できるぞ！");
                ci.record(130);
            }
            else if (base_num == 2 && core_num == 6 && accent_num == 7) {
                System.out.println("");
                System.out.println("『魔除薬』ができた！");
                System.out.println("一定時間、魔物から気づかれにくくなるぞ！");
                ci.record(180);
            }
            else if (base_num == 3 && core_num == 4 && accent_num == 9) {
                System.out.println("");
                System.out.println("『グングン酒』ができた！");
                System.out.println("経験値がゲットできるぞ！");
                ci.record(150);
            }
            else if (base_num == 3 && core_num == 5 && accent_num == 7) {
                System.out.println("");
                System.out.println("『いのち酒』ができた！");
                System.out.println("健康になった気がする！");
                ci.record(150);
            }
            else if (base_num == 3 && core_num == 5 && accent_num == 8) {
                System.out.println("");
                System.out.println("『オキルン酒』ができた！");
                System.out.println("気つけ薬だぞ！");
                ci.record(150);
            }
            else if (base_num == 3 && core_num == 6 && accent_num == 8) {
                System.out.println("");
                System.out.println("『しびれ薬』ができた！");
                System.out.println("飲んでもよし！吸ってもよし！痺れるぞ！");
                ci.record(160);
            }
            else {
                System.out.println("");
                System.out.println("微妙なポーションができた…");
                ci.record(15);
            }
        }

    }
}
