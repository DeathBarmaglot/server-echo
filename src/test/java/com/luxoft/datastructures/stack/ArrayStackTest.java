package com.luxoft.datastructures.stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest implements Iterator {
    ArrayStack arrayStack = new ArrayStack();

    @DisplayName("test Push And Pop Is Empty Return True")
	@Test
    public void testPushAndPopCheckIsEmptyReturnTrue(){
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");
        assertEquals(3, arrayStack.size());
        assertEquals("C", arrayStack.pop());
        assertEquals("B", arrayStack.pop());
        assertEquals("A", arrayStack.pop());
        assertTrue(arrayStack.isEmpty());
    }

    @DisplayName("test Push And Peek In Stack Assert Size")
    @Test
    public void testPushAndPeek(){
        arrayStack.push("a");
        arrayStack.push("b");
        assertEquals(2, arrayStack.size());
        assertEquals("b", arrayStack.peek());
        assertEquals("b", arrayStack.peek());
        assertEquals(2, arrayStack.size());
    }

    @DisplayName("test Is Empty In New Stack Return True")
    @Test
    public void testIsEmptyInNewStackReturnTrue(){
        assertTrue(arrayStack.isEmpty());
    }

    @DisplayName("test Is Empty After Push Return False")
    @Test
    public void testIsEmptyInNewStackReturnFalse(){
        arrayStack.push("C");
        assertFalse(arrayStack.isEmpty());
    }

    @DisplayName("test Empty After Clear Return True")
    @Test
    public void testIsEmptyAfterClearReturnTrue(){
        arrayStack.push("C");
        arrayStack.push("D");
        arrayStack.clear();
        assertTrue(arrayStack.isEmpty());
    }

    @DisplayName("test Contains Return True")
    @Test
    public void testContainsReturnTrue(){
        arrayStack.push("C");
        arrayStack.push("D");
        assertTrue(arrayStack.contain("C"));
    }

    @DisplayName("test Contains Return False")
    @Test
    public void testContainsReturnFalse(){
        arrayStack.push("C");
        arrayStack.push("D");
        assertFalse(arrayStack.contain("A"));
    }

    @DisplayName("test Contains on Empty Stack Return False")
    @Test
    public void testContainsOnEmptyStackReturnFalse(){
        assertFalse(arrayStack.contain("A"));
    }

    @DisplayName("Throw Illegal State Exception On Pop Stack")
    @Test
    public void testThrowIllegalStateExceptionOnPopStack(){
        Assertions.assertThrows(IllegalStateException.class, arrayStack::pop);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
