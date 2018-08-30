package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    private Label scoreLabel;

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;

    @FXML
    public void handleButtonAction(ActionEvent actionEvent){
        System.out.println("Button clicked");

        double height = Double.parseDouble(heightField.getText())/100;
        int weight  = Integer.parseInt(weightField.getText());

        double score = weight/(height*height);

        scoreLabel.setText(String.format("Wskaźnik BMI to: %.2f ",score));
    }
}
