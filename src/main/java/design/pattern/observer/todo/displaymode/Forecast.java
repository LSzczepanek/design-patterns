package design.pattern.observer.todo.displaymode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forecast {

    private final Logger LOGGER;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public Forecast() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        LOGGER.info("Forecast: ");
        if (currentPressure > lastPressure) {
           LOGGER.info("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
           LOGGER.info("More of the same");
        } else if (currentPressure < lastPressure) {
           LOGGER.info("Watch out for cooler, rainy weather");
        }
        System.out.println();
    }
}
