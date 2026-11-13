public class LP100KmStrategy implements FuelConsumptionStrategy {
    @Override
    public double calculate(double distance, double fuelUsed) {
        if (distance == 0) return 0;
        return (fuelUsed / distance) * 100;
    }
}
