package rensyu10;

import lib.Input;

public class Rensyu10_03 {

	public static void main(String[] args) {
		//P225　練習10-3
		int number=Input.getInt();
		if(number==124) {	//else ifでの条件分岐　
			System.out.println("大当たり！");	//124なら大当たり
		}else if(number==123||number==125) {
			System.out.println("前後賞");		//123か125なら前後賞
		}else {
			System.out.println("はずれ");		//それ以外ならはずれになる。
		}
		
	}

}
