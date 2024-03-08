package com.example.test3amritcsd214;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    public Button hbt;

    @FXML
    protected void onHelloButtonClick() {
        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("pizza-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("Pizza Order");
            secondStage.setScene(new Scene(secondScene));

            Stage currentStage = (Stage) welcomeText.getScene().getWindow();
            currentStage.close();

            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

