package behavioral.command.calculator;

public class CommandHandler {
    float result=0;

    void handle(char operator, float operand) {
        switch (operator) {
            case '+':
                result += operand;
                break;
            case '-':
                result -= operand;
                break;
            case '*':
                result *= operand;
                break;
            case '/':
                result /= operand;
                break;
        }
    }
}
