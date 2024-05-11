package learn.java.generic.application;

import learn.java.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
          new Person("Adrian", "Indonesia"),
          new Person("Naizar", "Indonesia"),
          new Person("Dilla", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
