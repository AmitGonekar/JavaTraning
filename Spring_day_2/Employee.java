package Spring_day_2;


// Create POJO Class – Employee

public class Employee {

    private int id;
    private String name;
    private Department department;

    // Constructor (for constructor DI)
    public Employee(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Default constructor (required for setter DI)
    public Employee() {}

    // Setters (for setter DI)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void display() {
        System.out.println(id + " " + name + " " + department.getDeptName());
    }

    // init & destroy methods
    public void init() {
        System.out.println("Employee Bean Initialized");
    }

    public void destroy() {
        System.out.println("Employee Bean Destroyed");
    }
}

