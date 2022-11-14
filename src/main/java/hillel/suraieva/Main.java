package hillel.suraieva;

import hillel.suraieva.car.Car;
import hillel.suraieva.employee.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Задача Car:-------");
        Car car1 = new Car("ВН5900ОО");
        car1.start(car1.getNumber());

        System.out.println("-------Задача Employee:-------");
        Employee employee1 = new Employee("Карпенко Олег Игнатьевич",
                "Коммерческий директор", "karpenko@ukr.net", "+380636573441", 49);
        System.out.println("ФИО - "+employee1.getPib() + ",\n"+
                "Должность - " + employee1.getPosition()+",\n"+
                "E-mail - " + employee1.getMail()+",\n"+
                "Номер телефона - "+ employee1.getPhone()+",\n"+
                "Возраст - " + employee1.getAge());
    }
}
