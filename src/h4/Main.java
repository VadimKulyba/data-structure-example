package h4;

import h4.queues.Queue;
import h4.services.BracketChecker;
import h4.services.Reverser;
import h4.services.postdfix.notation.InToPostService;
import h4.services.postdfix.notation.ParsePostService;
import h4.stack.StackX;
import main.SystemInput;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        testStack();
        testReverser();
        testBracket();
        testQueue();
        testConversion();
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

    private static void testConversion() throws IOException{
        String input, output;
        while(true)
        {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = SystemInput.scan();
            if( input.equals("") )
                break;
            InToPostService theTrans = new InToPostService(input);
            output = theTrans.doTrans();
            System.out.println("Postfix is " + output + '\n');
            ParsePostService postService = new ParsePostService(output);
            System.out.println("Answer: " + postService.doParse());
        }
    }

    private static void testQueue(){
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
