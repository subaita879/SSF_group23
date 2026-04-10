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
    }

    @javafx.fxml.FXML
    public void MissionEvaluationBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RiskAndSafetyBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CommandReportingBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ResourceManagementBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestManagementBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void MissionManagementBOA(ActionEvent actionEvent) {
        try {
            Node node = FXMLLoader.load(getClass().getResource("u1G1.fxml"));
            mainBorderpane.getChildren().setAll(node);
            loadFxmlParentToBorderPaneCenter("CourseSpecificWithdrawalChartView.fxml");

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    @javafx.fxml.FXML
    public void IncidentReviewBOA(ActionEvent actionEvent) {
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
}
