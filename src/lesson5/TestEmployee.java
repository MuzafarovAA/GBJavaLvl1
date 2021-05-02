package lesson5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Цукерман Вениамин Чехович", "Эксперт", "TsukermanVCh@company.ru", 867171301, 250000, 58);
        employeesArray[1] = new Employee("Иванов Иван Иванович", "Ведущий инженер", "IvanovII@company.ru", 867071404, 50000, 30);
        employeesArray[2] = new Employee("Власов Максим Геннадьевич", "Специалист", "VlasovMG@company.ru", 867075120, 25000, 24);
        employeesArray[3] = new Employee("Белкина Ирина Александровна", "Главный специалист", "BelkinaIA@company.ru", 867075121, 90000, 42);
        employeesArray[4] = new Employee("Герман Валентина Натальевна", "Нормоконтролер", "GermanVN@company.ru", 867077410, 43000, 51);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].getInfo();
                System.out.println();
            }
        }
    }
}
