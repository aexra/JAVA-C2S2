package Labs.Data5.Classes;

import java.util.ArrayList;

public class DList<T1, T2> {
    private ArrayList<T1> f1 = new ArrayList<>();
    private ArrayList<ArrayList<T2>> f2 = new ArrayList<>();

    public void add(T1 a, ArrayList<T2> b) {
        this.f1.add(a);
        this.f2.add(b);
    }

    public Pair<T1, ArrayList<T2>> get(T1 a) {
        for (int i = 0; i < this.f1.size(); i++) {
            if (f1.get(i) == a) {
                return new Pair<T1, ArrayList<T2>>(f1.get(i), f2.get(i));
            }
        }
        return null;
    }

    public Pair<T1, ArrayList<T2>> getAt(int index) {
        if (index < 0 || index > this.f1.size()) {
            return null;
        }
        return new Pair<T1, ArrayList<T2>>(f1.get(index), f2.get(index));
    }

    public void setAt(Pair<T1, ArrayList<T2>> pair, int index) {
        if (index < 0 || index > this.f1.size()) {
            return;
        }
        f1.set(index, pair.left);
        f2.set(index, pair.right);
    }

    public Pair<T1, ArrayList<T2>> remove(T1 a) {
        for (int i = 0; i < this.f1.size(); i++) {
            if (f1.get(i) == a) {
                return new Pair<T1, ArrayList<T2>>(f1.remove(i), f2.remove(i));
            }
        }
        return null;
    }

    public Pair<T1, ArrayList<T2>> removeAt(int index) {
        if (index < 0 || index > this.f1.size()) {
            return null;
        }
        return new Pair<T1, ArrayList<T2>>(f1.remove(index), f2.remove(index));
    }

    public int size() {
        return this.f1.size();
    }
}