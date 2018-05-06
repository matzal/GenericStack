package jjdz4.zalewski.mateusz;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {

    private List<T> stackList = new ArrayList<>();
    private int topOfStack = -1;

    @Override
    public void push(T o) {
        stackList.add(o);
        topOfStack = topOfStack + 1;
    }

    @Override
    public T pop() {
        if (topOfStack < 0) {
            throw new IllegalStateException();
        }
        T objectFromTopOfStack = stackList.get(topOfStack);
        stackList.remove(topOfStack);
        topOfStack = topOfStack - 1;
        return objectFromTopOfStack;
    }

    @Override
    public T peek() {
        if (topOfStack < 0) {
            throw new IllegalStateException();
        }
        return stackList.get(topOfStack);
    }
}
