public class MilitaryTank implements Vehicle {

    private int milesToGo = 2000;
    private boolean hasDriver = false;

    public MilitaryTank() {

        System.out.println("Tank created. " + getMilesToGo() + " miles to go!");
    }

    @Override
    public void drive() {
        if (!hasDriver) {
            System.out.println("Tank didn't drive - there's no driver");
        } else {
            milesToGo -= 5;
            System.out.println("Tank drove 5 miles - " + milesToGo + " miles to go");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.getAge() >= 25) {
            hasDriver = true;
            System.out.println("Driver changed to " + driver.getName());
        } else {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() +
                    ", but must be 25 or older to drive a tank.");
        }
    }

    @Override
    public int getMilesToGo() {
        return milesToGo;
    }
}