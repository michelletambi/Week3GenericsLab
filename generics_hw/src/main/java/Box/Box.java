package Box;

public class Box <T> {

    private T t;
    //no constructor

    //getters and setters
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }
}
