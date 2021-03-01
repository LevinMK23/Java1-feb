package lesson7.hospital;

import java.util.List;

public class FluTreatment extends Treatment {

    @Override
    public List<String> getPills() {
        return List.of(
                "лимон",
                "пить воду",
                "арбидол",
                "парацетамол"
        );
    }
}
