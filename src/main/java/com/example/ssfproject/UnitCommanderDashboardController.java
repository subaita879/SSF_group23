package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;

import java.io.IOException;

public class UnitCommanderDashboardController
{

    @javafx.fxml.FXML
    private AnchorPane mainBorderpane;
    @javafx.fxml.FXML
    private BorderPane mainPane3;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LiveUnitMonitoringBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G2.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MissionEvaluationBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G6.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void RiskAndSafetyBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G3.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void CommandReportingBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G8.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ResourceManagementBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G7.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void RequestManagementBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G5.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MissionManagementBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G1.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    @javafx.fxml.FXML
    public void IncidentReviewBOA(ActionEvent actionEvent) {
        try {
            loadFxmlParentToBorderPaneCenter("u1G4.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void loadFxmlParentToBorderPaneCenter(String fxmlName){
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            mainPane3.setCenter(nextFxmlLoader.load());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void LogOutBOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("logIn.fxml"));
            Node node = fxmlLoader.load();
            mainPane3.getChildren().setAll(node);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
