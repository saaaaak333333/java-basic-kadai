package KADAI.kadai_015;

public class Car_Chapter15 {
	// フィールド（内部データ）
	private int gear = 0; //1速から5速のギアを表すフィールド
	private int speed = 0; //ギアチェンジ後の速度を表す	フィールド

	// コンストラクタ（初期化処理）
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	//ギアの値により速度を変えるメソッド
	public void gearChange(int afterGear) {
		int beforeGear = gear; // 変更前のギアを保存
		gear = afterGear;
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");

		// ギアに応じた速度を取得
		speed = switch (afterGear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}

	//ギアチェンジ後の速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
