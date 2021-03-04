package lesson7.hospital;

import java.util.Arrays;
import java.util.List;

public class HeartTreatment extends Treatment {

    @Override
    public List<String> getPills() {
        return Arrays.asList(
                "Валидол",
                "Карвалол",
                "Лизиноприл",
                "Конкор"
        );
    }
}
