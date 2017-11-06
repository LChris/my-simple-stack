package deqo.clop;

import org.hamcrest.core.IsSame;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

public class MySimpleStackTest {
    private MySimpleStack simplestack;
    private Item item1 = new Item();
    private Item item2 = new Item();

    @Test
    public void testIsEmptyOK() throws Exception {
        simplestack = new MySimpleStack();
        assertThat(simplestack.isEmpty(), is(true));
    }

    @Test
    public void testGetSizeOK() throws Exception {
        simplestack = new MySimpleStack();
        assertThat(simplestack.getSize(), is(0));

        simplestack.push(item1);
        assertThat(simplestack.getSize(), is(1));

        simplestack.push(item2);
        assertThat(simplestack.getSize(), is(2));
    }

    @Test
    public void testPushOK() throws Exception {
        simplestack = new MySimpleStack();
        simplestack.push(item1);
        simplestack.push(item2);
        assertThat(simplestack.peek(), sameInstance(item2));
    }

    @Test
    public void testPeekOK() throws Exception {
        simplestack = new MySimpleStack();
        simplestack.push(item1);
        simplestack.push(item2);

        Item item = simplestack.peek();
        assertThat(item, sameInstance(item2));
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekException() throws Exception {
        simplestack = new MySimpleStack();
        Item item = simplestack.peek();
    }

    @Test
    public void testPopOK() throws Exception {
        simplestack = new MySimpleStack();
        simplestack.push(item1);
        simplestack.push(item2);

        Item actual2 = simplestack.pop();
        assertThat(actual2, sameInstance(item2));

        Item actual1 = simplestack.pop();
        assertThat(actual1, sameInstance(item1));

        assertThat(simplestack.isEmpty(), is(true));
    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() throws Exception {
        simplestack = new MySimpleStack();
        Item item = simplestack.pop();
    }

}