package rensyu10;

import lib.Input;

public class Rensyu10_04 {
	public static void main(String[] args) {
		//P228 練習10-4
		double weight=Input.getDouble("重さ kg");
		int postage; 

		if(weight<1) {		//else ifでの条件分岐　重さが1未満だったら		
			postage=300;
		}else if(weight<5) {	//重さが5未満だったら
			postage=500;
		}else if(weight<10) {	//重さが10未満だったら
			postage=800;
		}else {				//それ以外（10以上だったら）
			postage=1500;
		}
		System.out.println(postage);
	}
}
