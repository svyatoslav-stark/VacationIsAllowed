import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Vacation.csv")
    public void testVacationMonthsVacation(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
