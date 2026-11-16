import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        input1.useLocale(java.util.Locale.US);
        java.util.Locale.setDefault(java.util.Locale.US);

        System.out.print("Enter car type: ");
        String carType1 = input1.nextLine();

        System.out.print("Enter start kilometers: ");
        int startKms1 = input1.nextInt();

        System.out.print("Enter end kilometers: ");
        int endKms1 = input1.nextInt();

        System.out.print("Enter liters used: ");
        double litersUsed1 = input1.nextDouble();

        System.out.print("Enter price per liter: ");
        double pricePerLiter1 = input1.nextDouble();

        Fuel2 car1 = new Fuel2(carType1, startKms1, endKms1,
                litersUsed1, pricePerLiter1);

        double distance1 = car1.calcDistance();

        car1.setReadingMethod(new MPGStrategy());
        double mpg1 = car1.calculate();

        car1.setReadingMethod(new LP100KmStrategy());
        double litersPer100Km1 = car1.calculate();

        double totalCost1 = car1.totalCost();

        System.out.println("Gas Mileage Calculations");
        System.out.println("----------------------------------------");
        System.out.println("Car Type       : " + carType1);
        System.out.println("Start KM       : " + startKms1);
        System.out.println("End KM         : " + endKms1);
        System.out.printf("Distance       : %.1f KM%n", distance1);
        System.out.println("----------------------------------------");
        System.out.printf("Liters Used    : %.1f%n", litersUsed1);
        System.out.printf("MPG            : %.1f%n", mpg1);
        System.out.printf("Total Cost     : %.1f SAR%n", totalCost1);
        System.out.printf("L/100KM        : %.1f%n", litersPer100Km1);
        System.out.println("----------------------------------------");

        input1.close();
    }
}
