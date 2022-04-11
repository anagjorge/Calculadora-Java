/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author anade
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField tfResult;
    
    double num1, num2;
    String operacao;

    /*@FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    @FXML
    private void insert0(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "0");
    }

    @FXML
    private void insert1(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "1");
    }

    @FXML
    private void insert2(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "2");
    }

    @FXML
    private void insert3(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "3");
    }

    @FXML
    private void insert4(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "4");
    }

    @FXML
    private void insert5(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "5");
    }

    @FXML
    private void insert6(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "6");
    }

    @FXML
    private void insert7(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "7");
    }

    @FXML
    private void insert8(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "8");
    }

    @FXML
    private void insert9(ActionEvent event) {

        tfResult.setText(tfResult.getText() + "9");
    }

    @FXML
    private void insertPonto(ActionEvent event) {

        tfResult.setText(tfResult.getText() + ".");
    }

    @FXML
    private void insertCe(ActionEvent event) {

        tfResult.setText("");
    }

    @FXML
    private void insertC(ActionEvent event) {

        num1 = 0;
        num2 = 0;
        tfResult.setText("");
    }

    @FXML
    private void insertSoma(ActionEvent event) {

        num1 = Double.parseDouble(tfResult.getText());
        tfResult.setText("");
        operacao = "soma";
    }

    @FXML
    private void insertSub(ActionEvent event) {

        num1 = Double.parseDouble(tfResult.getText());
        tfResult.setText("");
        operacao = "sub";
    }

    @FXML
    private void insertDiv(ActionEvent event) {

        num1 = Double.parseDouble(tfResult.getText());
        tfResult.setText("");
        operacao = "div";
    }

    @FXML
    private void insertMulti(ActionEvent event) {

        num1 = Double.parseDouble(tfResult.getText());
        tfResult.setText("");
        operacao = "multi";
    }

    @FXML
    private void insertIgual(ActionEvent event) {
        num2 = Double.parseDouble(tfResult.getText());
        switch (operacao) {
            case "soma":
                tfResult.setText(String.valueOf(num1 + num2));
                break;

            case "sub":
                tfResult.setText(String.valueOf(num1 - num2));
                break;

            case "div":
                tfResult.setText(String.valueOf(num1 / num2));
                break;

            case "multi":
                tfResult.setText(String.valueOf(num1 * num2));
                break;
                
            default:
                throw new AssertionError();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
