package JAVASE.static_;

public class Student {
    private String name;
    private int age;
    static String national ;
    static int count=0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNational() {
        return national;
    }

    public static void setNational(String national) {
        Student.national = national;
    }
}
