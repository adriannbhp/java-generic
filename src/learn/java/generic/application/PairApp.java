package learn.java.generic.application;

import learn.java.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Adrian", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

}
