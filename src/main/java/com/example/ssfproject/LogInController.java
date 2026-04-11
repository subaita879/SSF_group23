package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LogInController {
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPField;
    @javafx.fxml.FXML
    private ComboBox<String> desigComboBox;
    @javafx.fxml.FXML
    private VBox mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        desigComboBox.getItems().addAll(
                "Unit Commander",
                "Local Law Enforcement",
                "Operations Manager",
                "Simulation Controller",
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


    @javafx.fxml.FXML
    public void loginBOA(ActionEvent actionEvent) {
        String id = idTextField.getText();
        String desig = desigComboBox.getValue();
        String pass = passwordPField.getText();

        if (id == null || id.isEmpty()) {
            showAlert("Error", "Please enter ID");
            return;
        }

        if (desig == null || desig.isEmpty()) {
            showAlert("Error", "Please select Designation");
            return;
        }

        if (pass == null || pass.isEmpty()) {
            showAlert("Error", "Please enter password");
            return;
        }
        if (!isValidUser(id, pass, desig)) {
            showAlert("Login Failed", "Invalid ID, Password, or Designation.");
            return;

        }


        String fxmlPath = "";
        switch (desigComboBox.getValue()) {
            case "Unit Commander":
                fxmlPath = "unitCommanderDashboard.fxml";
                break;
            case "Local Law Enforcement":
                fxmlPath = "localLawDashboard.fxml";
                break;
            case "Simulation Controller":
                fxmlPath = "SimulationController.fxml";
                break;
            case "Operations Manager":
                fxmlPath = "OperationsManager.fxml";
                break;
        }

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }

        catch(Exception e){
            e.printStackTrace();

        }
    }
    private boolean isValidUser(String id, String password, String designation) {
        File file = new File("UserAccounts.bin");
        if (!file.exists()) return false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<User> userList = (ArrayList<User>) ois.readObject();

            for (User u : userList) {
                if (u.getId().equals(id) &&
                        u.getPassword().equals(password) &&
                        u.getDesignation().equals(designation)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

