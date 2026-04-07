package behavioral.command.calculator;

import java.util.Stack;

public class CasioCalculator {
    Stack<ICommand> undos = new Stack<>();
    Stack<ICommand> redos = new Stack<>();
    CommandHandler handler;

    CasioCalculator(CommandHandler handler) {
        this.handler = handler;
    }

    void compute(char operator, float operand){
        ICommand command = new CalculatorCommand(operator, operand, handler);
        command.execute();
        redos.clear();
        undos.push(command);
    }

    void undo(){
        if(!undos.isEmpty()){
            ICommand command = undos.pop();
            redos.push(command);
            command.unexecute();
        }
    }

    void redo(){
        if(!redos.isEmpty()){
            ICommand command = redos.pop();
            undos.push(command);
            command.execute();
        }
    }
}
