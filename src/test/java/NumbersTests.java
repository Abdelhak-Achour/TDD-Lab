import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTests {

    @Test
    public void sumWithNegative(){
        Assertions.assertThrows(NegativeArgException.class, () -> Calc.sum(4, -3));
    }

    @Test
    public void sumTwoPositives(){
        Assertions.assertEquals(7, Calc.sum(4, 3));
    }
}
