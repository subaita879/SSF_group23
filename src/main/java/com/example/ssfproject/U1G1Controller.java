package com.example.ssfproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class U1G1Controller {
    @javafx.fxml.FXML
    private TableColumn<Mission, String> missionIdTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> unitComboBox;
    @javafx.fxml.FXML
    private TableView<Mission> activeMissionTableView;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> taskTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> locationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> unitTableColumn;
    @javafx.fxml.FXML
    private TextField taskTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableColumn<Mission, String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    private ObservableList<Mission> missionList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TextField missionIdTextField;


    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll(
                "Assigned",
                "In Progress",
                "Completed"
        );

        unitComboBox.getItems().addAll(
                "Unit A",
                "Unit B",
                "Unit C"
        );
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        taskTableColumn.setCellValueFactory(new PropertyValueFactory<>("task"));
        missionIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("missionID"));
        unitTableColumn.setCellValueFactory(new PropertyValueFactory<>("unit"));
    }


    @javafx.fxml.FXML
    public void AssignTaskBOA(ActionEvent actionEvent) {
        ObservableList<Mission> missionList = FXCollections.observableArrayList();
        activeMissionTableView.setItems(missionList);
    }



}