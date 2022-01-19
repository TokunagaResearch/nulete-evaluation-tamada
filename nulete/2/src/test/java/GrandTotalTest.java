import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GrandTotalTest extends TestBase {
    @Test
    void mainTest() {
        this.stdOutCaptureStart();
        GrandTotal.main(new String[] {});
        assertEquals(this.getStdOut(), "1\u304B\u308910\u307E\u3067\u306E\u7DCF\u548C\u306F55\u3067\u3059\n");
    }

    @Test
    void runTest() {
        GrandTotal instance = new GrandTotal();

        this.stdOutCaptureStart();
        instance.run(new String[] {"100"});
        assertEquals(this.getStdOut(), "1\u304B\u3089100\u307E\u3067\u306E\u7DCF\u548C\u306F5050\u3067\u3059\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"1000"});
        assertEquals(this.getStdOut(), "1\u304B\u30891000\u307E\u3067\u306E\u7DCF\u548C\u306F500500\u3067\u3059\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"500"});
        assertEquals(this.getStdOut(), "1\u304B\u3089500\u307E\u3067\u306E\u7DCF\u548C\u306F125250\u3067\u3059\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"50"});
        assertEquals(this.getStdOut(), "1\u304B\u308950\u307E\u3067\u306E\u7DCF\u548C\u306F1275\u3067\u3059\n");
    }
}
