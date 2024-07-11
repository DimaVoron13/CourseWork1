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

    public static void listOfAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateSalary(Employee[] employees) {
        int result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result = result + employee.getSalary();
            }
        }
        return result;
    }

    public static Employee calculateMinimumSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee <= employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee calculateMaximumSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee >= employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static int averageEmployeeSalary(Employee[] employees) {
        int result1 = calculateSalary(employees);
        result1 = result1 / employees.length;
        return result1;
    }

    public static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                String fullNameEmployee = employee.getFullName();
                System.out.println(fullNameEmployee);
            }
        }
    }

    public static void salaryIncreasedBy10Percent(Employee[] employees) {
        for (Employee employee : employees) {
            final int PERCENT_OF_SALARY_UP = employee.getSalary() / 100 * 10;
            employee.setSalary(employee.getSalary() + PERCENT_OF_SALARY_UP);
        }
    }

    public static Employee calculateMinimumSalaryOfDepartment1(Employee[] employees) {
        Employee minimumSalaryOfDepartment1 = employees[0];
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            int salaryEmployee = employee.getSalary();
            if (departmentEmployee == 1 && salaryEmployee < minimumSalaryOfDepartment1.getSalary()) {
                minimumSalaryOfDepartment1 = employee;
            }
        }
        return minimumSalaryOfDepartment1;
    }

    public static Employee calculateMaximumSalaryOfDepartment1(Employee[] employees) {
        Employee maximumSalaryOfDepartment1 = employees[0];
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            int salaryEmployee = employee.getSalary();
            if (departmentEmployee == 1 && salaryEmployee > maximumSalaryOfDepartment1.getSalary()) {
                maximumSalaryOfDepartment1 = employee;
            }
        }
        return maximumSalaryOfDepartment1;
    }

    public static int calculateSalaryOfDepartment1(Employee[] employees) {
        int resultOfDepartment1 = 0;
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            if (departmentEmployee == 1) {
                resultOfDepartment1 = resultOfDepartment1 + employee.getSalary();
            }
        }
        return resultOfDepartment1;
    }

    public static int averageEmployeeSalaryOfDepartment1(Employee[] employees) {
        int result1_OfDepartment1 = 0;
        int numberOfPeopleInTheDepartment = 0;
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            if (departmentEmployee == 1) {
                numberOfPeopleInTheDepartment++;
                result1_OfDepartment1 = result1_OfDepartment1 + employee.getSalary();
            }
        }
        return result1_OfDepartment1 / numberOfPeopleInTheDepartment;
    }

    public static void salaryIncreasedBy10PercentOfDepartment1(Employee[] employees) {
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            final int PERCENT_OF_SALARY_UP = employee.getSalary() / 100 * 10;
            if (departmentEmployee == 1) {
                employee.setSalary(employee.getSalary() + PERCENT_OF_SALARY_UP);
                System.out.println(employee);
            }
        }
    }

    public static void printPeopleInTheDepartment1(Employee[] employees) {
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            if (departmentEmployee == 1) {
                String fullNameEmployee = employee.getFullName();
                int salaryEmployee = employee.getSalary();
                System.out.println(fullNameEmployee + " , Зарплата - " + salaryEmployee);
            }
        }
    }

    public static void printPeopleLesOf25_000Salary(Employee[] employees) {
        final int NUMBER_TO_SEPARATE_PEOPLE = 25_000;
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee < NUMBER_TO_SEPARATE_PEOPLE) {
                System.out.println(employee);
            }
        }
    }

    public static void printPeopleMoreOf25_000Salary(Employee[] employees) {
        final int NUMBER_TO_SEPARATE_PEOPLE = 25_000;
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee > NUMBER_TO_SEPARATE_PEOPLE) {
                System.out.println(employee);
            }
        }
    }
}