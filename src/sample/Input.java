package sample;

import java.util.ArrayList;

/**
 * Created by jarednielson on 10/14/15.
 * Class to handle all input.
 */
public class Input {
    private String currentInput = "0";
    private String lastInput = "0";
    private ArrayList<String> currInputList = new ArrayList<String>();
    private ArrayList<String> oldInputList = new ArrayList<String>();
    private double currentValue = 0;
    private boolean isDecimal = false;


    public void setCurrentInput(int currentInput) {
        this.lastInput = this.currentInput;
        this.currentInput = String.valueOf(currentInput);
        if( this.currInputList.size() <= 10) {
            this.currInputList.add(String.valueOf(currentInput));
        }
    }

    public void setCurrentInput(String currentInput){
        if(isDecimal && currentInput == "."){
            return;
        } else if( currentInput == "."){
            this.isDecimal = true;
        }
        this.lastInput = this.currentInput;
        this.currentInput = currentInput;
        if( this.currInputList.size() <= 10){
            this.currInputList.add(currentInput);
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public String getCurrInputAsString(){
        String str = "";

        for(int i = 0; i < currInputList.size(); i++){
            str += currInputList.get(i);
        }
        return str;
    }

    public String getOldInputAsString(){
        String str  = "";

        for(int i = 0; i < oldInputList.size(); i++){
            str += oldInputList.get(i);
        }
        return str;
    }

    public void clear(){
        currInputList.clear();
        oldInputList.clear();
        currentInput = "0";
        lastInput = "0";
        isDecimal = false;
    }

    public void createNewInput(){
        oldInputList = currInputList;
        currInputList.clear();
    }
}