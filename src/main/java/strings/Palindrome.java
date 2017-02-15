package strings;

public class Palindrome {

	public boolean isPalindrome(final String str) {
		return checkWord(str);
	}
	
	private boolean checkWord(final String str) {
		if (str.length() <= 1)
			return true;
		if (!getFirstChar(str).equals(getLastChar(str)))
			return false;
		
		return checkWord(getMiddleWord(str));
	}

	String getMiddleWord(String str) {
		return str.substring(1, str.length()-1);
	}

	String getLastChar(String str) {
		return str.substring(str.length()-1);
	}

	String getFirstChar(String str) {
		return str.substring(0, 1);
	}
}
