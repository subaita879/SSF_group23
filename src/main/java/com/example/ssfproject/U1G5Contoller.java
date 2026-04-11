package com.example.ssfproject;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

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
    }}