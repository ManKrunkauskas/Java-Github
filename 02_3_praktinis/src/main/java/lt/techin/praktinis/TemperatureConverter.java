package lt.techin.praktinis;

public class TemperatureConverter {

    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = temperatureCelsius * 9.0 / 5.0 + 32;
        System.out.println(temperatureFahrenheit);
    }
}

