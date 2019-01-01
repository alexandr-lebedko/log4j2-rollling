package net.lebedko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 250; i++) {
            logger.info("This is the " + i + " time I say 'Hello World'.");
            Thread.sleep(2);
        }
    }
}
