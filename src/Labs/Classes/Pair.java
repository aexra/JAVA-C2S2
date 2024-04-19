package Labs.Classes;

public class Pair<T, U> {
    public T left;
    public U right;

    public Pair(T _left, U _right) {
        left = _left;
        right = _right;
    }

    public static <K, V> Pair<K, V> make_pair(K _left, V _right) {
        return new Pair<K, V>(_left, _right);
    }
}
