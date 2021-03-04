package lesson7.hospital;

import java.util.Arrays;
import java.util.List;

public class FluTreatment extends Treatment {

    @Override
    public List<String> getPills() {
        return Arrays.asList(
                "лимон",
                "пить воду",
                "арбидол",
                "парацетамол"
        );
    }
}
