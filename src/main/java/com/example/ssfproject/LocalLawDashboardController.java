package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

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
    }

    @javafx.fxml.FXML
    public void ReportBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IntelligenceReportingBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IncidentReportingBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void JointOpBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PerimeterControlBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IdAndVehicleBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CommunicationCoordinationBOA(ActionEvent actionEvent) {
    }

}