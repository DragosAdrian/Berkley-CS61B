import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleGridTest {

    @Test
    public void testBasic() {

        int[][] grid = {{1, 0, 0, 0},
                        {1, 0, 1, 0},
                        {1, 1, 1, 0}};
        int[][] darts = {{2, 0}, {2, 1}, {2, 2}, {2, 3}};
        int[] expected = {3, 2, 1, 0};

        validate(grid, darts, expected);
    }

    private void validate(int[][] grid, int[][] darts, int[] expected) {
        BubbleGrid sol = new BubbleGrid(grid);
        assertArrayEquals(expected, sol.popBubbles(darts));
    }
}
