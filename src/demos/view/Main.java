package demos.view;

import demos.calculates.DeviceA;
import demos.calculates.DeviceB;
import demos.calculates.Devices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input 2 numbers for calculating:\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Number 2: ");
        double num2 = sc.nextDouble();
        Devices deviceA = new DeviceA(num1, num2);
        double resultA = deviceA.Calculations();
        System.out.println("\nResult for device A is: " + resultA);
        Devices deviceB = new DeviceB(num1, num2);
        double resultB = deviceB.Calculations();
        System.out.println("Result for device B is: " + resultB);
    }
}
