package basic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {
    private Palindrome exercise = new Palindrome();

    @Test
    public void shouldSolveFirstInput() {
        assertThat(exercise.isPalindrome("gustavo")).isFalse();
    }

    @Test
    public void shouldSolveSecondInput() {
        assertThat(exercise.isPalindrome("civic")).isTrue();
    }
}