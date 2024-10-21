module com.example.taty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taty to javafx.fxml;
    exports com.example.taty;
    exports com.example.taty.controller;
    opens com.example.taty.controller to javafx.fxml;
}