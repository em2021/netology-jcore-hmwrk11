import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    protected BinaryOperator<Integer> add = (x, y) -> x + y;
    protected BinaryOperator<Integer> subtract = (x, y) -> x - y;
    protected BinaryOperator<Integer> multiply = (x, y) -> x * y;
    /*    Операция divide не будет работать если y равно 0 из-за ошибки деления на 0
          Варианты решения проблемы:
          1) Лямбда-выражение с тернарным оператором,
          который проверяет если делитель равен 0
          2) Лямбда-выражение с блоком кода с блоком try catch внутри,
          который ловит ArithmeticException
     */
    protected BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;
    protected UnaryOperator<Integer> pow = x -> x * x;
    protected UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    protected Predicate<Integer> isPositive = x -> x > 0;
    protected Consumer<Object> println = System.out::println;
}