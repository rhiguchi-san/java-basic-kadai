package kadai.kadai_018;

/*
名前は加藤太郎です
住所は東京都中野区〇×です
Javaが得意です

名前は加藤一郎です
住所は東京都中野区〇×です
好きな食べ物はリンゴです

名前は加藤花子です
住所は東京都中野区〇×です
趣味は読書です
 */

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();

		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}

}
