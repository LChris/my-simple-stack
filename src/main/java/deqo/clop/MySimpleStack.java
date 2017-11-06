package deqo.clop;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {
    private ArrayList<Item> stack = new ArrayList<Item>();

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int getSize() {
        return stack.size();
    }

    public void push(Item item) {
        stack.add(0, item);
    }

    public Item peek() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();

        Item item = stack.get(0);
        return item;
    }

    public Item pop() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();

        Item item = stack.remove(0);
        return item;
    }
}
