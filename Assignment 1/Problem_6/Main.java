public class Main {
    public static void main(String[] args) {

        int z = 8;
        System.out.println("z : " + z);

        int a = (z++) + (++z);
        System.out.println("a : " + a);

        int b = (z--) + (--z);
        System.out.println("b : " + b);

        int c = z++;
        System.out.println("c : " + c);

        int d = ++z;
        System.out.println("d : " + d);

        int e = z--;
        System.out.println("e : " + e);

        int f = --z;
        System.out.println("f : " + f);

    }
}
