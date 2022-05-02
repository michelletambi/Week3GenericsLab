package Pair;

public class Pair <K, V>{

    private K k;
    private V v;

    //constructor
    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    //getters and setters

    public K getK() {
        return this.k;
    }

    public void setK( K k) {
        this.k = k;
    }

    public V getV() {
        return this.v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
