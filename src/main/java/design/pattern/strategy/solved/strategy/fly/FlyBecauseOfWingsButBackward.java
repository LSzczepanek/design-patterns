package design.pattern.strategy.solved.strategy.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyBecauseOfWingsButBackward implements Flying {

    private final Logger LOGGER;

    public FlyBecauseOfWingsButBackward() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void doFly() {
        LOGGER.info("I am flying because of I have wings, but I am doing other way");
    }
}
