package OCP;

public class Bus extends Vehicle{

    // к классу Vehicle добавляется функционал
    
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
