import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest {

    @Test
    public void testAddition() {
        Calc c = new Calc();
        assertEquals(5, c.add(2, 3));
    }
    
    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2));
    }
}

