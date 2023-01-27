public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int b = calc.minus.apply(1, 1);
        int a = calc.plus.apply(1, 2);
        int c = calc.zerocheck.apply(a, b);
        System.out.println(c);

    }
}