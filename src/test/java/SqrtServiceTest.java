import org.example.cyclesNewJava.service.SqrtService;
import org.junit.Assert;
import org.junit.Test;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 5;
        int actual = service.calcSqrt(25);

        Assertions
    }
}
