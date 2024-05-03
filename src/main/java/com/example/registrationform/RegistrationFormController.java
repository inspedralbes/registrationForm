package com.example.registrationform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

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
            //TODO: Canviar la escena
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR,  "Fill in all the fields!");
            alert.show();

        }
    }

}
