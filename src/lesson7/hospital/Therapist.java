package lesson7.hospital;

import java.util.Arrays;
import java.util.List;

public class Therapist extends Doctor {

    @Override
    public List<String> specialisation() {
        return Arrays.asList(
                "боль в горле",
                "кашель",
                "температура",
                "насморк"
        );
    }

    @Override
    public Treatment getTreatment() {
        return new FluTreatment();
    }
}
