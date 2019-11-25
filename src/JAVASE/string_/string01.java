package JAVASE.string_;

public class string01 {
    public static void main(String[] args) {
        String str =  new String();
        System.out.println("第一个字符串:"+str);

        char[] array = {'A','B','C'};
        String str2 = new String(array);
        System.out.println("第二个字符串:"+str2);

        byte[] array2 = {97,98,99};
        String str3 = new String(array2);
        System.out.println("第三个字符串:"+str3);

        String str4 = "hello";
        System.out.println("第四个字符串:"+str4);
    }
}
