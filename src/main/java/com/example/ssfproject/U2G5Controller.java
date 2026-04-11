package com.example.ssfproject;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class U2G5Controller
{
    @javafx.fxml.FXML
    private TextField incidentIdTextField;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TextField locationTextField;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll(
                "Resolved",
                "Unresolved",
                "Under Investigation"
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
    public void SubmitReportBOA(ActionEvent actionEvent) {
        LocalDate date = dateDatePicker.getValue();
        String incidentId = incidentIdTextField.getText();
        String status = statusComboBox.getValue();
        String location = locationTextField.getText();
        String description = descriptionTextArea.getText();


        Incident newIncident = new Incident(
                dateDatePicker.getValue(),
                incidentIdTextField.getText(),
                statusComboBox.getValue(),
                locationTextField.getText(),
                descriptionTextArea.getText()
                );



        File file = new File("incidents.bin");
        ArrayList<Incident> incidentList = new ArrayList<>();


        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                incidentList = (ArrayList<Incident>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        incidentList.add(newIncident);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(incidentList);
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (saveIncidentToFile(date, incidentId, status, location, description)) {
            showAlert("Success", "Submitted Report for " + incidentId);
        }
        dateDatePicker.setValue(null);
        descriptionTextArea.clear();
        incidentIdTextField.clear();
        locationTextField.clear();
        statusComboBox.setValue(null);

    }


    public boolean saveIncidentToFile(LocalDate date,String id, String stat, String loc, String desc) {

        try {
            FileWriter fw = new FileWriter("incident.txt", true);
            fw.write(date +"," + id + "," + stat + "," + loc + "," + desc + "\n");
            fw.close();
            return true;

        } catch (Exception e) {
            return false;

        }
    }
}