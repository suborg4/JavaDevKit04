package javadevkit04;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * - Табельный номер
 * - Номер телефона
 * - Имя
 * - Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавление сотрудников в справочник
        directory.addEmployee(new Employee(1, "1234567890", "Boris", 5));
        directory.addEmployee(new Employee(2, "0987654321", "Ekaterina", 3));
        directory.addEmployee(new Employee(3, "5555555555", "Artemii", 7));

        // Поиск сотрудника по стажу
        int experienceToSearch = 5;
        List<Employee> employeesByExperience = directory.searchByExperience(experienceToSearch);
        System.out.println("Сотрудники со стажем " + experienceToSearch + ":");
        for (Employee employee : employeesByExperience) {
            System.out.println(employee.getName());
        }

        // Получение номеров телефонов сотрудников по имени
        String nameToSearch = "Alice";
        List<String> phoneNumbers = directory.getPhoneNumbersByName(nameToSearch);
        System.out.println("Номера телефонов сотрудника " + nameToSearch + ":");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        // Поиск сотрудника по табельному номеру
        int employeeIdToSearch = 3;
        Employee employeeById = directory.searchByEmployeeId(employeeIdToSearch);
        if (employeeById != null) {
            System.out.println("Сотрудник с табельным номером " + employeeIdToSearch + ":");
            System.out.println(employeeById.getName());
        } else {
            System.out.println("Сотрудник с табельным номером " + employeeIdToSearch + " не найден.");
        }
    }
}