package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

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
    private VBox mainPane2;

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

    public boolean saveAccountToBinAndTxtFile(String id, String desig, String pass) {
        File f;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            //
            f = new File("UserAccounts.bin");
            FileWriter fw = new FileWriter("UserAccounts.txt", true);
            fw.write(id + "," + desig + "," + pass + "\n");
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Object());
            fw.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
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


        boolean success = saveAccountToBinAndTxtFile(id, designation, password);

        if (success) {
            showAlert("Success", "Account created for " + designation);
        }


        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logIn.fxml"));
            Node node = fxmlLoader.load();
            mainPane2.getChildren().setAll(node);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void switchtoLogInBOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logIn.fxml"));
            Node node = fxmlLoader.load();
            mainPane2.getChildren().setAll(node);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}