package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();

        //CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDate);

        weatherDate.setMeasurment(24, 80, 32f);
        weatherDate.setMeasurment(30, 56, 24f);
    }
}
