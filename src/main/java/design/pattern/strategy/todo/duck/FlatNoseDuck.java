package design.pattern.strategy.todo.duck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlatNoseDuck extends Duck {
    private final Logger LOGGER;

    public FlatNoseDuck() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }


    public void show() {
        LOGGER.info("Looks like flat nose duck");
    }
}
