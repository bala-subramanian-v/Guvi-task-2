class Person {
    String name;
    int age;
    // Default constructor
    Person() {
        age = 18;
    }
    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", 25);
        p1.display();

        Person p2 = new Person();
        p2.name = "Anita";
        p2.display();
    }
}
