package Ex;

public class C4Ex2 {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(101,"hihi");
        System.out.println(p1.getKey()+ p1.getValue());

        IntPair<String> intPair = new IntPair<>(707,"hehe");
        System.out.println(intPair.getValue());
    }
}

class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class IntPair<V> extends Pair<Integer, V>{
    public IntPair(Integer key, V value) {
        super(key, value);
    }

}
