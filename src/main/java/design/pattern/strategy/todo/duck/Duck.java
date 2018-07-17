package design.pattern.strategy.todo.duck;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck {
    private final Logger LOGGER;

    public Duck(){
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }


    public void quack() {
        LOGGER.info("doQuack");
    }

    public void swim() {
        LOGGER.info("swim");
    }

    public void show() {
        LOGGER.info("Just a duck");
    }
}

