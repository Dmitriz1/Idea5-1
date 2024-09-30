import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.CalculateService;

public class CalculateServiceTest {
    @Test
    void ShouldRestForThreeMonths() {
        CalculateService calculate = new CalculateService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = calculate.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldRestForTwoMonths() {
        CalculateService calculate = new CalculateService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = calculate.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}