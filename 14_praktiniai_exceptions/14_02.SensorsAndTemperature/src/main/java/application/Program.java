package application;

public class Program {

    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(3));
        ka.addSensor(new StandardSensor(7));

        ka.setOn();

        System.out.println("Reading: " + ka.read());
        System.out.println("Readings history: " + ka.readings());
    }
}
