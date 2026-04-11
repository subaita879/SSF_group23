package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class U1G4Controller
{
    @javafx.fxml.FXML
    private TableColumn<Incident,String> statusTableColumn;
    @javafx.fxml.FXML
    private TextField incidentIdTextField;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> locationTableColumn;
    @javafx.fxml.FXML
    private TableView<Incident> incidentTableView;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> dateTableColumn;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableColumn<Incident,String> incidentIdTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll(
                "Resolved",
                "Unresolved",
                "Under Investigation"
        );

        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("incidentStatus"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        incidentIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("incidentId"));
    }

    @javafx.fxml.FXML
    public void MarkResolvedBOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void SearchIncidentBOA(ActionEvent actionEvent) {

    }
}