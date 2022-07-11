package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Текущая температура:" + temp + " влажность " + humidity + " давление" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


}
