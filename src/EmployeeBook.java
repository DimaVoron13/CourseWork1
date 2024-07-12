public class EmployeeBook {

    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addContact(String fullName, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(fullName, department, salary);
                employees[i] = newEmployee;
                size++;
                return;
            } else if (size >= employees.length) {
                System.out.println("Нельзя добавить контакт, закончилось место");
                return;
            }
        }
    }

    public void removeContact(int id) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getId() == id) {
                System.out.println(employees[i].getFullName() + " удален");
                employees[i] = null;
                size--;
                return;
            }
        }
    }

    public void findContact(int id) {
        for (Employee employee : employees) {
            if (employee == null) {
                System.out.println("Сотрудник Id: " + id + " не найден");
            } else if (employee.getId() == id) {
                System.out.println("Сотрудник - " + employee);
                return;
            }
        }
    }

    public void listOfAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
            System.out.println(employee);
            } else {
                return;
            }
        }
    }

    public int calculateSalary() {
        int result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result = result + employee.getSalary();
            }
        }
        return result;
    }

    public Employee calculateMinimumSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee <= employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee calculateMaximumSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee >= employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public int averageEmployeeSalary() {
        int result1 = calculateSalary();
        result1 = result1 / employees.length;
        return result1;
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                String fullNameEmployee = employee.getFullName();
                System.out.println(fullNameEmployee);
            }
        }
    }

    public void salaryIncreasedBy10Percent() {
        for (Employee employee : employees) {
            final int PERCENT_OF_SALARY_UP = employee.getSalary() / 100 * 10;
            employee.setSalary(employee.getSalary() + PERCENT_OF_SALARY_UP);
        }
    }

    public Employee calculateMinimumSalaryOfDepartment1() {
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

    public Employee calculateMaximumSalaryOfDepartment1() {
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

    public int calculateSalaryOfDepartment1() {
        int resultOfDepartment1 = 0;
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            if (departmentEmployee == 1) {
                resultOfDepartment1 = resultOfDepartment1 + employee.getSalary();
            }
        }
        return resultOfDepartment1;
    }

    public int averageEmployeeSalaryOfDepartment1() {
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

    public void salaryIncreasedBy10PercentOfDepartment1() {
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            final int PERCENT_OF_SALARY_UP = employee.getSalary() / 100 * 10;
            if (departmentEmployee == 1) {
                employee.setSalary(employee.getSalary() + PERCENT_OF_SALARY_UP);
                System.out.println(employee);
            }
        }
    }

    public void printPeopleInTheDepartment1() {
        System.out.println("Сотруднки отдела 1: ");
        for (Employee employee : employees) {
            int departmentEmployee = employee.getDepartment();
            if (departmentEmployee == 1) {
                String fullNameEmployee = employee.getFullName();
                int salaryEmployee = employee.getSalary();
                System.out.println(fullNameEmployee + " , Зарплата - " + salaryEmployee);
            }
        }
    }

    public void printPeopleLesOf25_000Salary() {
        System.out.println("Сотрудники с зарплатой ниже 25_000 : ");
        final int NUMBER_TO_SEPARATE_PEOPLE = 25_000;
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee < NUMBER_TO_SEPARATE_PEOPLE) {
                System.out.println(employee);
            }
        }
    }

    public void printPeopleMoreOf25_000Salary() {
        System.out.println("Сотрудники с зарплатой выше 25_000 : ");
        final int NUMBER_TO_SEPARATE_PEOPLE = 25_000;
        for (Employee employee : employees) {
            int salaryEmployee = employee.getSalary();
            if (salaryEmployee > NUMBER_TO_SEPARATE_PEOPLE) {
                System.out.println(employee);
            }
        }
    }
}
