package JAVASE.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            list.add(r.nextInt(9)+1);
        }
        System.out.println(list);
    }
}
