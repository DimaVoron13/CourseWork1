public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addContact(new Employee("Андрицкая Светлана Евгеньевна", 1, 20_000));
        employeeBook.addContact(new Employee("Соболева Елена Александровна", 2, 24_000));
        employeeBook.addContact(new Employee("Некрасова Олеся Михайловна", 5, 29_000));
        employeeBook.addContact(new Employee("Стяжкина Надежда Сергеевна", 4, 35_000));
        employeeBook.addContact(new Employee("Лампель Екатерина Владимировна", 4, 59_000));
        employeeBook.addContact(new Employee("Смирнов Евгений Валерьевич", 1, 14_000));
        employeeBook.addContact(new Employee("Леуский Владислав Петрович", 3, 7_000));
        employeeBook.addContact(new Employee("Яковлев Андрей Владимирович", 5, 2_000));
        employeeBook.addContact(new Employee("Хохлов Сергей Владимирович", 1, 43_000));
        employeeBook.addContact(new Employee("Дудоров Олег Владимирович", 2, 25_000));
        employeeBook.listOfAllEmployees();
        System.out.println();
        System.out.println("Общая сумма затрат на ЗП - " + employeeBook.calculateSalary());
        System.out.println();
        System.out.println("Минимальная зарплата сотрудника - " + employeeBook.calculateMinimumSalary());
        System.out.println();
        System.out.println("Максимальная зарплата сотрудника - " + employeeBook.calculateMaximumSalary());
        System.out.println();
        System.out.println("Средняя зарплата сотрудников составляет - " + employeeBook.averageEmployeeSalary());
        System.out.println();
        employeeBook.printFullNames();
        System.out.println();
        employeeBook.salaryIncreasedByIndexPercent(10);
        employeeBook.listOfAllEmployees();
        System.out.println();
        System.out.println("Минимальная зарплата по отделу 1 - " + employeeBook.calculateMinimumSalaryOfDepartment(1));
        System.out.println();
        System.out.println("Максимальная зарплата по отделу 1 - " + employeeBook.calculateMaximumSalaryOfDepartment(1));
        System.out.println();
        System.out.println("Расходы на зп по отделу 1 составляют - " + employeeBook.calculateSalaryOfDepartment(1));
        System.out.println();
        System.out.println("Средняя зарплата по отделу 1 составляет - " + employeeBook.averageEmployeeSalaryOfDepartment(1));
        System.out.println();
        employeeBook.salaryIncreasedByPercentOfDepartment(1, 10);
        System.out.println();
        employeeBook.printPeopleInTheDepartment(1);
        System.out.println();
        employeeBook.printPeopleLesOfSalary(25_000);
        System.out.println();
        employeeBook.printPeopleMoreOfSalary(25_000);
        System.out.println();
        employeeBook.removeContact(7);
        System.out.println(employeeBook.printContactById(7));
        System.out.println();
        employeeBook.addContact(new Employee("Иванов Иван Иванович", 4, 13_500));
        employeeBook.listOfAllEmployees();
        System.out.println();
        System.out.println(employeeBook.printContactById(6));
        System.out.println();
        employeeBook.removeContact(6);
        System.out.println(employeeBook.printContactById(6));
        employeeBook.addContact(new Employee("Золочевская Арина Александровна", 3, 75_000));
        System.out.println();
        employeeBook.listOfAllEmployees();
        employeeBook.addContact(new Employee("Петров Петр Петрович", 1, 1_000));
    }
}