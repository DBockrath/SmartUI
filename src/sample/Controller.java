package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML private RadioButton left;
    @FXML private RadioButton middle;
    @FXML private RadioButton right;

    @FXML private RadioButton cross_auto_line;
    @FXML private RadioButton scale_double_cube;
    @FXML private RadioButton scale_to_switch;
    @FXML private RadioButton switch_double_cube;
    @FXML private RadioButton scale_only;
    @FXML private RadioButton switch_only;

    public void radioSelect(ActionEvent event) {

        String positionMessage = "";
        String actionMessage = "";

        if (left.isSelected()) positionMessage = "Left";
        else if (middle.isSelected()) positionMessage = "Middle";
        else if (right.isSelected()) positionMessage = "Right";

        if (cross_auto_line.isSelected()) actionMessage = "Cross Auto Line";
        else if (scale_double_cube.isSelected()) actionMessage = "Scale Double Cube";
        else if (scale_to_switch.isSelected()) actionMessage = "Scale To Switch";
        else if (switch_double_cube.isSelected()) actionMessage = "Switch Double Cube";
        else if (scale_only.isSelected()) actionMessage = "Scale Only";
        else if (switch_only.isSelected()) actionMessage = "Switch Only";

        if (!positionMessage.equals("") && !actionMessage.equals("")) {

            System.out.println("Starting Position: " + positionMessage);
            System.out.println("Autonomous Action: " + actionMessage);

        }

    }

}