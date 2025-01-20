package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors; // Sąrašas sensorių
    private final List<Integer> readings; // Atlikti matavimai

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        // Tikrina, ar visi sensoriai yra įjungti
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return !sensors.isEmpty(); // Sensorius yra įjungtas tik jei visi sensoriai įjungti ir sąrašas ne tuščias
    }

    @Override
    public void setOn() {
        // Įjungia visus valdomus sensorius
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        // Išjungia visus valdomus sensorius
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("Sensor is off or no sensors added!");
        }

        // Skaičiuoja vidurkį
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int average = sum / sensors.size();
        readings.add(average); // Prideda matavimą į istoriją
        return average;
    }

    public List<Integer> readings() {
        return new ArrayList<>(this.readings); // Grąžina visus atliktus matavimus
    }
}
