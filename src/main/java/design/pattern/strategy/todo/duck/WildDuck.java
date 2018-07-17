package design.pattern.strategy.todo.duck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildDuck extends Duck {
    private final Logger LOGGER;

    public WildDuck() {
        LOGGER = LoggerFactory.getLogger(this.getClass());

    }


    public void show() {
        LOGGER.info("Looks like wild duck");
    }
}
