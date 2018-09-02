package h4.services.postdfix.notation;

import h4.stack.StackX;

// ABC+DE*++*
public class InToPostService {
    private StackX stackX;
    private String input;
    private String output = "";

    public InToPostService(String input) {
        this.input = input;
        int size = input.length();
        stackX = new StackX(size);
    }

    public String doTrans(){
        for (int index = 0; index < input.length(); index++){
            char symbol = input.charAt(index);
            switch (symbol) {
                case '+':
                case '-':
                    gotOper(symbol, 1);
                    break;
                case '*':
                case '/':
                    gotOper(symbol, 2);
                    break;
                case '(':
                    stackX.push(symbol);
                case ')':
                    gotParen(symbol);
                    break;
                default:
                    output = output + symbol;
                    break;
            }
        }

        while(!stackX.isEmpty()){
            output = output + stackX.pop();
        }
        return output;
    }

    private void gotOper(char symbol, int priority){
        while (!stackX.isEmpty()){
            char top = stackX.pop();
            if (top == '('){
                stackX.push(top);
                break;
            } else {
                int lastStackPriority;
                if (top == '+' || top == '-'){
                    lastStackPriority = 1;
                } else { lastStackPriority = 2; }

                if (lastStackPriority != priority) {
                    stackX.push(top);
                    break;
                } else {
                    // repeat one priority rule
                    output = output + top;
                }
            }
        }
        stackX.push(symbol);
    }

    private void gotParen(char symbol){
        while(!stackX.isEmpty()){
            char chx = stackX.pop();
            if (chx == '('){
                // remove from stack
                break;
            } else {
                // last element on string
                output = output + chx;
            }
        }
    }
}
