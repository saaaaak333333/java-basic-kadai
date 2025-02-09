package KADAI.kadai_018;

//加藤太郎を表すクラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	// コンストラクタ
	public KatoTaro_Chapter18() {
		setGivenName(); // インスタンス化時に名前を設定
	}

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "太郎";
	}

	@Override
	// 抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
