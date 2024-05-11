package learn.java.generic.application;

import learn.java.generic.MyData;

/**
 * Covariant
 * - Covariant artinya kita bisa melakukan substitusi subtype (child) dengan (parent)
 * - Caranya agar generic object kita menjadi covariant adalah dengan menggunakan
 *   kata kunci (? extends ParentClass)
 * - Artinya saaat kita membuat object Contoh<String>, maka bisa disubstitusi menjadi
 *   Contoh<? extends Object>
 * - Covariant adalah read-only, jadi kita tidak bisa mengubah data generic nya
 */
public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Adrian");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // myData.setData(1); tidak boleh, karena berbahaya
    }
}
