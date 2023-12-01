package demos.calculates;

public abstract class Devices {
    double num1;
    double num2;

    public Devices(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public abstract double Calculations();
}

