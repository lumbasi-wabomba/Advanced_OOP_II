module com.fx.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx.demo to javafx.fxml;
    exports com.fx.demo;
}