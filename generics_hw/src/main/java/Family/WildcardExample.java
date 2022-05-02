package Family;

import java.awt.*;
import java.util.List;

public class WildcardExample {

    //this only accepts Father and Classes that extend Father
    public void printNames_fathersAndChildrenOnly(List<? extends Father> list) {
        //loop through the List of Fathers/Children called list
        //for each element (person) in list (type here is Father because a Child is also a Father)
        //print their name
        for (Father person: list) {
            System.out.println(person.getName());
        }
    }
    //print all the family names
    public void printNames_all(List<? extends Grandpa> list) {
        for (Grandpa person : list) {
            System.out.println(person.getName());
        }
    }
    //print just the names of grandpas and fathers
    public void printNames_grandpasAndFathersOnly (List<? super Father> list) {

    }




}
