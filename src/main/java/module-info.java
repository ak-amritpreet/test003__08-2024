module com.example.test3amritcsd214 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.test3amritcsd214 to javafx.fxml;
    exports com.example.test3amritcsd214;
}