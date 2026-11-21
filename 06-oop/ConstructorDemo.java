public class ConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student("Arun", 20);
        s.show();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
