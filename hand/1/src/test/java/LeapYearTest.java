import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest extends TestBase {
    @Test
    public void mainTest() {
        this.stdOutCaptureStart();
        LeapYear.main(new String[] {});
        assertEquals(this.getStdOut(), "2022年はうるう年ではありません\n");
    }

    @Test
    public void runTest() {
        LeapYear leapYear = new LeapYear();

        this.stdOutCaptureStart();
        leapYear.run(new String[] { "2000" });
        assertEquals(this.getStdOut(), "2000年はうるう年です\n");

        this.stdOutCaptureStart();
        leapYear.run(new String[] { "2016" });
        assertEquals(this.getStdOut(), "2016年はうるう年です\n");

        this.stdOutCaptureStart();
        leapYear.run(new String[] { "2100" });
        assertEquals(this.getStdOut(), "2100年はうるう年ではありません\n");

        this.stdOutCaptureStart();
        leapYear.run(new String[] { "2015" });
        assertEquals(this.getStdOut(), "2015年はうるう年ではありません\n");
    }
}