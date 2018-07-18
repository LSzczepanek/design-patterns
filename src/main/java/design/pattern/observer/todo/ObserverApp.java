package design.pattern.observer.todo;

/*
1. There is some weather station which produces some data from sensors
2. We have method which is getting those updates from sensors (doUpdate method)
3. We need to add currently created new display mode for data
4. It need to be done everytime when updates come to WeatherData
5. Add to the current Statistics to be showed
6. We need to add now Forecast to be able getting data from WeatherData class
7. Is your solution good? What happens if we would like to add another type of displaying those data?
8. What if we would like to stop receiving data in CurrentStatus and get it from another source?
 */
public class ObserverApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.doUpdate(80, 65, 30.4f);
        weatherData.doUpdate(82, 70, 29.2f);
        weatherData.doUpdate(78, 90, 29.2f);

        weatherData.doUpdate(26.6f, 65, 1013.1f);
        weatherData.doUpdate(20.6f, 45, 1010.1f);
        weatherData.doUpdate(15.6f, 75, 1013.1f);


        weatherData.doUpdate(6.6f, 35, 1000.1f);
        weatherData.doUpdate(10.6f, 25, 1019.1f);
        weatherData.doUpdate(14.6f, 55, 1045.1f);

    }
}
