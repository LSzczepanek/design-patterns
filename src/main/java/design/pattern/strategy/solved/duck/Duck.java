package design.pattern.strategy.solved.duck;


import design.pattern.strategy.solved.strategy.fly.Flying;
import design.pattern.strategy.solved.strategy.quak.Quaking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Duck {
    private final Logger LOGGER;

    protected Flying flying;
    protected Quaking quaking;

    Duck(){
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void swim() {
        LOGGER.info("swim");
    }

    public void show() {
        LOGGER.info("Just a duck");
    }

    public void quack() {
        this.quaking.doQuack();
    }

    public void fly() {
        this.flying.doFly();
    }
}

