package JAVASE.API;

import java.util.Scanner;

public class scanner_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println(sc.next());
    }
}
