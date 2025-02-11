package KADAI.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

//じゃんけんクラス
public class Jyanken_Chapter26 {
	//Scannerクラスのオブジェクトを生成する
	Scanner scanner = new Scanner(System.in);

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		//入力を促すメッセージ
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");

		//入力の変数宣言
		String myInput;

		// 有効な自分のじゃんけんの手を配列で定義
		String[] myHand = { "r", "s", "p" };

		while (true) {
			myInput = scanner.next();
			// 入力が有効なじゃんけんの手かどうかをチェック

			boolean isValid = false;
			for (String hand : myHand) {
				if (hand.equals(myInput)) {
					isValid = true; // 入力が正しい場合
					break;
				}
			}

			if (isValid) {
				//入力した内容を出力する
				System.out.println(myInput);
				break; // 正しいじゃんけんの手の場合、ループを抜ける
			} else {
				System.out.println("無効な入力です。再度自分のじゃんけんの手を選んでください。");
			}
		}

		//自分のじゃんけんの手を返す
		return myInput;
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		// 有効な相手のじゃんけんの手を配列で定義
		String[] yourHand = { "r", "s", "p" };

		//乱数で対戦相手のじゃんけんの手を選ぶ
		//乱数の範囲で指定した3までの数値を切り捨てて出力する
		String yourInput = yourHand[(int) Math.floor(Math.random() * 3)];

		//相手のじゃんけんの手を返す
		return yourInput;
	}

	//じゃんけんを行う
	public void playGame() {
		// コレクションの作成
		HashMap<String, String> humanMap = new HashMap<String, String>();

		humanMap.put("r", "グー");
		humanMap.put("s", "チョキ");
		humanMap.put("p", "パー");

		//自分と対戦相手のじゃんけんの手を出力する
		String me = new String(getMyChoice());
		String you = new String(getRandom());

		System.out.println("自分の手は" + humanMap.get(me) + ",対戦相手の手は" + humanMap.get(you));

		//equals()メソッドで自分と対戦相手のじゃんけんの手を比較する	      
		if (me.equals(you)) {
			System.out.println("あいこです");
		} else if ((me.equals("r") && you.equals("s")) ||
				(me.equals("s") && you.equals("p")) ||
				(me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}

	}

}
