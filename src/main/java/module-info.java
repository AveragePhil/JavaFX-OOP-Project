module com.oop_projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.oop_projectjavafx to javafx.fxml;
    exports com.oop_projectjavafx;
}
