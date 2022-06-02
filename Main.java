public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.add.apply(1, 2);
        int b = calc.subtract.apply(10, 2);
        int c = calc.multiply.apply(5, 4);
        int d = calc.divide.apply(10, 2);
        int e = calc.pow.apply(5);
        int f = calc.abs.apply(-4);
        boolean g = calc.isPositive.test(-2);
        int[] test = {a, b, c, d, e, f};
        for (int x : test) {
            calc.println.accept(x);
        }
        calc.println.accept(g);
    }
}