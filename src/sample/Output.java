package sample;

/**
 * Created by jarednielson on 10/15/15.
 */
public class Output {
    private String output;

    public Output(){
        this.output = "0";
    }

    public String getOutput(){
        updateOutput();
        return output;
    }

    private void updateOutput() {
        output = MainScreenController.getInput().getCurrInputAsString();
    }


}
