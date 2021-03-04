package lesson8.fx;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    public TextField input;
    private long left;
    private String operation;

    public void process(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String text = button.getText();
        switch (text) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                processDigit(text);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                processOperation(text);
                break;
            case "C":
                input.clear();
                break;
            case "enter":
                calculate();
                break;
        }
    }

    private void calculate() {
        long result;
        switch (operation) {
            case "+":
                result = left + Long.parseLong(input.getText());
                input.setText(String.valueOf(result));
                break;
            case "*":
                result = left * Long.parseLong(input.getText());
                input.setText(String.valueOf(result));
                break;
            case "/":
                result = left / Long.parseLong(input.getText());
                input.setText(String.valueOf(result));
                break;
            case "-":
                result = left - Long.parseLong(input.getText());
                input.setText(String.valueOf(result));
                break;
        }
    }

    private void processOperation(String operation) {
        this.operation = operation;
        left = Long.parseLong(input.getText());
        input.clear();
    }

    private void processDigit(String digit) {
        input.appendText(digit);

    }
}
