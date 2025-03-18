import org.junit.Test;
import static org.junit.Assert.*;

public class MinAndMaxTest {
    @Test
    public void testFindMinimumAndMaximum() {
         int[] numbers = {2, 3, 8, 7, 9};
        int[] result = MinAndMax.findMinimumAndMaximum(numbers);
        assertEquals(1000, result[0]);
        assertEquals(-1000, result[1]);
    }
    
    @Test
    public void testFindMinimumAndMaximum_SingleElementArray() {
        int[] numbers = {10};
        int[] result = MinAndMax.findMinimumAndMaximum(numbers);
        assertEquals(10, result[0]);
        assertEquals(10, result[1]);
    }

    @Test
    public void testFindMinimumAndMaximum_DuplicateElements() {
        int[] numbers = {10, 20, 20, 30, 30, 30};
        int[] result = MinAndMax.findMinimumAndMaximum(numbers);
        assertEquals(30, result[0]);
        assertEquals(10, result[1]);
    }
}
