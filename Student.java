public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s = new Student("Adituya", 12);
        System.out.printf("Name of the student: %s, Age of the student: %d", s.name, s.age);
    }
}
