package JAVASE.arrayList;

import java.util.ArrayList;

public class arrayList02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(); //泛型是String
        System.out.println(list1);//[]

        list1.add("likexue");
        list1.add("zhangmengjie");
        System.out.println(list1);
    }
}
