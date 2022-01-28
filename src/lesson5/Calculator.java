package lesson5;

public class Calculator {
    private int a;
    private int b;
    private double lastResult;
    private boolean alreadyWorked = false;
    private int countIterations = 6;

    public Calculator (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {return a;}

    public void setA(int a) {this.a = a;}

    public int getB() {return b;}

    public void setB(int b) {this.b = b;}

    public double getLastResult() {return lastResult;}

    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
        this.alreadyWorked = true;
    }

    public boolean getAlreadyWorked() {return alreadyWorked;}

    public void setAlreadyWorked(boolean flag) {this.alreadyWorked = flag;}

    public int getCountIterations() {return countIterations;}

    public void setCountIterations(int count) {
        this.countIterations = count;
    }

    public double plus (double a, double b) {
        return a + b;
    }

    public double minus (double a, double b) {
        return a - b;
    }

    public double multiply (double a, double b) {
        return a * b;
    }

    public double division (double a, double b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
            return Double.POSITIVE_INFINITY;
        }
    }

    public double factorial (double a) {

        int n = (int) a;
        double result=n;
        if (n == 0) {
            return result;
        } else {
            if (n>countIterations) {
                while (countIterations > 0 & n > 2) {
                    countIterations--;
                    n--;
                    result *= n;
                }
                return result;
            } else {
                while (n > 2) {
                    n--;
                    result *= n;
                }
                return result;
            }
        }
    }

    public double degree (double a, double b) {
        return Math.pow(a, b);
    }

    public String compare (double a, double b) {
        return (a>b)? a+">"+b : (a<b)? a+"<"+b : a+"="+b;
    }
}
