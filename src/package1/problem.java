package package1;

import java.util.HashMap;
import java.util.Map;

public class problem {

	static boolean match_words(String dictionary[], String sentence[], int n, int m) {
		Map<String, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(dictionary[i])) {
				mp.put(dictionary[i], mp.get(dictionary[i]) + 1);
			} else {
				mp.put(dictionary[i], 1);
			}
		}
		for (int i = 0; i < m; i++) {
			if (mp.containsKey(sentence[i]))
				mp.put(sentence[i], mp.get(sentence[i]) - 1);
			else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String dictionary[] = { "testing", "automation", "sdet", "selenium", "maven", "jenkins", "cucumber", "sprint",
				"bdd" };

		int n = dictionary.length;
		String sentence[] = { "automation", "sdet", "maven", "cucumber", "bdd" };
		int m = sentence.length;

		if (match_words(dictionary, sentence, n, m))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
