package KADAI.kadai_015;

public class CarExec_Chapter15 {

	//メインメソッドでクラス(設計図)をインスタンス化している
	public static void main(String[] args) {

		//車クラスのインスタンスを作成
		Car_Chapter15 car = new Car_Chapter15(1, 10);

		//結果を出力
		car.gearChange(3);
		car.run();

	}
}
