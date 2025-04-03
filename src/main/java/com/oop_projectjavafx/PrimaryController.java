package com.oop_projectjavafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

        Text title = new Text("Title");
        Button play = new Button("Play");

        TextField name = new TextField();

        GridPane gridPane = new GridPane();

        gridPane.add(title, 0, 0);
        gridPane.add(play, 0, 2);
        gridPane.add(name, 0, 0);
    }
}
