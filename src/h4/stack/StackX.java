package h4.stack;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
        maxSize = max; // max size
        stackArray = new char[maxSize];
        top = -1; // last element number
    }

    public boolean isEmpty(){
        return  (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public void push(char element){
        stackArray[++top] = element;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }
}
