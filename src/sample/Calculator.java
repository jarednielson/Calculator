package sample;

/**
 * Created by jarednielson on 10/14/15.
 * Calculator object
 */
public class Calculator {
    private double a;
    private double b;

    public Calculator(){
        this.a = 0;
        this.b = 0;
    }

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Calculator(double a, String b){
        this.a = a;
        this.b = Double.parseDouble(b);
    }

    public Calculator(String a, double b){
        this.a = Double.parseDouble(a);
        this.b = b;
    }

    public Calculator(String a, String b){
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
    }

    public double add(){
        return a + b;
    }

    public double subtract(){
        return a - b;
    }

    public double multiply(){
        return a * b;
    }

    public double divide() {
        if(b != 0) {
            return a / b;
        }
        else{
            return 0;
        }
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setA(String a) {
        this.a = Double.parseDouble(a);
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setB(String b){
        this.b = Double.parseDouble(b);
    }
}
