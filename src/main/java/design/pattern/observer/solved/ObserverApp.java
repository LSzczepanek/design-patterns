package design.pattern.observer.solved;

import design.pattern.observer.solved.displaymode.CurrentStatus;
import design.pattern.observer.solved.displaymode.Forecast;
import design.pattern.observer.solved.displaymode.Statistics;

public class ObserverApp {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentStatus currentStatus = new CurrentStatus();
        currentStatus.signUpForObservable(weatherData);

        Statistics statistics = new Statistics();
        statistics.signUpForObservable(weatherData);

        Forecast forecast = new Forecast();
        forecast.signUpForObservable(weatherData);

        weatherData.doUpdate(80, 65, 30.4f);
        weatherData.doUpdate(82, 70, 29.2f);
        weatherData.doUpdate(78, 90, 29.2f);

        weatherData.doUpdate(26.6f, 65, 1013.1f);
        weatherData.doUpdate(20.6f, 45, 1010.1f);
        weatherData.doUpdate(15.6f, 75, 1013.1f);

        currentStatus.leaveObservable();

        weatherData.doUpdate(6.6f, 35, 1000.1f);
        weatherData.doUpdate(10.6f, 25, 1019.1f);
        weatherData.doUpdate(14.6f, 55, 1045.1f);


    }
}
