public class Methods extends Arithmetic {

    @Override
    void Add(int x, int y) {
        System.out.println(x + y);
    }

    @Override
    void Subtract(int x, int y) {
        System.out.println(x - y);
    }

    @Override
    void Multiply(int x, int y) {
        System.out.println(x * y);
    }

    @Override
    void Divide(int x, int y) {
        System.out.println((double) x / y);
    }
}
