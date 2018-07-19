package design.pattern.observer.todo.displaymode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentStatus  {

    private final Logger LOGGER;
    private float temp;
    private float humidity;

    public CurrentStatus() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        LOGGER.info("Current weather status: temp - "+temp+", humidity - "+humidity+"%");
        System.out.println();
    }
}
