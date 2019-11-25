package JAVASE.arrayList;

public class array01 {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("shabi",18);
        Person two = new Person("daibi",46);
        Person three =new Person("yinbi",899);

        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0]) ;//地址

        System.out.println(array[0].getName());
    }
}
