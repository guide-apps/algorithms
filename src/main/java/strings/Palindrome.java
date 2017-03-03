package strings;

public class Palindrome {
    final String word;

    public Palindrome(final String word) {
        this.word = word;
    }

    public boolean isPalindrome() {
		return checkWord(this.word);
	}
	
	private boolean checkWord(final String str) {
		if (str.length() <= 0)
			return true;

		return getFirstChar(str).equals(getLastChar(str)) && checkWord(getMiddleWord(str));
	}

	public static String getMiddleWord(String str) {
		if (str.length() == 1)
			return "";

		return str.substring(1, str.length()-1);
	}

    public static String getLastChar(String str) {
		return str.substring(str.length()-1);
	}

    public static String getFirstChar(String str) {
		return str.substring(0, 1);
	}
}
