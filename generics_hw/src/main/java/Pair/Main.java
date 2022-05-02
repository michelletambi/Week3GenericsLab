package Pair;

import Box.Box;
import Pair.Pair;

public class Main {
    public static void main(String[] args) {
        Box boxWithoutRestriction = new Box();
        Box <Integer> boxForIntegersOnly = new Box();

        //boxWithoutRestriction.set("hello");
        boxWithoutRestriction.set("heya");
        System.out.println(boxWithoutRestriction.get());

        boxForIntegersOnly.set(54321);
        System.out.println(boxForIntegersOnly.get());

        //Pair.Pair generic class

        Pair<Integer, String> pair1 = new Pair(50, "Michelle");
        Pair<String, String> pair2 = new Pair("what's", "good");

        pair1.setV("Oogly doogly");
        System.out.println(pair1.getK());
        System.out.println(pair1.getV());

        System.out.println(pair2.getK());
        pair2.setV("up?");
        System.out.println(pair2.getV());
        System.out.println(pair2.getK() + " " + pair2.getV());




    }
}
