package JAVASE.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(100);
        System.out.println(list3);

        int num =list3.get(0);
        System.out.println(num);
    }
}
