package lesson7.hospital;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Doctor d1 = new Therapist();
        Doctor d2 = new Cardiologist();
        Hospital hospital = new Hospital(List.of(d1, d2));
        Patient p1 = new Patient("Иван", "кашель");
        Patient p2 = new Patient("Петр", "давление");
        hospital.process(p1);
        hospital.process(p2);
        hospital.process(p1);
    }
}
