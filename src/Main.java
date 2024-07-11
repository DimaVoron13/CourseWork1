public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addContact("Андрицкая Светлана Евгеньевна", 1, 20_000);
        employeeBook.addContact("Соболева Елена Александровна", 2, 24_000);
        employeeBook.addContact("Некрасова Олеся Михайловна", 5, 29_000);
        employeeBook.addContact("Стяжкина Надежда Сергеевна", 4, 35_000);
        employeeBook.addContact("Лампель Екатерина Владимировна", 4, 59_000);
        employeeBook.addContact("Смирнов Евгений Валерьевич", 1, 14_000);
        employeeBook.addContact("Леуский Владислав Петрович", 3, 7_000);
        employeeBook.addContact("Яковлев Андрей Владимирович", 5, 2_000);
        employeeBook.addContact("Хохлов Сергей Владимирович", 1, 43_000);
        employeeBook.addContact("Дудоров Олег Владимирович", 2, 25_000);
        employeeBook.listOfAllEmployees();
        System.out.println();
        int calculateSalary = employeeBook.calculateSalary();
        System.out.println("Общая сумма затрат на ЗП - " + calculateSalary);
        System.out.println();
        Employee calculateMinimumSalary = employeeBook.calculateMinimumSalary();
        System.out.println("Минимальная зарплата сотрудника - " + calculateMinimumSalary);
        System.out.println();
        Employee calculateMaximumSalary = employeeBook.calculateMaximumSalary();
        System.out.println("Максимальная зарплата сотрудника - " + calculateMaximumSalary);
        System.out.println();
        int averageEmployeeSalary = employeeBook.averageEmployeeSalary();
        System.out.println("Средняя зарплата сотрудников составляет - " + averageEmployeeSalary);
        System.out.println();
        employeeBook.printFullNames();
        System.out.println();
        employeeBook.salaryIncreasedBy10Percent();
        employeeBook.listOfAllEmployees();
        System.out.println();
        Employee calculateMinimumSalaryOfDepartment1 = employeeBook.calculateMinimumSalaryOfDepartment1();
        System.out.println("Минимальная зарплата по отделу 1 - " + calculateMinimumSalaryOfDepartment1);
        System.out.println();
        Employee calculateMaximumSalaryOfDepartment1 = employeeBook.calculateMaximumSalaryOfDepartment1();
        System.out.println("Максимальная зарплата по отделу 1 - " + calculateMaximumSalaryOfDepartment1);
        System.out.println();
        int calculateSalaryOfDepartment1 = employeeBook.calculateSalaryOfDepartment1();
        System.out.println("Расходы на зп по отделу 1 составляют - " + calculateSalaryOfDepartment1);
        System.out.println();
        int averageEmployeeSalaryOfDepartment1 = employeeBook.averageEmployeeSalaryOfDepartment1();
        System.out.println("Средняя зарплата по отделу 1 составляет - " + averageEmployeeSalaryOfDepartment1);
        System.out.println();
        employeeBook.salaryIncreasedBy10PercentOfDepartment1();
        System.out.println();
        employeeBook.printPeopleInTheDepartment1();
        System.out.println();
        employeeBook.printPeopleLesOf25_000Salary();
        System.out.println();
        employeeBook.printPeopleMoreOf25_000Salary();
        System.out.println();
        employeeBook.removeContact(7);
        System.out.println();
        employeeBook.findContact(7);
        System.out.println();
        employeeBook.addContact("Иванов Иван Иванович", 4, 13_500);
        employeeBook.listOfAllEmployees();
        System.out.println();
        employeeBook.findContact(6);
        System.out.println();
        employeeBook.removeContact(6);
        System.out.println();
        employeeBook.findContact(6);
        employeeBook.addContact("Золочевская Арина Александровна", 3, 75_000);
        System.out.println();
        employeeBook.listOfAllEmployees();
        employeeBook.addContact("Петров Петр Петрович", 1, 1_000);
    }
}