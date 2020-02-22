package testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class StosTest {

    @Test
    void testStackPush() {
        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();
        stos.stackPush(stack);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int wynik = stack.search(3);

        Assertions.assertEquals(3, wynik);
    }

    @Test
    void testStackPop() {
//        Stack<Integer> stos = new Stack<>();
//        stos.push(5);
//        stos.push(4);
//        stos.push(3);
//        stos.push(2);
//        stos.push(1);
//
//        stos.pop(4);

    }

    @Test
    void testStackSize() {
        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.push(1);

        int wynik = stack.size();

        Assertions.assertEquals(3, wynik);
    }

    @Test
    void testIsStackEmpty() {

        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.push(1);

        boolean wynik = stos.isStackEmpty(stack);

        Assertions.assertTrue(wynik);
    }
}