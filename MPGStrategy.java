public class MPGStrategy implements FuelConsumptionStrategy {
    @Override
    public double calculate(double distance, double fuelUsed) {
        if (fuelUsed == 0) return 0;
        return (distance / 1.609344) / (fuelUsed / 3.785411784);
    }
}
