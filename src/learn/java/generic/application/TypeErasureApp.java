package learn.java.generic.application;

/**
 * Type Erasure
 * - Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan
 *   pengecekan pada saat runtime
 * - Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program
 *   kita telah di compile menjadi binary file
 * - Compiler akan mengubah generic parameter type menjadi tipe Object di Java
 */

import learn.java.generic.MyData;

/**
 * Problem Type Erasure
 * - Karena informasi generic hilang ketika sudah menjadi binary file
 * - Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak
 */
public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Adrian");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
//        integerMyData.setData(1000);

        Integer integer = integerMyData.getData();
    }
}
