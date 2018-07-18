package design.pattern.observer.todo;

import design.pattern.observer.todo.displaymode.CurrentStatus;

public class WeatherData {

    private float temp;
    private float humidity;
    private float pressure;
    private CurrentStatus currentStatus;

    public WeatherData() {
        currentStatus = new CurrentStatus();
    }

    public void doUpdate(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        currentStatus.update(this.temp, this.humidity, this.pressure);
    }
}
