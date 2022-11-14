package hillel.suraieva.car;

public class Car {
    private String number;

    public Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    private void startElectricity() {
        System.out.println("Start Electricity...");
    }

    private void startCommand() {
        System.out.println("Start Command...");
    }

    private void startFuelSystem() {
        System.out.println("Start Fuel System...");
    }


    public void start (String number) {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car " + number +" started");
    }

}
