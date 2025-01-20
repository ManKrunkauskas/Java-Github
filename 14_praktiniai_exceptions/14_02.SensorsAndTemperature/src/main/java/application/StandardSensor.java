package application;

public class StandardSensor implements Sensor {
    private final int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true; // Visada įjungta
    }

    @Override
    public void setOn() {
        // Nieko nedaro, nes sensorius visada įjungtas
    }

    @Override
    public void setOff() {
        // Nieko nedaro, nes sensorius visada įjungtas
    }

    @Override
    public int read() {
        return this.value; // Grąžina sensoriaus reikšmę
    }
}
