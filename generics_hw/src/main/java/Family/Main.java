package Family;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //4 lists with different types, 3 are from the same hierarchy
        List<Grandpa> grandpas = List.of (
                new Grandpa("Christopher"),
                new Grandpa("Teo"),
                new Grandpa("Desmond")
        );

        List<Father> fathers = List.of (
                new Father("John"),
                new Father("Tola"),
                new Father("Kobi")
        );

        List<Child> children = List.of (
                new Child("Julie"),
                new Child("Martha"),
                new Child("Serena")
        );

        List<String> names = List.of("Tola", "Christopher");

        WildcardExample wildEx = new WildcardExample();

       // wildEx.printNames_fathersAndChildrenOnly(fathers);
        //wildEx.printNames_fathersAndChildrenOnly(children);
//        wildEx.printNames_all(grandpas);
//        wildEx.printNames_all(children);
//        wildEx.printNames_all(fathers);
        wildEx.printNames_grandpasAndFathersOnly(grandpas);






    }
}
