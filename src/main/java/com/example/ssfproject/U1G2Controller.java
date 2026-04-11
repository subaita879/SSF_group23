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
        } else if (status.equalsIgnoreCase("Standby")) {
            alphaCircle.setFill(Color.YELLOW);
            alphaStatusLabel.setText("Standby");
            alphaStatusLabel.setTextFill(Color.YELLOW);
        } else {
            alphaCircle.setFill(Color.GREEN);
            alphaStatusLabel.setText("Active");
            alphaStatusLabel.setTextFill(Color.GREEN);
        }

        if (status.equalsIgnoreCase("In Danger")) {
            charlieCircle.setFill(Color.RED);
            charlieStatusLabel.setText("In Danger");
            charlieStatusLabel.setTextFill(Color.RED);
        } else if (status.equalsIgnoreCase("Standby")) {
            charlieCircle.setFill(Color.YELLOW);
            charlieStatusLabel.setText("Standby");
            charlieStatusLabel.setTextFill(Color.YELLOW);
        } else {
            charlieCircle.setFill(Color.GREEN);
            charlieStatusLabel.setText("Active");
            charlieStatusLabel.setTextFill(Color.GREEN);
        }

        if (status.equalsIgnoreCase("In Danger")) {
            alphaCircle.setFill(Color.RED);
            bravoStatusLabel.setText("In Danger");
            bravoStatusLabel.setTextFill(Color.RED);
        } else if (status.equalsIgnoreCase("Standby")) {
            alphaCircle.setFill(Color.YELLOW);
            bravoStatusLabel.setText("Standby");
            bravoStatusLabel.setTextFill(Color.YELLOW);
        } else {
            bravoCircle.setFill(Color.GREEN);
            bravoStatusLabel.setText("Active");
            bravoStatusLabel.setTextFill(Color.GREEN);
        }
    }
}