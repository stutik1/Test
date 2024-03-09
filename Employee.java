import java.util.HashMap;
import java.util.Objects;

public class Employee {
    public int id ;
    public int salary;
    public int age ;
    public String name ;

    public Employee(int id, int salary, int age, String name) {
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Employee)) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && salary == employee.salary && age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, age, name);
    }

    public static void main(String[] args) {
        Employee megha = new Employee(1,1000,26,"Megha");
        Employee megha2 = new Employee(1,1000,27,"megha");
        Employee megha3 = new Employee(1,1000,26,"Megha");

        System.out.println(megha);
        System.out.println(megha2);
        System.out.println(megha3);

        HashMap<Employee,Integer> hash = new HashMap<>();                                                           



    }
}

