package lesson7.hospital;

import java.util.List;

public class HeartTreatment extends Treatment {

    @Override
    public List<String> getPills() {
        return List.of(
                "Валидол",
                "Карвалол",
                "Лизиноприл",
                "Конкор"
        );
    }
}
