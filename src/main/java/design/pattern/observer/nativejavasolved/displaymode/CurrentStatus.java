package design.pattern.observer.nativejavasolved.displaymode;

import design.pattern.observer.nativejavasolved.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;
	
public class CurrentStatus implements Observer, DisplayElement {
	private final Logger LOGGER;
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentStatus(Observable observable) {
		LOGGER = LoggerFactory.getLogger(this.getClass());
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		LOGGER.info("Current conditions: " + temperature
			+ "F degrees and " + humidity + "% humidity");
		System.out.println();
	}
}
