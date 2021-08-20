public class Addition {
    double result;

    public Addition(double a, double b){
        result= a + b;
    }

    public Addition(double a,double b, double c){
        result = a + b + c;
    }

    public Addition(double a, double b, double c, double d){
        result = a + b + c + d;
    }

    public void output(){
        System.out.println(result);
    }
}
