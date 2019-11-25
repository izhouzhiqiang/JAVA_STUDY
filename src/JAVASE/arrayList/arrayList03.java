package JAVASE.arrayList;

import java.util.ArrayList;

public class arrayList03 {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("izhou");
        list2.add("ifan");
        list2.add("ichen");
        System.out.println(list2.get(2));
        System.out.println(list2.size());
        list2.remove(2);
        System.out.println(list2);
    }
}
