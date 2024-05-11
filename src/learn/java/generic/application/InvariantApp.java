package learn.java.generic.application;

import learn.java.generic.MyData;

/**
 * Invariant
 * - Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
 * - Invariant artinya tidak boleh di substitusi dengan subtype (child) atau supertype (parent)
 * - Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>,
 *   begitupun sebaliknya, saat membuat object Contoh<Object>, maka tidak sama dengan Contoh<String>
 */
public class InvariantApp {
    public static void main(String[] args) {
        // Contoh Invariant
        MyData<String> stringMyData = new MyData<>("Adrian");
        // doIt(stringMyData); // Error terjadi disini, karena MyData<String> tidak dapat disubstitusi dengan MyData<Object>
        // MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; // ERROR
        // doItInteger(objectMyData); // ERROR
    }

    /**
     * Method doIt() mengharapkan MyData<Object>, bukan MyData<String>.
     * Karena generic parameter adalah invariant secara default, MyData<String> bukanlah subtype dari MyData<Object>,
     * dan sebaliknya, sehingga Anda tidak dapat menggantinya satu sama lain.
     */
    public static void doIt(MyData<Object> objectMyData){
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData){
        // do nothing
    }
}

