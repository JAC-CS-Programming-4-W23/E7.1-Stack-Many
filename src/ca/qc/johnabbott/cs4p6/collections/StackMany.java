package ca.qc.johnabbott.cs4p6.collections;

public class StackMany<T> extends Stack<T> {

    public StackMany() {
        super();
    }

    public StackMany(int capacity) {
        super(capacity);
    }

    public T[] popMany(int amount) {
        T[] tmp = (T[]) new Object[amount];
        for(int i = 0; i < amount; i++)
            tmp[i] = pop();
        return tmp;
    }

    public void pushMany(T[] elements) {
        for(T element : elements)
            push(element);
    }

}
