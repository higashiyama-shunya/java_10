package rensyu10;

import lib.Input;

public class Resnyu10_06 {

	public static void main(String[] args) {
		//P239 通貨テスト
		String text;
		while((text=Input.getString("単語"))!=null) { //while文でif文をずっと繰り返す
													  //nullが出るまでif文の繰り替えし
			if(text.equals("dog")){
				System.out.println("いぬ"); 
			}else if(text.equals("cat")) {
				System.out.println("ねこ");
			}else if(text.equals("mouse")) {
				System.out.println("ねずみ");
			}else if(text.equals("rabbit")) {
				System.out.println("うさぎ");			//それぞれの条件によって分岐する
			}else {
				System.out.println("?");
			}
		}
	}

}
