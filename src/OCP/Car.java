package OCP;

public class Car extends Vehicle{
    // к классу Vehicle добавляется функционал
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
