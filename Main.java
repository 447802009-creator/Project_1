public class Main {
    public static void main(String[] args) {

        Fuel2 car1 = new Fuel2("Toyota Prius", 10000, 10440, 10.0, 2.99);

        System.out.println("Gas Mileage Calculations");
        System.out.println("----------------------------------------");
        System.out.println("Car Type      : " + car1.getCarType());
        System.out.println("Distance      : " + car1.calcDistance() + " KM");


        car1.setReadingMethod(new MPGStrategy());
        System.out.printf("KM/L          : %.1f\n", car1.calculate());


        car1.setReadingMethod(new LP100KmStrategy());
        System.out.printf("L/100KM       : %.1f\n", car1.calculate());

        System.out.printf("Total Cost    : %.2f SAR\n", car1.totalCost());
        System.out.println("----------------------------------------");
    }
}
