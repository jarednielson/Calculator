package sample;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainScreenController {


    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button btnEval;
    public Button btnAdd;
    public Button btnSub;
    public Button btnDecPnt;
    public Button btnMul;
    public Button btnDiv;
    public TextField textfield;

    private static Input input = new Input();
    private static Output output = new Output();
    private static Calculator calculator = new Calculator();

    public static Input getInput() {
        return input;
    }
    
    public void onClickBtn1(ActionEvent actionEvent) {
        input.setCurrentInput(1);
        textfield.setText(output.getOutput());
    }
    
    public void onClickBtn2(ActionEvent actionEvent) {
        input.setCurrentInput(2);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn3(ActionEvent actionEvent) {
        input.setCurrentInput(3);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn4(ActionEvent actionEvent) {
        input.setCurrentInput(4);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn5(ActionEvent actionEvent) {
        input.setCurrentInput(5);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn6(ActionEvent actionEvent) {
        input.setCurrentInput(6);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn7(ActionEvent actionEvent) {
        input.setCurrentInput(7);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn8(ActionEvent actionEvent) {
        input.setCurrentInput(8);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn9(ActionEvent actionEvent) {
        input.setCurrentInput(9);
        textfield.setText(output.getOutput());
    }

    public void onClickBtn0(ActionEvent actionEvent) {
        input.setCurrentInput(0);
        textfield.setText(output.getOutput());
    }

    public void onClickBtnEval(ActionEvent actionEvent) {
    }

    public void onClickBtnClear(ActionEvent actionEvent) {
        input.clear();
        textfield.setText(output.getOutput());
    }

    public void onClickBtnDecPnt(ActionEvent actionEvent) {
        input.setCurrentInput(".");
        textfield.setText(output.getOutput());
    }

    public void onClickBtnAdd(ActionEvent actionEvent) {
        Calculator calculator = new Calculator(input.getCurrInputAsString(), input.getOldInputAsString());
        input.createNewInput();

    }

    public void onClickBtnSub(ActionEvent actionEvent) {
    }

    public void onClickBtnMul(ActionEvent actionEvent) {
    }

    public void onClickBtnDiv(ActionEvent actionEvent) {

    }
}
