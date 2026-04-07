package behavioral.command.calculator;

public class MainCalculator {
    public static void main(String[] args) {
        CommandHandler handler = new CommandHandler();
        CasioCalculator calculator = new CasioCalculator(handler);

        System.out.println("lan 1");
        calculator.compute('+', 100);
        System.out.println(handler.result);

        System.out.println("lan 2");
        calculator.compute('-', 50);
        calculator.compute('-', 25);
        System.out.println(handler.result);

        System.out.println("lan 3");
        calculator.undo();
        System.out.println(handler.result);

        System.out.println("lan 4");
        calculator.redo();
        System.out.println(handler.result);

        System.out.println("lan 5");
        calculator.compute('+', 20);
        System.out.println(handler.result);

        System.out.println("lan 6");
        calculator.undo();
        calculator.undo();System.out.println(handler.result);

    }
}
