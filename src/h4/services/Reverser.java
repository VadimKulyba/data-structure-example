package h4.services;

import h4.stack.StackX;

public class Reverser {
    private String input;
    private String output = "";

    public Reverser(String input) {
        this.input = input;
    }

    public String doRev(){
        StackX stackX = new StackX(input.length());

        for (int index = 0; index < input.length(); index++){
            char symbol = input.charAt(index);
            stackX.push(symbol);
        }

        while (!stackX.isEmpty()){
            output = output + stackX.pop();
        }
        return output;
    }
}
