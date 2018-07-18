package design.pattern.observer.todo.displaymode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Statistics {

    private final Logger LOGGER;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public Statistics() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }
        display();
    }

    public void display() {
        LOGGER.info("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
        System.out.println();
    }
}
