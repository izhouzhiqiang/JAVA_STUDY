package JAVASE.Arrays_;

import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {
        String str = "hjfuierh5464655sdhjgbdfyhe";
        char[] chars1 = str.toCharArray();
        Arrays.sort(chars1);

        for (int i = chars1.length - 1; i >= 0; i--) {
            System.out.print(chars1[i]);
        }
    }
}
