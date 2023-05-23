module com.example.labjavagame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labjavagame to javafx.fxml;
    exports com.example.labjavagame;
}
