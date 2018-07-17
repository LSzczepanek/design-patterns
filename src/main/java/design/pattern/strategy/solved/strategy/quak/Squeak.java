package design.pattern.strategy.solved.strategy.quak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Squeak implements Quaking {

    private final Logger LOGGER;

    public Squeak() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }
    public void doQuack() {
        LOGGER.info("Squeak Squeak Squeak");
    }
}
