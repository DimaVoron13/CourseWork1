public class EmployeeBook {

    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public boolean addContact(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee removeContact(int id) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getId() == id) {
                employees[i] = null;
                return employee;
            }
        }
        return null;
    }

    public Employee printContactById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void listOfAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int calculateSalary() {
        int result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();
            }
        }
        return result;
    }

    public Employee calculateMinimumSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                int salaryEmployee = employee.getSalary();
                if (salaryEmployee <= employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary;
    }

    public Employee calculateMaximumSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                int salaryEmployee = employee.getSalary();
                if (salaryEmployee >= employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = employee;
                }
            }
        }
        return employeeWithMaxSalary;
    }

    public int averageEmployeeSalary() {
        int result1 = calculateSalary();
        return result1 / employees.length;
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                String fullNameEmployee = employee.getFullName();
                System.out.println(fullNameEmployee);
            }
        }
    }

    public void salaryIncreasedByIndexPercent(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double employeeSalary = employee.getSalary();
                employee.setSalary((int) (employeeSalary + (employeeSalary * percent) / 100));
            }
        }
    }

    public Employee calculateMinimumSalaryOfDepartment(int department) {
        Employee minimumSalaryOfDepartment = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                int salaryEmployee = employee.getSalary();
                if (salaryEmployee < minimumSalaryOfDepartment.getSalary()) {
                    minimumSalaryOfDepartment = employee;
                }
            }
        }
        return minimumSalaryOfDepartment;
    }

    public Employee calculateMaximumSalaryOfDepartment(int department) {
        Employee maximumSalaryOfDepartment = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                int salaryEmployee = employee.getSalary();
                if (salaryEmployee > maximumSalaryOfDepartment.getSalary()) {
                    maximumSalaryOfDepartment = employee;
                }
            }
        }
        return maximumSalaryOfDepartment;
    }

    public int calculateSalaryOfDepartment(int department) {
        int resultOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                resultOfDepartment += employee.getSalary();
            }
        }
        return resultOfDepartment;
    }

    public int averageEmployeeSalaryOfDepartment(int department) {
        int result1_OfDepartment = 0;
        int numberOfPeopleInTheDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                numberOfPeopleInTheDepartment++;
                result1_OfDepartment += employee.getSalary();
            }
        }
        return result1_OfDepartment / numberOfPeopleInTheDepartment;
    }

    public void salaryIncreasedByPercentOfDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double employeeSalary = employee.getSalary();
                employee.setSalary((int) (employeeSalary + (employeeSalary * percent) / 100));
                System.out.println(employee);
            }
        }
    }

    public void printPeopleInTheDepartment(int department) {
        System.out.println("Сотруднки отдела " + department);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                String fullNameEmployee = employee.getFullName();
                int salaryEmployee = employee.getSalary();
                System.out.println(fullNameEmployee + " , Зарплата - " + salaryEmployee);
            }
        }
    }

    public void printPeopleLesOfSalary(int salaryToSeparateDowner) {
        System.out.println("Сотрудники с зарплатой ниже " + salaryToSeparateDowner);
        for (Employee employee : employees) {
            if (employee != null) {
                int salaryEmployee = employee.getSalary();
                if (salaryEmployee < salaryToSeparateDowner) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void printPeopleMoreOfSalary(int salaryToSeparateHigher) {
        System.out.println("Сотрудники с зарплатой выше " + salaryToSeparateHigher);
        for (Employee employee : employees) {
            if (employee != null) {
                int salaryEmployee = employee.getSalary();
                if (salaryEmployee > salaryToSeparateHigher) {
                    System.out.println(employee);
                }
            }
        }
    }
}