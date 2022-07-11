package observer_java;

import observer.WeatherDate;

public class WeatherStation {
    public static void main(String[] args) {
        observer.WeatherDate weatherDate = new WeatherDate();

        weatherDate.setMeasurment(24, 80, 32f);
        weatherDate.setMeasurment(30, 56, 24f);
    }
}
