import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 2016/12/03.
 */
public class PitsGUI {
    private JRadioButton nothingRadioButton;
    private JRadioButton movesRadioButton;
    private JRadioButton crossesRadioButton;
    private JRadioButton scoresLowRadioButton;
    private JRadioButton scoresHighRadioButton;
    private JCheckBox portcullisCheckBox;
    private JCheckBox chevalDeFriseCheckBox;
    private JCheckBox moatCheckBox;
    private JCheckBox drawBridgeCheckBox;
    private JCheckBox roughTerrainCheckBox;
    private JCheckBox rockWallCheckBox;
    private JCheckBox lowBarCheckBox;
    private JCheckBox scaleCheckBox;
    private JTextField teamNameTextField;
    private JTextField teamNumberTextField;
    private JButton clearButton;
    private JButton submitButton;

    private boolean nothingSelected = nothingRadioButton.isSelected();
    private boolean movesSelected = movesRadioButton.isSelected();
    private boolean crossesSelected = crossesRadioButton.isSelected();
    private boolean scoresLowSelected = scoresLowRadioButton.isSelected();
    private boolean scoresHighSelected = scoresHighRadioButton.isSelected();
    private boolean portcullisSelected = portcullisCheckBox.isSelected();
    private boolean chevalDeFriseSelected = chevalDeFriseCheckBox.isSelected();
    private boolean moatSelected = moatCheckBox.isSelected();
    private boolean drawBridgeSelected = drawBridgeCheckBox.isSelected();
    private boolean roughtTerrainSelected = roughTerrainCheckBox.isSelected();
    private boolean rockWallSelected = rockWallCheckBox.isSelected();
    private boolean lowBarSelected = lowBarCheckBox.isSelected();
    private boolean scaleSelected = scaleCheckBox.isSelected();

    private String nameField = teamNameTextField.getText();
    private String numberField = teamNumberTextField.getText();


    public PitsGUI() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
