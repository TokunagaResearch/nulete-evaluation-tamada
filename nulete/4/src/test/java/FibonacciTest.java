import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest extends TestBase {
    @Test
    void mainTest() {
        this.stdOutCaptureStart();
        Fibonacci.main(new String[] {});
        assertEquals(this.getStdOut(), "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 \n");
    }

    @Test
    void runTest() {
        Fibonacci instance = new Fibonacci();

        this.stdOutCaptureStart();
        instance.run(new String[] {"15"});
        assertEquals(this.getStdOut(), "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 \n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"8"});
        assertEquals(this.getStdOut(), "1 1 2 3 5 8 13 21 \n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"11"});
        assertEquals(this.getStdOut(), "1 1 2 3 5 8 13 21 34 55 89 \n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"3"});
        assertEquals(this.getStdOut(), "1 1 2 \n");
    }
}
