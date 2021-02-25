package lesson5.hw;

// POJO - дата сущность (объект для трансфера данных)
public class Person {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Person(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(fullName + " " + position + " " + email + " " +
                phoneNumber + " " + salary + " " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static final class PersonBuilder {

        private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;

        private PersonBuilder() {
        }

        public PersonBuilder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public PersonBuilder withPosition(String position) {
            this.position = position;
            return this;
        }

        public PersonBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder withSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(fullName, position, email, phoneNumber, salary, age);
        }
    }
}
