package JAVASE.string_;

public class test {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        System.out.println(f(a));

    }
    public static String f(int[] a){
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            str += "word"+ a[i] + "#" ;
        }
        str+="]";
        return str;
    }
}
