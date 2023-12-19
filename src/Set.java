import java.util.HashMap;

public class Set {
    private final HashMap<Object, Object> map;

    public Set() {
        this.map = new HashMap<>();
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean add(Object x) {
        return map.put(x, null) == null;
    }

    public void clear() {
        map.clear();
    }

    public boolean remove(Object x) {
        return map.remove(x) != null;
    }

    public boolean contains(Object x) {
        return map.containsKey(x);
    }
}