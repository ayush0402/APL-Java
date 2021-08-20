public class ConstructorOverloading {
    private double result;
    private int result1;

    public ConstructorOverloading(int a, int b){
        result1 = a + b;
    }
    public ConstructorOverloading(int a, int b, int c){
        result1 = a + b + c;
    }
    public ConstructorOverloading(double a , double b){
        result = a + b;
    }
    public ConstructorOverloading(double a , double b, double c){
        result = a + b +c;
    }

    public void display(){
        System.out.println(result);
    }

    public void display1(){
        System.out.println(result1);
    }
}
