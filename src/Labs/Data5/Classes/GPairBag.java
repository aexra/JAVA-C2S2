package Labs.Data5.Classes;

public class GPairBag<T, U> extends Bag {
    private Pair<T, U>[] container;

    public GPairBag(int size) {
        super(size);
    }

    public void push(Pair<T, U> pair) {
        __push__(pair);
    }

    public void push(T left, U right) {
        __push__(new Pair<T, U>(left, right));
    }
}
