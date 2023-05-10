module com.example.demojava {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.demojava to javafx.fxml;
    exports com.example.demojava;
    exports com.example.demojava.controllers;
    opens com.example.demojava.controllers to javafx.fxml;
}