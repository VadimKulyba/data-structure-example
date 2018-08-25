package h4.services;

import h4.stack.StackX;

// parse code
public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check(){
        StackX stackX = new StackX(input.length());

        for (int index = 0; index < input.length(); index++){
            char symbol = input.charAt(index);

            switch (symbol){
                case '{':
                case '[':
                case '(':
                    stackX.push(symbol);
                    break;

                case ')':
                case ']':
                case '}':
                    if (!stackX.isEmpty()){
                        char elem = stackX.pop();
                        if ((elem == '}' && elem != '{') ||
                                (elem == ']' && elem != '[') ||
                                (elem == ')' && elem != '(')){
                            System.out.println("Error");
                        }
                    } else {
                        // stack empty
                        System.out.println("Error");
                    }
                    break;

                default:
                    //different symbol
                    break;

            }
        }

        if (stackX.isEmpty()) {
            System.out.println("Success");
        }
    }
}
