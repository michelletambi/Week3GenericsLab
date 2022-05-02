package Family;

public class Grandpa {

    private String name;

    //constructor
    public Grandpa(String name) {
        this.name =name;
    }

    //behaviour


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Grandpa{" +
                "name='" + name + '\'' +
                '}';
    }
}
