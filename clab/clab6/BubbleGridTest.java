import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleGridTest {

    @Test
    public void testBasic() {

        int[][] grid = {{1, 1, 0, 1},
                        {1, 0, 0, 1},
                        {1, 1, 0, 1},
                        {1, 1, 1, 1}};
        int[][] darts = {{3, 0}, {3, 1}, {3, 2}, {3, 3}};
        int[] expected = {0, 0, 0, 0};

        validate(grid, darts, expected);
    }

    private void validate(int[][] grid, int[][] darts, int[] expected) {
        BubbleGrid sol = new BubbleGrid(grid);
        assertArrayEquals(expected, sol.popBubbles(darts));
    }
}
