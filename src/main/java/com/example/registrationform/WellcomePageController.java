package com.example.registrationform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WellcomePageController {
    @FXML
    public Label labelUserName;

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
        labelUserName.setText(this.userName );
    }
}
