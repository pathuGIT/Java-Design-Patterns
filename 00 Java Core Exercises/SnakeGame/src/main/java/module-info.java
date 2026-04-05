module org.example.snakegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.busGame to javafx.fxml;
    exports org.example.busGame;
}