package design.pattern.observer.solved.displaymode;

import design.pattern.observer.solved.observation.Observable;
import design.pattern.observer.solved.observation.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forecast implements Observer, DisplayElement {

    private final Logger LOGGER;
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable weatherData;

    public Forecast() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void signUpForObservable(Observable observable) {
        this.weatherData = observable;
        weatherData.registerObserver(this);
        LOGGER.info(this.getClass().getSimpleName()+" signed up for: "+observable.getClass().getSimpleName());
    }

    public void leaveObservable() {
        weatherData.removeObserver(this);
        LOGGER.info(this.getClass().getSimpleName()+" stop getting updates from: "+weatherData.getClass().getSimpleName());
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
