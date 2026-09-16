public class Employee {
    static int id = 0;

    public Employee() {
        id++;
        System.out.println("Employee ID: employee" + id);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee = new Employee();
        employee = new Employee();
        employee = new Employee();
        employee = new Employee();
    }
}
