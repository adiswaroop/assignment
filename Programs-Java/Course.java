public class Course {
    public static int totalCourses = 0;

    public Course() {
        totalCourses++;
        printTotalCoursesCount();
    }

    public static void printTotalCoursesCount() {
        System.out.println("Total number of courses Offered by the UNiversity: " + totalCourses);
    }

    public static void main(String[] args) {
        Course _ = new Course();
        Course _ = new Course();
        Course _ = new Course();
        Course _ = new Course();
        Course _ = new Course();
        Course _ = new Course();
    }
    
}
