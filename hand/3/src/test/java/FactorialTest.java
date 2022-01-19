import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest extends TestBase {
    @Test
    public void mainTest() {
        this.stdOutCaptureStart();
        Factorial.main(new String[] {});
        assertEquals(this.getStdOut(), "5! = 120\n");
    }

    @Test
    public void runTest() {
        Factorial app = new Factorial();

        this.stdOutCaptureStart();
        app.run(new String[] { "3" });
        assertEquals(this.getStdOut(), "3! = 6\n");

        this.stdOutCaptureStart();
        app.run(new String[] { "7" });
        assertEquals(this.getStdOut(), "7! = 5040\n");

        this.stdOutCaptureStart();
        app.run(new String[] { "9" });
        assertEquals(this.getStdOut(), "9! = 362880\n");

        this.stdOutCaptureStart();
        app.run(new String[] { "11" });
        assertEquals(this.getStdOut(), "11! = 39916800\n");
    }
}
