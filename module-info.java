module com.example.ass3java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ass3java to javafx.fxml;
    exports com.example.ass3java;
}