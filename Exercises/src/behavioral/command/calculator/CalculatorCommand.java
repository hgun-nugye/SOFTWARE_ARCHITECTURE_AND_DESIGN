package behavioral.command.calculator;

public class CalculatorCommand implements ICommand {
    char operator;
    float operand;
    CommandHandler handler;

    public CalculatorCommand(char operator, float operand, CommandHandler handler) {
        this.operator = operator;
        this.operand = operand;
        this.handler = handler;
    }

    char undoOperator() {
        switch (operator) {
            case '+':
                return '-';
            case '-':
                return '+';
            case '*':
                return '/';
            case '/':
                return '*';
        }
        return '=';
    }

    @Override
    public void execute() {
        handler.handle(operator, operand);
    }

    @Override
    public void unexecute() {
        handler.handle(undoOperator(), operand);
    }
}
