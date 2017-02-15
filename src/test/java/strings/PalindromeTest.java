package strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void valid() {
		assertThat(new Palindrome().isPalindrome("aoroa")).isTrue();
		assertThat(new Palindrome().isPalindrome("arara")).isTrue();
		assertThat(new Palindrome().isPalindrome("asdffdsa")).isTrue();
	}
	
	@Test
	public void invalid() {
		assertThat(new Palindrome().isPalindrome("great")).isFalse();
		assertThat(new Palindrome().isPalindrome("job")).isFalse();
		assertThat(new Palindrome().isPalindrome("algorithms")).isFalse();
	}
	
	@Test
	public void getFirstChar() {
		assertThat(new Palindrome().getFirstChar("great")).isEqualTo("g");
	}
	
	@Test
	public void getLastChar() {
		assertThat(new Palindrome().getLastChar("great")).isEqualTo("t");
	}
	
	@Test
	public void getMiddleWord() {
		assertThat(new Palindrome().getMiddleWord("great")).isEqualTo("rea");
	}
}
