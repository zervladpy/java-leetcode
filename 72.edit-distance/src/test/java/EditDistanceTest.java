import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {

    private EditDistance sol;

    @Before
    public void setUp() {
        sol = new EditDistance();
    }

    @Test
    public void edit_distance_test_1() {
        String word1 = "horse", word2 = "ros";
        int expected = 3;
        int actual = sol.minDistance(word1, word2);

        assertEquals(expected, actual);
    }

    @Test
    public void edit_distance_test_2() {
        String word1 = "intention", word2 = "execution";
        int expected = 5;
        int actual = sol.minDistance(word1, word2);

        assertEquals(expected, actual);
    }

    @Test
    public void edit_distance_test_3() {
        String word1 = "", word2 = "a";
        int expected = 1;
        int actual = sol.minDistance(word1, word2);

        assertEquals(expected, actual);
    }

    @Test
    public void edit_distance_test_4() {
        String word1 = "b", word2 = "";
        int expected = 1;
        int actual = sol.minDistance(word1, word2);

        assertEquals(expected, actual);
    }

}
