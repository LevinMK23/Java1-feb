package lesson7.hospital;

import java.util.List;

public class Cardiologist extends Doctor {

    @Override
    public List<String> specialisation() {
        return List.of(
                "боль в сердце",
                "давление",
                "одышка",
                "спутанность сознания"
        );
    }

    @Override
    public Treatment getTreatment() {
        return new HeartTreatment();
    }
}
