package ca.qc.johnabbott.cs4p6;

import ca.qc.johnabbott.cs4p6.collections.StackMany;
import ca.qc.johnabbott.cs4p6.collections.StackOverflowException;
import ca.qc.johnabbott.cs4p6.collections.StackUnderflowException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStackMany {

    private StackMany<String> stack;

    @Before
    public void setup() {
        stack = new StackMany<>(10);
    }

    @Test
    public void testStackIsSuperClass() {
        assertTrue(stack.isEmpty());
        // check that push and pop still work
        stack.push("and");
        assertEquals("and", stack.pop());
    }

    @Test
    public void testStackManyPush() {
        stack.pushMany("for something completely different".split(" "));
        assertEquals("different", stack.pop());
        assertEquals("completely", stack.pop());
        assertEquals("something", stack.pop());
        assertEquals("for", stack.pop());
    }

    @Test
    public void testStackManyPop() {
        stack.push("something");
        stack.push("completely");
        stack.push("different");
        assertArrayEquals("different completely something".split(" "), stack.popMany(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStackManyPopIllegalAmount() {
        stack.popMany(-1);
    }

    @Test(expected = StackUnderflowException.class)
    public void testStackManyUnderflow() {
        stack.pushMany("a b c".split(" "));
        stack.popMany(4);
    }

    @Test(expected = StackOverflowException.class)
    public void testStackManyOverflow() {
        stack.pushMany("a b c d e f g h i j k l".split(" "));
    }


}
