package ie.atu.Caalc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd()
    {
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20,20))
    }

}
