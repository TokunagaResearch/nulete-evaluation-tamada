import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest extends TestBase {
    @Test
    void mainTest() {
        this.stdOutCaptureStart();
        LeapYear.main(new String[] {});
        assertEquals(this.getStdOut(), "2022\u5E74\u306F\u3046\u308B\u3046\u5E74\u3067\u306F\u3042\u308A\u307E\u305B\u3093\n");
    }

    @Test
    void runTest() {
        LeapYear instance = new LeapYear();

        this.stdOutCaptureStart();
        instance.run(new String[] {"2100"});
        assertEquals(this.getStdOut(), "2100\u5E74\u306F\u3046\u308B\u3046\u5E74\u3067\u306F\u3042\u308A\u307E\u305B\u3093\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"2000"});
        assertEquals(this.getStdOut(), "2000\u5E74\u306F\u3046\u308B\u3046\u5E74\u3067\u3059\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"2016"});
        assertEquals(this.getStdOut(), "2016\u5E74\u306F\u3046\u308B\u3046\u5E74\u3067\u3059\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"2015"});
        assertEquals(this.getStdOut(), "2015\u5E74\u306F\u3046\u308B\u3046\u5E74\u3067\u306F\u3042\u308A\u307E\u305B\u3093\n");
    }
}
