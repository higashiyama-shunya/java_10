package rensyu10;

import lib.Input;

public class Rensyu10_05 {

	public static void main(String[] args) {
		//P233 if文とwhile文の組み合わせ
		int data,sanbai=0,sonota=0; //int型の変数を3つ用意して3倍とその他だけ0を代入する
		while((data=Input.getInt())!=0){	//よくやるwhile文　0以外で繰り返し
			if(data%3==0) {	//if文 dataが3で割り切れたら
				sanbai++;	//sanbaiの数値が1増える
			}else {			//それ以外の場合
				sonota++;	//sonotaの数値が1増える
			}
		}
		System.out.println("3の倍数="+sanbai);
		System.out.println("その他="+sonota);
	}

}
