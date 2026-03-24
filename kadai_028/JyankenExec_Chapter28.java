package kadai.kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {

		Jyanken_Chapter28 jyanken_chapter28 = new Jyanken_Chapter28();

		String choice = jyanken_chapter28.getMyChoice();

		String choice2 = jyanken_chapter28.getRandom();

		jyanken_chapter28.playGame(choice, choice2);
	}

}
