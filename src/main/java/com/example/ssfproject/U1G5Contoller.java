package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class U1G5Contoller
{
    @javafx.fxml.FXML
    private TextArea detailedRequirementTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> requestTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker desiredTimelineDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> priorityLevelComboBox;
    @javafx.fxml.FXML
    private TableColumn<Requests, String> statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Requests,Integer> requestIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Requests> requestsTableView;
    @javafx.fxml.FXML
    private TableColumn<Requests, LocalDate> timestampTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        requestTypeComboBox.getItems().addAll(
                "Resource",
                "Personnel",
                "Maintenance",
                "Backup"
        );
        priorityLevelComboBox.getItems().addAll(
                "High",
                "Low",
                "Emergency",
                "Medium"
        );
    }

    @javafx.fxml.FXML
    public void ApproveRequestsBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SearchRequestBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RejectRequestsBOA(ActionEvent actionEvent) {
    }
}