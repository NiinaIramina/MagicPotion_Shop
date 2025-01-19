package jp.ac.uryukyu.ie.e245728;

import java.util.Scanner;

public class Potion {

    public void makePotion(){
        Scanner scan = new Scanner(System.in);

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

            if (base_num == 1 && core_num == 4 && accent_num == 7){
                System.out.println("パワーゼリー ができた！");
            }
            else {
                System.out.println("微妙なポーションができた…");
            }
        }

    }
}
