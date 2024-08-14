import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathTest {

    private SimplifyPath sol;

    @Before
    public void setUp() {
        sol = new SimplifyPath();
    }

    @Test
    public void simplify_path_test_1() {
        String input = "/home/";
        String expected = "/home";
        String actual = sol.simplifyPath(input);

        assertEquals(expected, actual);
    }

    @Test
    public void simplify_path_test_2() {
        String input = "/home//foo/";
        String expected = "/home/foo";
        String actual = sol.simplifyPath(input);

        assertEquals(expected, actual);
    }

    @Test
    public void simplify_path_test_3() {
        String input = "/home/user/Documents/../Pictures";
        String expected = "/home/user/Pictures";
        String actual = sol.simplifyPath(input);

        assertEquals(expected, actual);
    }

    @Test
    public void simplify_path_test_4() {
        String input = "/../";
        String expected = "/";
        String actual = sol.simplifyPath(input);

        assertEquals(expected, actual);
    }


    @Test
    public void simplify_path_test_5() {
        String input = "/.../a/../b/c/../d/./";
        String expected = "/.../b/d";
        String actual = sol.simplifyPath(input);

        assertEquals(expected, actual);
    }

    @Test
    public void simplify_path_test_6() {
        String input = "/a/./b/../../c/";
        String expected = "/c";
        String actual = sol.simplifyPath(input);

        assertEquals(expected, actual);
    }

}
