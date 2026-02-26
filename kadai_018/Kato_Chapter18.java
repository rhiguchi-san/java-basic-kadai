package kadai.kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";

	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("住所は" + address + "です");
	}

	//個々の紹介を出力する
	abstract public void eachIntroduce();

	//紹介を実行する
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		commonIntroduce();
		eachIntroduce();
	}
}
