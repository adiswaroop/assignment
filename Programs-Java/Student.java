public class Student {
    static int count = 0;

    public Student() {
        count++;
        System.out.println("Current student count: " + count);
        System.out.println("Student's Unique id: student" + count);
        nextAvailableId();
    }

    public static void nextAvailableId() {
        System.out.println("Next Available Student ID: student" + (count + 1));
    }
    public static void main(String[] args) {
        Student _ = new Student();
        Student _ = new Student();
        Student _ = new Student();

    }
}
