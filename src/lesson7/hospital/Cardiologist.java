package lesson7.hospital;

import java.util.Arrays;
import java.util.List;

public class Cardiologist extends Doctor {

    @Override
    public List<String> specialisation() {
        return Arrays.asList(
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
