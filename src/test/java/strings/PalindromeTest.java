package strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

	@Test
	public void valid() {
		assertThat(new Palindrome("aoroa").isPalindrome()).isTrue();
		assertThat(new Palindrome("arara").isPalindrome()).isTrue();
        assertThat(new Palindrome("asdffdsa").isPalindrome()).isTrue();
        assertThat(new Palindrome("arra").isPalindrome()).isTrue();
    }
	
	@Test
	public void invalid() {
		assertThat(new Palindrome("great").isPalindrome()).isFalse();
		assertThat(new Palindrome("job").isPalindrome()).isFalse();
		assertThat(new Palindrome("algorithms").isPalindrome()).isFalse();
	}
	
	@Test
	public void getFirstChar() {
		assertThat(Palindrome.getFirstChar("great")).isEqualTo("g");
	}
	
	@Test
	public void getLastChar() {
		assertThat(Palindrome.getLastChar("great")).isEqualTo("t");
	}
	
	@Test
	public void getMiddleWord() {
		assertThat(Palindrome.getMiddleWord("great")).isEqualTo("rea");
		assertThat(Palindrome.getMiddleWord("ga")).isEqualTo("");
		assertThat(Palindrome.getMiddleWord("g")).isEqualTo("");
	}

	@Test
    public void charCompare() {
	    assertThat(Palindrome.getFirstChar("a")).isEqualTo("a");
        assertThat(Palindrome.getLastChar("a")).isEqualTo("a");
    }
}
