import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    protected BinaryOperator<Integer> add = (x, y) -> x + y;
    protected BinaryOperator<Integer> subtract = (x, y) -> x - y;
    protected BinaryOperator<Integer> multiply = (x, y) -> x * y;
    protected BinaryOperator<Integer> divide = (x, y) -> x / y;
    protected UnaryOperator<Integer> pow = x -> x * x;
    protected UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    protected Predicate<Integer> isPositive = x -> x > 0;
    protected Consumer<Object> println = System.out::println;
}