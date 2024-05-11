package learn.java.generic.application;

import learn.java.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

/**
 * - Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface
 *   comparable
 * - Namun bagaimana jika class tersebut milik orang lain? Tida bisa kita ubah?
 * - Maka kita bisa menggunakan interface generic yang bernama Comparator
 */
public class ComparatorApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Adrian", "Indonesia"),
                new Person("Naizar", "Indonesia"),
                new Person("Dilla", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));

    }
}
