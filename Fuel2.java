public class Fuel2 {
    private String carType;
    private double startKms;
    private double endKms;
    private double litersUsed;
    private double pricePerLiter;
    
    private FuelConsumptionStrategy calcStrategy;

    public Fuel2(String carType, double startKms, double endKms, double litersUsed, double pricePerLiter) {
        this.carType = carType;
        this.startKms = startKms;
        this.endKms = endKms;
        this.litersUsed = litersUsed;
        this.pricePerLiter = pricePerLiter;
    }

    public void setReadingMethod(FuelConsumptionStrategy strategy) {
        this.calcStrategy = strategy;
    }

    public double calcDistance() {
        return endKms - startKms;
    }

    public double calculate() {
        if (calcStrategy != null) {
            return calcStrategy.calculate(calcDistance(), litersUsed);
        }
        return 0.0;
    }

    public double totalCost() {
        return litersUsed * pricePerLiter;
    }

    public String getCarType() { return carType; }
}
