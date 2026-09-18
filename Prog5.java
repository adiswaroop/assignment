class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
} 

class Employee extends Person {
    int salary;

    Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}

class Prog5 {
    public static void main(String[] args) {
        Employee p = new Employee("Aditya", 20, 400000);
        System.out.printf("New employee name %s, Age: %d, Salary: %d", p.name, p.age, p.salary);
        Employee e = new Employee("Deepak Kumar Maharana", 21, 3000000);
        System.out.printf("\n\nNew employee name %s, Age: %d, Salary: %d per month", e.name, e.age, e.salary);
    }
}
