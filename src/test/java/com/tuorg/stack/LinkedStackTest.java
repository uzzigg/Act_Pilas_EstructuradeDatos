package com.tuorg.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedStackTest {

    @Test
    void testPushAndPop() {
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPeek() {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("A");
        assertEquals("A", stack.peek());
        stack.push("B");
        assertEquals("B", stack.peek());
    }

    @Test
    void testIsEmptyAndClear() {
        LinkedStack<Integer> stack = new LinkedStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        assertFalse(stack.isEmpty());
        stack.clear();
        assertTrue(stack.isEmpty());
    }
}
