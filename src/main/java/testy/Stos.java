package testy;

import java.util.Stack;

public class Stos {

    public void stackPush(Stack stack, int a) {
            stack.push(new Integer(a));
    }

    public void stackPop(Stack stack) {
            Integer a = (Integer) stack.pop();
    }

    public int stackSize(Stack<Integer> stack) {
        return stack.size();
    }

    public boolean isStackEmpty(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}


