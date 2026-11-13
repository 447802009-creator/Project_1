public class MPGStrategy implements FuelConsumptionStrategy {
    @Override
    public double calculate(double distance, double fuelUsed) {
        if (fuelUsed == 0) return 0;
        return distance / fuelUsed;
    }
}
