

import java.util.Scanner;

public class Main {
    public static void main(String[] args1) {

        Scanner input1 = new Scanner(System.in);

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

Fuel car1 = new Fuel(carType1, endKms1, startKms1, litersUsed1, pricePerLiter1);

int distance1 = car1.calcDistance(startKms1, endKms1);

double kmPerLiter1 = car1.calcKmPL(distance1, litersUsed1);

double litersPer100Km1 = car1.calcLiterP100Km(distance1);

double totalCost1 = car1.totalCost();

System.out.println("Gas Mileage Calculations");
System.out.println("----------------------------------------");
System.out.println("Car Type     : " + carType1);
System.out.println("Start KM     : " + startKms1);
System.out.println("End KM       : " + endKms1);
System.out.println("Distance     : " + distance1 + " KM");
System.out.println("----------------------------------------");
System.out.println("Liters Used  : " + litersUsed1);
System.out.println("KM/L         : " + kmPerLiter1);
System.out.println("Total Cost   : " + totalCost1 + " SAR");
System.out.println("L/100KM      : " + litersPer100Km1);
System.out.println("----------------------------------------");
    }
}
