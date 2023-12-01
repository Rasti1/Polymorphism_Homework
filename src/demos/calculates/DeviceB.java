package demos.calculates;

public class DeviceB extends Devices{
    private static  final double COEFFICIENT = 1.5;
    public DeviceB(double num1, double num2) {
        super(num1, num2);
    }
    @Override
    public double Calculations(){
        return (num1 + num2) * COEFFICIENT;
    }
}
