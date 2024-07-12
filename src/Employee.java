import java.util.Objects;

public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private static int count = 0;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Id: " + id + " " + fullName + " Отдел - " + department + " Зарплата - " + salary;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && getSalary() == employee.getSalary() && id == employee.id && Objects.equals(getFullName(), employee.getFullName());
    }

    public int hashCode() {
        return Objects.hash(getFullName(), getDepartment(), getSalary(), id);
    }
}