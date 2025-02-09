package KADAI.kadai_018;

//加藤花子を表すクラス 
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	// コンストラクタ
	public KatoHanako_Chapter18() {
		setGivenName(); // インスタンス化時に名前を設定
	}

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}

	@Override
	// 抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
