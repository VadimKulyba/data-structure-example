package h4.services.postdfix.notation;

import h4.stack.StackX;

public class ParsePostService {
    private StackX stackX;
    private String input;

    public ParsePostService(String input) {
        this.input = input;
        stackX = new StackX(20);
    }

    public int doParse(){
        char symbol;
        int index;
        int operand1, operand2, answer;

        for (index = 0; index < input.length(); index++){
            symbol = input.charAt(index);
            if (symbol >= '0' && symbol <= '9') {
                stackX.push(symbol);
            } else {
                operand2 = stackX.pop() - '0';
                operand1 = stackX.pop() - '0';
                switch (symbol) {
                    case '+':
                        answer = operand1 + operand2;
                        break;
                    case '-':
                        answer = operand1 - operand2;
                        break;
                    case '*':
                        answer = operand1 * operand2;
                        break;
                    case '/':
                        answer = operand1 / operand2;
                        break;
                    default:
                        answer = 0;
                } // for example
                stackX.push(String.valueOf(answer).charAt(0));
            }
        }
        return stackX.pop();
    }
}
