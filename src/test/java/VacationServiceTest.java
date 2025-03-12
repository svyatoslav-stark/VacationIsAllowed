import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;

public class VacationServiceTest {

    @Test
    void testFirstScenario() {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSecondScenario() {
        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
