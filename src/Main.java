public class Main {

    public static Employee createEmployee(String fullName, int department, int salary) {
        return new Employee(fullName, department, salary);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = createEmployee("Андрицкая Светлана Евгеньевна", 1, 20_000);
        employees[1] = createEmployee("Соболева Елена Александровна", 2, 24_000);
        employees[2] = createEmployee("Некрасова Олеся Михайловна", 5, 29_000);
        employees[3] = createEmployee("Стяжкина Надежда Сергеевна", 4, 35_000);
        employees[4] = createEmployee("Лампель Екатерина Владимировна", 4, 59_000);
        employees[5] = createEmployee("Смирнов Евгений Валерьевич", 1, 14_000);
        employees[6] = createEmployee("Леуский Владислав Петрович", 3, 7_000);
        employees[7] = createEmployee("Яковлев Андрей Владимирович", 5, 2_000);
        employees[8] = createEmployee("Хохлов Сергей Владимирович", 1, 43_000);
        employees[9] = createEmployee("Дудоров Олег Владимирович", 2, 25_000);

        Employee.listOfAllEmployees(employees);
        System.out.println();
        int calculateSalary = Employee.calculateSalary(employees);
        System.out.println("Общая сумма затрат на ЗП - " + calculateSalary);
        System.out.println();
        Employee calculateMinimumSalary = Employee.calculateMinimumSalary(employees);
        System.out.println("Минимальная зарплата сотрудника - " + calculateMinimumSalary);
        System.out.println();
        Employee calculateMaximumSalary = Employee.calculateMaximumSalary(employees);
        System.out.println("Максимальная зарплата сотрудника - " + calculateMaximumSalary);
        System.out.println();
        int averageEmployeeSalary = Employee.averageEmployeeSalary(employees);
        System.out.println("Средняя зарплата сотрудников составляет - " + averageEmployeeSalary);
        System.out.println();
        Employee.printFullNames(employees);
        System.out.println();
        Employee.salaryIncreasedBy10Percent(employees);
        Employee.listOfAllEmployees(employees);
        System.out.println();
        Employee calculateMinimumSalaryOfDepartment1 = Employee.calculateMinimumSalaryOfDepartment1(employees);
        System.out.println("Минимальная зарплата по отделу 1 - " + calculateMinimumSalaryOfDepartment1);
        System.out.println();
        Employee calculateMaximumSalaryOfDepartment1 = Employee.calculateMaximumSalaryOfDepartment1(employees);
        System.out.println("Максимальная зарплата по отделу 1 - " + calculateMaximumSalaryOfDepartment1);
        System.out.println();
        int calculateSalaryOfDepartment1 = Employee.calculateSalaryOfDepartment1(employees);
        System.out.println("Расходы на зп по отделу 1 составляют - " + calculateSalaryOfDepartment1);
        System.out.println();
        int averageEmployeeSalaryOfDepartment1 = Employee.averageEmployeeSalaryOfDepartment1(employees);
        System.out.println("Средняя зарплата по отделу 1 составляет - " + averageEmployeeSalaryOfDepartment1);
        System.out.println();
        Employee.salaryIncreasedBy10PercentOfDepartment1(employees);
        System.out.println();
        Employee.printPeopleInTheDepartment1(employees);
        System.out.println();
        Employee.printPeopleLesOf25_000Salary(employees);
        System.out.println();

    }
}