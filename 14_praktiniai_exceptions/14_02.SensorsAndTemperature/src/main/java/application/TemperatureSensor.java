package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;
    private final Random random;

    public TemperatureSensor() {
        this.isOn = false; // Pradžioje sensorius išjungtas
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("Sensor is off!");
        }
        // Grąžina temperatūrą intervale -30...30
        return this.random.nextInt(61) - 30;
    }
}
