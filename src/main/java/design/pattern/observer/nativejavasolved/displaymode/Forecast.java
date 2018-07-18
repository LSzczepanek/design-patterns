package design.pattern.observer.nativejavasolved.displaymode;

import design.pattern.observer.nativejavasolved.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

public class Forecast implements Observer, DisplayElement {
	private final Logger LOGGER;
	private float currentPressure = 29.92f;
	private float lastPressure;

	public Forecast(Observable observable) {
		LOGGER = LoggerFactory.getLogger(this.getClass());
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
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
