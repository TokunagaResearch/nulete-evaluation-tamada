import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest extends TestBase {
    @Test
    void mainTest() {
        this.stdOutCaptureStart();
        HelloWorld.main(new String[] {});
        assertEquals(this.getStdOut(), "Hello, World!\n");
    }

    @Test
    void runTest() {
        HelloWorld instance = new HelloWorld();

        this.stdOutCaptureStart();
        instance.run(new String[] {"Yamada"});
        assertEquals(this.getStdOut(), "Hello, Yamada!\n");

        this.stdOutCaptureStart();
        instance.run(new String[] {"Tanaka"});
        assertEquals(this.getStdOut(), "Hello, Tanaka!\n");
    }
}
