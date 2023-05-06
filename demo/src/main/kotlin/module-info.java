module com.example.demo {
    exports com.example.demo.controllers to javafx.fxml;
    opens com.example.demo.controllers to javafx.fxml;
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;



}
