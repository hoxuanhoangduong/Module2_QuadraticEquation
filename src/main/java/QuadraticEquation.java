public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public double getDuplicateRoot() {
        return -this.b / (2 * this.a);
    }

    public String result() {
        if (this.getDiscriminant() < 0) {
            return "The equation has no root";
        } else if (this.getDiscriminant() == 0) {
            return "The equation has only one root is : " + this.getDuplicateRoot();
        }   else {
            return "The equation has two roots is : " + this.getRoot1() + " and " + this.getRoot2();
        }
    }

    public String display() {
        return this.a + "x2 + " + this.b + "x + " + this.c + " = 0";
    }
}
