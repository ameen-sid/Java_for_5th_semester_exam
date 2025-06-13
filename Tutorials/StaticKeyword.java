package Tutorials;

class Student {

    private int id;
    private String name;
    private int age;

    public static String collegeName = "Mewar Group of Institute";
    public static int count = 0;

    static {
        System.out.println("Hello");
    }

    public Student() {
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCollegeName() {
        return collegeName;
    }

    public static void getCount() {
        System.out.println("Total Students: " + count);
    }
}

public class StaticKeyword {

    public void staticKeyword() {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        Student.getCount();
    }
}
