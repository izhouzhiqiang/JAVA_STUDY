package JAVASE.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100));
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 = getSmall(list);
        System.out.println(list1);

    }
    public static ArrayList<Integer> getSmall(ArrayList<Integer> big){
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i <big.size() ; i++) {
            if(big.get(i)%2==0) {
                small.add(big.get(i));
            }
        }
        return small;
    }
}
