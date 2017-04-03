package com.mycompany.testgitproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField field;
    
    private String emptyMsg = "Field is empty";
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String msg = (field.getText().isEmpty()) ? emptyMsg : field.getText();
        label.setText(msg);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
