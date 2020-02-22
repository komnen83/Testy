package testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

class StosTest {

    @Test
    void testStackPush() {
        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();

        stos.stackPush(stack, 5);
        stos.stackPush(stack, 4);
        stos.stackPush(stack, 3);
        stos.stackPush(stack, 2);
        stos.stackPush(stack, 1);

        int wynik = stack.search(3);

        Assertions.assertEquals(3, wynik);
    }

    @Test
    void testStackPop() {
        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();

        stos.stackPush(stack, 5);
        stos.stackPush(stack, 4);
        stos.stackPush(stack, 3);
        stos.stackPush(stack, 2);
        stos.stackPush(stack, 1);

        stos.stackPop(stack);
        stos.stackPop(stack);

        int rozmiar = stack.size();

        Assertions.assertEquals(3, rozmiar);
    }

    @Test
    void testStackSize() {
        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();

        stos.stackPush(stack, 4);
        stos.stackPush(stack, 3);
        stos.stackPush(stack, 2);
        stos.stackPush(stack, 1);

        int wynik = stos.stackSize(stack);

        Assertions.assertEquals(4, wynik);
    }

    @Test
    void testIsStackEmpty() {

        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();

        stos.stackPush(stack, 3);
        stos.stackPush(stack, 2);
        stos.stackPush(stack, 1);

        boolean wynik = stos.isStackEmpty(stack);

        Assertions.assertTrue(wynik);
    }

    @Test
    void testReverseStack() {
        Stos stos = new Stos();
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};

        stos.stackPush(stack, 3);
        stos.stackPush(stack, 2);
        stos.stackPush(stack, 1);


        int[] wynik = stos.reverseStack(stack, arr);
        int[] odwroconaTablica = {5, 4, 3, 2, 1};

        Assertions.assertEquals(Arrays.toString(odwroconaTablica), Arrays.toString(wynik));

    }
}