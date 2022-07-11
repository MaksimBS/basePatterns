package observer_java;

import observer.DisplayElement;
import observer.Subject;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherDate) {
            WeatherDate weatherDate = (WeatherDate) observable;
            this.humidity = weatherDate.getHumidity();
            this.temp = weatherDate.getTemp();
            this.pressure = weatherDate.getPressure();
        };
    }

    @Override
    public void display() {
        System.out.println("Текущая температура:" + temp + " влажность " + humidity + " давление" + pressure);
    }
}
