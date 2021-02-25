package lesson5.hw;

public class Test {
    public static void main(String[] args) {
        // паттерн Builder (строитель)
        Person person = Person.builder()
                .withFullName("Ivanov Ivan")
                .withPosition("Developer")
                .withEmail("111@gd.ru")
                .withPhoneNumber("1222222222")
                .withAge(30)
                .withSalary(300500)
                .build();

        System.out.println(person);
        person.printInfo();

        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i++) {
            persons[i] = new Person("Name" + i, "pos" + i,
                    "email", "89123412" + i, 100 + i, 38 + i);
        }

        for (Person p : persons) {
            if (p.getAge() > 40) {
                p.printInfo();
            }
        }
    }
}
