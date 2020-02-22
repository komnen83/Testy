package testy;

import java.util.Stack;

public class Stos {
    // Pushing element on the top of the stack
    public void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    public void stackPop(Stack<Integer> stack) {
        System.out.println("Pop :");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    public int stackSize(Stack<Integer> stack) {
//        System.out.println("Stack size: " + stack.size());
        return stackSize(stack);
    }

    public boolean isStackEmpty(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return false;
        } else  {
            return true;
        }
    }
}


