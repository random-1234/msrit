class Student {
    private final String name; // final variable, can only be set once
    private int age;

    public Student() {
        this.name = "John Doe"; // default value
        this.age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StudentConstructorDemo {
    public static void main(String[] args) {
        Student student1 = new Student(); // calls default constructor
        System.out.println("Name: " + student1.getName() + ", Age: " + student1.getAge());

        Student student2 = new Student("Jane Smith", 22); // calls parameterized constructor
        System.out.println("Name: " + student2.getName() + ", Age: " + student2.getAge());
    }
}