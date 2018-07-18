package design.pattern.observer.nativejavasolved;

import design.pattern.observer.nativejavasolved.displaymode.CurrentStatus;
import design.pattern.observer.nativejavasolved.displaymode.Forecast;
import design.pattern.observer.nativejavasolved.displaymode.Statistics;

public class ObserverApp {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentStatus currentConditions = new CurrentStatus(weatherData);
		Statistics statistics = new Statistics(weatherData);
		Forecast forecast = new Forecast(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

		weatherData.setMeasurements(26.6f, 65, 1013.1f);
		weatherData.setMeasurements(20.6f, 45, 1010.1f);
		weatherData.setMeasurements(15.6f, 75, 1013.1f);


		weatherData.setMeasurements(6.6f, 35, 1000.1f);
		weatherData.setMeasurements(10.6f, 25, 1019.1f);
		weatherData.setMeasurements(14.6f, 55, 1045.1f);
	}
}
