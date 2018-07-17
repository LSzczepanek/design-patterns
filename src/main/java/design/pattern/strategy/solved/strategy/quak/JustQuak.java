package design.pattern.strategy.solved.strategy.quak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustQuak implements Quaking {

    private final Logger LOGGER;

    public JustQuak() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }
    public void doQuack() {
        LOGGER.info("Quack Quack Quack");
    }
}
