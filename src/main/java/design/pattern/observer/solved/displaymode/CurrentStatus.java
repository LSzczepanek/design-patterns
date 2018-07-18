package design.pattern.observer.solved.displaymode;

import design.pattern.observer.solved.observation.Observable;
import design.pattern.observer.solved.observation.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentStatus implements Observer, DisplayElement {

    private final Logger LOGGER;
    private float temp;
    private float humidity;
    private Observable weatherData;

    public CurrentStatus() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
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
        LOGGER.info("Current weather status: temp - "+temp+", humidity - "+humidity+"%");
        System.out.println();
    }
}
