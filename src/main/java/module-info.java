module com.example.ssfproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ssfproject to javafx.fxml;
    exports com.example.ssfproject;
}