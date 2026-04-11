package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class LocalLawDashboardController {

    @javafx.fxml.FXML
    private BorderPane mainPane4;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogOutBOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logIn.fxml"));
            Node node = fxmlLoader.load();
            mainPane4.getChildren().setAll(node);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void AssignedOperationsBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G1.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ReportBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G8.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void IntelligenceReportingBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G6.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void IncidentReportingBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G5.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void JointOpBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G3.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void PerimeterControlBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G2.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void IdAndVehicleBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G4.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void CommunicationCoordinationBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u2G7.fxml");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadFxmlParentToBorderPaneCenter(String fxmlName){
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            mainPane4.setCenter(nextFxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}