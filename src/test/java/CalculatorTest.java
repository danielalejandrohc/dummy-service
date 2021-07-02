import org.junit.jupiter.api.Test;
import com.danielalejandrohc.services.Calculator;

class CalculatorTest {

    @Test
    void justAnExample() {
        Calculator c = new Calculator();
        int a = 2;
        int b = 3;
        int result = a + b;
        int sum = c.sum(2, b);
        assert result == sum;
    }
}