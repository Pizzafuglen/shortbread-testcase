package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private TextArea inputField;

    @FXML
    private Tab loginPage;

    @FXML
    private Button logonButton;

    @FXML
    private Tab personalPage;

    @FXML
    private TextArea consoleTesting;


    @FXML
    public void setButton9() {
        inputField.appendText("9");
    }

    @FXML
    public void setButton8() {
        inputField.appendText("8");
    }

    @FXML
    public void setButton7() {
        inputField.appendText("7");
    }

    @FXML
    public void setButton6() {
        inputField.appendText("6");
    }

    @FXML
    public void setButton5() {
        inputField.appendText("5");
    }

    @FXML
    public void setButton4() {
        inputField.appendText("4");
    }

    @FXML
    public void setButton3() {
        inputField.appendText("3");
    }

    @FXML
    public void setButton2() {
        inputField.appendText("2");
    }

    @FXML
    public void setButton1() {
        inputField.appendText("1");
    }

    @FXML
    public void setButton0() {
        inputField.appendText("0");
    }

    @FXML
    public void loginClicked() {
        String userPass = null;

        if (inputField.getText() != null) {
            userPass = inputField.getText();
            consoleTesting.setText("The user pass is " + userPass);
            inputField.setText("");

        }
    }
}