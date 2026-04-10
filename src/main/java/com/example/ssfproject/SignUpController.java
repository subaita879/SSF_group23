package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.FileWriter;

public class SignUpController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPField;
    @javafx.fxml.FXML
    private PasswordField confirmPasswordField;
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


    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public boolean saveAccountToFile(String id, String desig, String pass) {
        try {
            FileWriter fw = new FileWriter("UserAccounts.txt", true);
            fw.write(id + "," + desig + "," + pass + "\n");
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @javafx.fxml.FXML
    public void CreateAccountBOA(ActionEvent actionEvent) {
        String id = idTextField.getText();
        String designation = desigComboBox.getValue();
        String password = passwordPField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (id.isEmpty() || designation == null || password.isEmpty()) {
            showAlert("Error", "All fields are required!");
            return;
        }

        if (!password.equals(confirmPassword)) {
            showAlert("Error", "Passwords do not match!");
            return;
        }

        if (password.length() < 6) {
            showAlert("Error", "Password must be at least 6 characters.");
            return;
        }


        boolean success = saveAccountToFile(id, designation, password);

        if (success) {
            showAlert("Success", "Account created for " + designation);
            // Clear fields or switch scene
        }
    }
}