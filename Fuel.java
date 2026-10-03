public class Fuel {
    private String carType;
    private int startKms;
    private int endKms;
    private double litersUsed;
    private double pricePerLiter;

    public Fuel() {
        this.carType = "";
        this.startKms = 0;
        this.endKms = 0;
        this.litersUsed = 0.0;
        this.pricePerLiter = 0.0;
    }

    public Fuel(String carType, int endKms, int startKms, double litersUsed, double pricePerLiter) {
        this.carType = carType;
        this.endKms = endKms;
        this.startKms = startKms;
        this.litersUsed = litersUsed;
        this.pricePerLiter = pricePerLiter;
    }

    public int calcDistance(int startKms, int endKms) {
        return endKms - startKms;
    }

    public double calcKmPL(int dist, double liters) {
        if (liters == 0) return 0;
        return dist / liters;
    }

    public double calcLiterP100Km(int dist) {
        if (dist == 0) return 0;
        return (this.litersUsed / dist) * 100;
    }

    public double totalCost() {
        return this.litersUsed * this.pricePerLiter;
    }

    public void setCarType(String carType) { this.carType = carType; }
    public void setStartKms(int startKms) { this.startKms = startKms; }
    public void setEndKms(int endKms) { this.endKms = endKms; }
    public void setLitersUsed(double litersUsed) { this.litersUsed = litersUsed; }
    public void setPricePerLiter(double pricePerLiter) { this.pricePerLiter = pricePerLiter; }

    public String getCarType() { return carType; }
    public int getStartKms() { return startKms; }
    public int getEndKms() { return endKms; }
    public double getLitersUsed() { return litersUsed; }
    public double getPricePerLiter() { return pricePerLiter; }
}
