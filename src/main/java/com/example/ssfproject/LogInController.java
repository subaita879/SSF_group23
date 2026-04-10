package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPField;
    @javafx.fxml.FXML
    private ComboBox<String> desigComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        desigComboBox.getItems().addAll(
                "Unit Commanders",
                "Local Law enforcement",
                "Operations Manager" ,
                "Simulation Controller" ,
                "Emergency medical response teams",
                "Operation Center Officers",
                "Unit Officers",
                "Quick Response Team"
        );
    }

    @javafx.fxml.FXML
    public void loginBOA(ActionEvent actionEvent) {
    }
}