module com.example.elliotts_bakery_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.elliotts_bakery_project to javafx.fxml;
    exports com.example.elliotts_bakery_project;
}