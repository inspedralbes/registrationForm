package com.example.registrationform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;

public class RegistrationFormController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {

        if (!nameField.getText().isEmpty() && !emailField.getText().isEmpty() && !passwordField.getText().isEmpty())
        {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(RegistrationForm.class.getResource("wellcome-page.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 550, 275);
                WellcomePageController wellcomePageController =  fxmlLoader.getController();
                wellcomePageController.setUserName(nameField.getText());
                RegistrationForm.getPrimaryStage().setScene(scene);
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR,  "Could not load the resource!");
                alert.show();
            }

        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING,  "Fill in all the fields!");
            alert.show();
        }
    }

}
