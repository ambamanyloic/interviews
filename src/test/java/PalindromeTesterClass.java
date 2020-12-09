import com.loic.projectfacebook.leetcode.easy.IsPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PalindromeTesterClass {

    @Test
    public void shouldRecognizeOne() {
        assertEquals(true, IsPalindrome.isPalindrome("aa"));
    }

    @Test
    public void shouldRecognizeTwo() {
        assertEquals(true, IsPalindrome.isPalindrome("00","aa"));
    }


}
