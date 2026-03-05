package kadai.kadai_021;

/*
appleの意味はりんご
bananaの意味はバナナ
grapeの意味はぶどう
orangeは辞書に存在しません
 */

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		String[] wordToSearch = { "apple", "banana", "grape", "orange" };

		for (String word : wordToSearch) {
			System.out.println(dictionary.search(word));
		}
	}

}
