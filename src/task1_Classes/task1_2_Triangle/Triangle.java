package task1_Classes.task1_2_Triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;

    private double hp(double a, double b, double c) {  // hp - half perimeter
        return (a + b + c) / 2;
    }

    public Triangle(double a, double b, double c) {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.println("err");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
