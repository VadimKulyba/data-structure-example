package h4;

import h4.queues.Queue;
import h4.services.BracketChecker;
import h4.services.Reverser;
import h4.stack.StackX;

public class Main {
    public static void main(String[] args){
        testStack();
        testReverser();
        testBracket();
        testQieue();
    }

    private static void testStack(){
        StackX stack = new StackX(10);
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    private static void testReverser(){
        Reverser reverser =  new Reverser("hello");
        System.out.println(reverser.doRev());
    }

    private static void testBracket(){
        BracketChecker bracket = new BracketChecker("a{b(c[d]e)f}");
        bracket.check();
    }

    private static void testQieue(){
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()) {
            System.out.print(theQueue.remove() + " ");
        }
    }
}
