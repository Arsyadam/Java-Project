module com.example.arsyadamgaming {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.arsyadamgaming to javafx.fxml;
    exports com.example.arsyadamgaming;
}