package kadai.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public void setGivenName() {
		givenName = "太郎";
	}

	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		commonIntroduce();
		eachIntroduce();
	}
}
