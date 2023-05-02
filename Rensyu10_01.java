package rensyu10;

import lib.Input;

public class Rensyu10_01 {

	public static void main(String[] args) {
		//P218 練習10-1
		int year=Input.getInt();		//if文　条件がtrueだった場合とfalseだった場合で分岐する。
		if(year%4==0 && year%100!=0|| year%400==0) {//うるう年をだすアルゴリズム
													//4で割り切れて且つ100で割り切れない数、又は400で割り切れる数字
			System.out.println("うるう年です");
		}else {
			System.out.println("うるう年ではありません");
		}

	}

}
