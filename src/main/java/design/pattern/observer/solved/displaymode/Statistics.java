package design.pattern.observer.solved.displaymode;

import design.pattern.observer.solved.observation.Observable;
import design.pattern.observer.solved.observation.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Statistics implements Observer, DisplayElement {

    private final Logger LOGGER;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private Observable weatherData;

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
        LOGGER.info("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
        System.out.println();
    }
}
