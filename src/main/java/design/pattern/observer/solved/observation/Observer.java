package design.pattern.observer.solved.observation;

public interface Observer {

    void update(float temp, float humidity, float pressure);

    void signUpForObservable(Observable observable);

    void leaveObservable();
}
