package demos.calculates;

public class DeviceA extends Devices {
    public DeviceA(double num1, double num2) {
        super(num1, num2);
    }
    @Override
    public double Calculations(){
        return num1 * num2;
    }
}
