package KADAI.kadai_026;

//じゃんけんを実行するクラス
public class JyankenExec_Chapter26 {
	public static void main(String[] args) {

		//じゃんけんクラスのインスタンス化
		Jyanken_Chapter26 janken = new Jyanken_Chapter26();

		//じゃんけんの結果を出力
		janken.playGame();

		//Scannerクラスのオブジェクトをクローズ
		janken.scanner.close();

	}

}
