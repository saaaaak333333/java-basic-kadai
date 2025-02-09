package KADAI.kadai_018;

//親クラス
abstract public class Kato_Chapter18 {

	//フィールド
	public String familyName = "加藤"; //姓を表す
	public String givenName; //名を表す
	public String address = "東京都中野区〇×"; //住所を表す

	//名を表すフィールドの値をセットする
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	//メソッド
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	//個別の紹介を出力する  (抽象メソッド)
	abstract public void eachIntroduce();

	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce(); // 各クラスの特定の紹介を呼び出す
	}

}
