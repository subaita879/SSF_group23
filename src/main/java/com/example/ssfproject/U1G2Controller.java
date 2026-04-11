package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class U1G2Controller
{
    @javafx.fxml.FXML
    private Circle alphaCircle;
    @javafx.fxml.FXML
    private Label charlieStatusLabel;
    @javafx.fxml.FXML
    private ComboBox<String> unitComboBox;
    @javafx.fxml.FXML
    private Circle bravoCircle;
    @javafx.fxml.FXML
    private Circle charlieCircle;
    @javafx.fxml.FXML
    private Label alphaStatusLabel;
    @javafx.fxml.FXML
    private Label bravoStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        unitComboBox.getItems().addAll(
                "Unit Alpha",
                "Unit Bravo",
                "Unit Charlie"
        );
    }

    @javafx.fxml.FXML
    public void sendInstrictionBOA(ActionEvent actionEvent) {
    }


    public void setUnitStatus(String status) {
        if (status.equalsIgnoreCase("In Danger")) {
            alphaCircle.setFill(Color.RED);
            alphaStatusLabel.setText("In Danger");
            alphaStatusLabel.setTextFill(Color.RED);
        } else {
            alphaCircle.setFill(Color.GREEN);
            alphaStatusLabel.setText("Active");
            alphaStatusLabel.setTextFill(Color.GREEN);
        }
    }
}