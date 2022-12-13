package com.example.a;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloController {

//    variable to store random number
    int randomnum;
    Random random = new Random();// creating a random object


    // making 3 identical arraylists to store named entered, colored sellected and seats occupied till now
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> colors = new ArrayList<>();
    ArrayList<Integer> seats = new ArrayList<>();

//    random numbers will be selected from this array only, wnen any number is selcted
//    that number will be deleted from arraylist
//    so that it cant be picked again
    ArrayList<Integer> randomNums = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));


// methods
    public void provideSeat(String name,String color){

        if(randomNums.size()!=1) {
            randomnum = random.nextInt(randomNums.size() - 1) + 1;
            int index = randomnum;
            int randNum = randomNums.get(index);

//conditions
            if (randNum == 1) {
                l1.setText(name);
                seats.add(1);
                color1.setFill(Color.web(color));

                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 2) {
                l2.setText(name);
                seats.add(2);
                color2.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 3) {
                l3.setText(name);
                seats.add(3);
                color3.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 4) {
                l4.setText(name);
                seats.add(4);
                color4.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 5) {
                l5.setText(name);
                seats.add(5);
                color5.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 6) {
                l6.setText(name);
                seats.add(6);
                color6.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 7) {
                l7.setText(name);
                seats.add(7);
                color7.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 8) {
                l8.setText(name);
                seats.add(8);
                color8.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

            if (randNum == 9) {
                l9.setText(name);
                seats.add(9);
                color9.setFill(Color.web(color));
                colors.add(color);
                names.add(name);
                inputColor.setValue(Color.valueOf("0xffffffff"));
                inputText.clear();
            }

//            romiving the element from list
            randomNums.remove(index);
            if(randomNums.size()==1){
                errorLabel.setText("CONTRATS.....!");
            }
        }else{
            errorLabel.setText("ERROR: All Seats Are Occupied");
        }



    }


    @FXML
    private Rectangle color1;

    @FXML
    private Rectangle color2;

    @FXML
    private Rectangle color3;

    @FXML
    private Rectangle color4;

    @FXML
    private Rectangle color5;

    @FXML
    private Rectangle color6;

    @FXML
    private Rectangle color7;

    @FXML
    private Rectangle color8;

    @FXML
    private Rectangle color9;

    @FXML
    private ColorPicker inputColor;

    @FXML
    private TextField inputText;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;

    @FXML
    private Label l9;

    @FXML
    private Label errorLabel;



    @FXML
    void submit(ActionEvent event) {

//        instance variables
        String name = inputText.getText();
        String userColor = inputColor.getValue().toString();

        errorLabel.setText("");

//        displaying errors
        if(name.isEmpty()){
            errorLabel.setText("ERROR: Name Field is empty");
        } else if (userColor.equals("0xffffffff")) {
            errorLabel.setText("ERROR: Color is not selected");
        } else if (names.contains(name)) {
            errorLabel.setText("ERROR: Name is Already Taken.");
        } else if (colors.contains(userColor)) {
            errorLabel.setText("ERROR: Color is Already Taken");
        } else{
//            calling a method
         provideSeat(name,userColor);
        }


    }

}
