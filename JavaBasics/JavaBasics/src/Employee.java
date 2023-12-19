public class Employee {
    int id;
    String name;
    double salary;
    Address address;

    public Employee(int id, String name, double salary, Address abc){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = abc;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
    }

    public static void main(String[] args){
        Address a = new Address("Kolkata", "west Bangal", "Sector-v", "23");
        Employee e = new Employee(1,"Abhishek", 40000000, a);
        System.out.println(e.name);
        System.out.println(e);
    }

}
