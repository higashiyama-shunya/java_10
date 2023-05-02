package rensyu10;

import lib.Input;

public class Rensyu10_02 {

	public static void main(String[] args) {
		//P221 練習10-2
		System.out.println("美術館へようこそ。何人でのご来館ですか？");
		int nin=Input.getInt();
		int ryoukin=nin*850;
		if(nin>=5) {	//人数が5以上だった場合
			ryoukin*=0.7;	//料金を0.7で掛けて割引する。
		}				//falseだった場合の処理がない場合はelseは省略できる。
		System.out.println("入館料は"+ryoukin+"になります。");
	}

}
