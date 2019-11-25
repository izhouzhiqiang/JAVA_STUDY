package JAVASE.string_;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int t1=0,t2=0,t3=0,t4=0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='a'&& chars[i]<='z')
                t1++;
            else if(chars[i]>'A' && chars[i]<='Z')
                t2++;
            else if(chars[i]>'0' && chars[i]<='9')
                t3++;
            else
                t4++;

        }
        System.out.println("大写字母:"+t2+" 小写字母:"+t1+" 数字:"+t3+" 其他:"+t4);
    }
}
