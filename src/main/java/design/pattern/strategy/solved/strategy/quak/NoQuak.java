package design.pattern.strategy.solved.strategy.quak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoQuak implements Quaking {

    private final Logger LOGGER;

    public NoQuak() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }
    public void doQuack() {
        LOGGER.info("Silence...");
    }
}
