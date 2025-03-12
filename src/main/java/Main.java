import ru.netology.services.VacationService;

public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService();
        System.out.println(service.calculate(10000, 3000, 20000));
    }
}
