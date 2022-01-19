import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrandTotalTest extends TestBase {
    @Test
    public void mainTest() {
        this.stdOutCaptureStart();
        GrandTotal.main(new String[] {});
        assertEquals(this.getStdOut(), "1から10までの総和は55です\n");
    }

    @Test
    public void runTest() {
        GrandTotal app = new GrandTotal();

        this.stdOutCaptureStart();
        app.run(new String[] { "50" });
        assertEquals(this.getStdOut(), "1から50までの総和は1275です\n");

        this.stdOutCaptureStart();
        app.run(new String[] { "100" });
        assertEquals(this.getStdOut(), "1から100までの総和は5050です\n");

        this.stdOutCaptureStart();
        app.run(new String[] { "500" });
        assertEquals(this.getStdOut(), "1から500までの総和は125250です\n");

        this.stdOutCaptureStart();
        app.run(new String[] { "1000" });
        assertEquals(this.getStdOut(), "1から1000までの総和は500500です\n");
    }
}
