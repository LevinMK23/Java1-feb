package lesson7.hospital;

import java.util.List;

public class Patient {

    private Treatment treatment;
    private String name;
    private String symptom;

    public Patient(String name, String symptom) {
        this.symptom = symptom;
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
        List<String> pills = treatment.getPills();
        for (String pill : pills) {
            System.out.println(name + " употребил " + pill);
        }
        System.out.println(name + " полностью здоров");
        symptom = "";
    }
}
