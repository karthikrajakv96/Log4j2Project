import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log2Main {
    private static final Logger log = LogManager.getLogger(Log2Main.class);

    public static void main(String[] args) {
        for (int i = 0; i < 600000000; i++)
            log.info("Testing log" + i);
    }

}
