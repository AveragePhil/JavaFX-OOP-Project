package com.oop_projectjavafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    Button play = new Button("play");

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
