package JAVASE.API;

import java.util.Scanner;

public class 匿名对象 {
    public static void main(String[] args) {
        //methodParam(new Scanner(System.in));

        //作返回值
        Scanner sc = methodReturn();
        int num =sc.nextInt();
        System.out.println(num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
