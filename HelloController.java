package com.example.ass3java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField rupeeTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private void convertRupeeToCAD() {
        try {
            double rupees = Double.parseDouble(rupeeTextField.getText());
            double conversionRate = 0.01671682; // 1 INR = 0.01671682 CAD
            double cad = rupees * conversionRate;
            resultLabel.setText(String.format("%.2f INR = %.2f CAD", rupees, cad));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }
}
