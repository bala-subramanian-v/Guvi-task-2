class individual{
    String name;
    int age;

    individual(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends individual{
    int employeeID;
    double salary;

    Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Initializing Person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kumar", 30, 101, 45000);
        emp.display();
    }
}
