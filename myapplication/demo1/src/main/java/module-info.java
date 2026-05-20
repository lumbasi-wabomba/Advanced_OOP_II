module com.fx.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.fx.demo1 to javafx.fxml;
    exports com.fx.demo1;
}