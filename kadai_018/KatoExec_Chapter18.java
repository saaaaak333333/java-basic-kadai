package KADAI.kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {

		//インスタンス化
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		//紹介を実行する
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();

	}

	/*
	ポリモフィズムを使用
	// 親クラス型の配列に子クラスのインスタンスを格納
	Kato_Chapter18[] familyMembers = new Kato_Chapter18[] {
			new KatoTaro_Chapter18(),
			new KatoIchiro_Chapter18(),
			new KatoHanako_Chapter18()
	};
	//すべての家族メンバーの紹介を実行
	for(Kato_Chapter18 member : familyMembers){
		member.execIntroduce(); // 各メンバーの具体的な紹介メソッドを呼び出す
	}
	*/
}
