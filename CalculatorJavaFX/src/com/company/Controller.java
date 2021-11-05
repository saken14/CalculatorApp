package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private float data1, data2, res;
    private char operator;
    private String strForRes;
    private String strRes = "";
    private boolean isComaInTextField;
    private int indexOfComa;
    private int indexOfLastZeroFromEndOfStr;

    @FXML
    private TextField display;

    @FXML
    void b0_press(ActionEvent event) {
        if (display.getText().equals("")) {
            display.setText("0");
        }
        else if (display.getText().equals("0")) {

        }
        else {
            display.setText(display.getText() + "0");
        }
    }

    @FXML
    void b1_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "1");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "1");
        }
        else {
            display.setText(display.getText() + "1");
        }
    }

    @FXML
    void b2_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "2");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "2");
        }
        else {
            display.setText(display.getText() + "2");
        }
    }

    @FXML
    void b3_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "3");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "3");
        }
        else {
            display.setText(display.getText() + "3");
        }
    }

    @FXML
    void b4_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "4");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "4");
        }
        else {
            display.setText(display.getText() + "4");
        }
    }

    @FXML
    void b5_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "5");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "5");
        }
        else {
            display.setText(display.getText() + "5");
        }
    }

    @FXML
    void b6_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "6");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "6");
        }
        else {
            display.setText(display.getText() + "6");
        }
    }

    @FXML
    void b7_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "7");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "7");
        }
        else {
            display.setText(display.getText() + "7");
        }
    }

    @FXML
    void b8_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "8");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "8");
        }
        else {
            display.setText(display.getText() + "8");
        }
    }

    @FXML
    void b9_press(ActionEvent event) {
        if (display.getText().contains("0,")) {
            display.setText(display.getText() + "9");
        }
        else if (display.getText().equals("0")) {
            display.setText("");
            display.setText(display.getText() + "9");
        }
        else {
            display.setText(display.getText() + "9");
        }
    }

    @FXML
    void bcoma_press(ActionEvent event) {
        if (!isComaInTextField && !display.getText().equals("")) {
            display.setText(display.getText() + ',');
            isComaInTextField = true;
        }
    }

    @FXML
    void persent(ActionEvent event) {
        if (!display.getText().equals("")) {
            data1 = Float.parseFloat(display.getText().replace(',', '.'));
            display.setText("");
            operator = '%';
            isComaInTextField = false;
        }
    }

    @FXML
    void devide(ActionEvent event) {
        if (!display.getText().equals("")) {
            data1 = Float.parseFloat(display.getText().replace(',', '.'));
            display.setText("");
            operator = '/';
            isComaInTextField = false;
        }
    }

    @FXML
    void product(ActionEvent event) {
        if (!display.getText().equals("")) {
            data1 = Float.parseFloat(display.getText().replace(',', '.'));
            display.setText("");
            operator = '*';
            isComaInTextField = false;
        }
    }

    @FXML
    void subtract(ActionEvent event) {
        if (!display.getText().equals("")) {
            data1 = Float.parseFloat(display.getText().replace(',', '.'));
            display.setText("");
            operator = '-';
            isComaInTextField = false;
        }
        else if (display.getText().equals("")) {
            display.setText("-");
            isComaInTextField = false;
        }
    }

    @FXML
    void add(ActionEvent event) {
        if (!display.getText().equals("")) {
            data1 = Float.parseFloat(display.getText().replace(',', '.'));
            display.setText("");
            operator = '+';
            isComaInTextField = false;
        }
    }

    @FXML
    void clear(ActionEvent event) {
        display.setText("");
        data1 = data2 = 0;
        isComaInTextField = false;
        res = 0;
        strForRes = "";
        strRes = "";
    }

    @FXML
    void equals(ActionEvent event) {
        if (!display.getText().equals("")) {
            data2 = Float.parseFloat(display.getText().replace(',', '.'));
            res = (operator == '+') ? data1 + data2 : (operator == '-') ? data1 - data2 : (operator == '*') ? data1 * data2 : (operator == '/') ? data1 / data2 : data1 % data2;

            strForRes = Float.toString(res);
            indexOfComa = strForRes.indexOf('.');

            if (strForRes.startsWith("0.") || strForRes.startsWith("-0.")) {
                if (strForRes.equals("0.0"))
                    strRes = "0";
                else
                    strRes = strForRes;
            }
            else if (strForRes.contains("0") && strForRes.endsWith("0") && strForRes.contains(".")) {
                int c = 0;
                for (int i = strForRes.length() - 1; i >= 0; i--) {
                    if (strForRes.charAt(i) == '0')
                        c++;
                    else
                        break;
                }
                indexOfLastZeroFromEndOfStr = strForRes.length() - c;
                strRes = strForRes.substring(0, indexOfLastZeroFromEndOfStr-1);
            }
            else {
                strRes = strForRes;
            }
            display.setText(strRes);

            isComaInTextField = false;
            strRes = "";
            strForRes = "";
        }
    }

}
