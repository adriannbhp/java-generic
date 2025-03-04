package learn.java.generic.application;

import learn.java.generic.MyData;

/**
 * Wildcard
 * - Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
 * - Misal kita hanya ingin mem-print data T, tidak peduli tipe apapun
 * - Jika kita mengalami kasus seperti ini, kita bisa menggunakan wildcard
 * - Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?
 */
public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Adrian"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
