package lesson7.hospital;

import java.util.List;

public class Hospital {

    private final List<Doctor> doctors;

    public Hospital(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void process(Patient patient) {
        String symptom = patient.getSymptom();
        for (Doctor doctor : doctors) {
            if (doctor.specialisation().contains(symptom)) {
                patient.setTreatment(doctor.getTreatment());
                return;
            }
        }
        System.out.println("В госпитале нет докторов с вашим симптомом или вы здоровы");
    }
}
