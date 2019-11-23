package javaee;

public class dataType{
    public static void main(String[] args){
        long num1=100L;

        System.out.println(1024);
        System.out.println(3.14);
        System.out.println(num1);

        float num4 = 100L;
        System.out.println(num4);

        long num2=100L;
        float num3 = 2.5F;
        int num = (int) 100L;
        System.out.println(num);

        char a='a';
        char b='b';
        System.out.println(a+b);

        byte n1=45;
        byte n2=55;
        int result=n1+n2;//不能用byte result
        System.out.println(result);

    }
}
