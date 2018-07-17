package design.pattern.strategy.solved.strategy.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotFlying implements Flying {

    private final Logger LOGGER;

    public NotFlying() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void doFly() {
        LOGGER.info("I can't fly, sad");
    }
}
