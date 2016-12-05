import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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
    private JCheckBox rampartsCheckBox;
    private JCheckBox highCheckBox;
    private JCheckBox lowCheckBox;
    private JCheckBox isDefensiveCheckBox;

    private boolean nothingSelected = nothingRadioButton.isSelected();
    private boolean movesSelected = movesRadioButton.isSelected();
    private boolean crossesSelected = crossesRadioButton.isSelected();
    private boolean scoresLowSelected = scoresLowRadioButton.isSelected();
    private boolean scoresHighSelected = scoresHighRadioButton.isSelected();
    private boolean portcullisSelected = portcullisCheckBox.isSelected();
    private boolean chevalDeFriseSelected = chevalDeFriseCheckBox.isSelected();
    private boolean rampartsSelected = rampartsCheckBox.isSelected();
    private boolean moatSelected = moatCheckBox.isSelected();
    private boolean drawBridgeSelected = drawBridgeCheckBox.isSelected();
    private boolean roughTerrainSelected = roughTerrainCheckBox.isSelected();
    private boolean rockWallSelected = rockWallCheckBox.isSelected();
    private boolean lowBarSelected = lowBarCheckBox.isSelected();
    private boolean scaleSelected = scaleCheckBox.isSelected();
    private boolean highSelected = highCheckBox.isSelected();
    private boolean lowSelected = lowCheckBox.isSelected();
    private boolean defensiveSelected = isDefensiveCheckBox.isSelected();

    private String nameField = teamNameTextField.getText();
    private String numberField = teamNumberTextField.getText();

    private boolean autoBools[] = {nothingSelected, movesSelected, crossesSelected, scoresLowSelected, scoresHighSelected};
    private boolean teleBools[] = {portcullisSelected, chevalDeFriseSelected, rampartsSelected, moatSelected,
            drawBridgeSelected, roughTerrainSelected, rockWallSelected, lowBarSelected};

    public PitsGUI() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    nothingRadioButton.setEnabled(true);
                    portcullisCheckBox.setEnabled(false);
                    chevalDeFriseCheckBox.setEnabled(false);
                    rampartsCheckBox.setEnabled(false);
                    moatCheckBox.setEnabled(false);
                    drawBridgeCheckBox.setEnabled(false);
                    roughTerrainCheckBox.setEnabled(false);
                    rockWallCheckBox.setEnabled(false);
                    lowBarCheckBox.setEnabled(false);
                    scaleCheckBox.setEnabled(false);
                    highCheckBox.setEnabled(false);
                    lowCheckBox.setEnabled(false);
                    isDefensiveCheckBox.setEnabled(false);
                    nameField = "";
                    numberField = "";
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PitEntry temp = new PitEntry(nameField, numberField, autoBools, teleBools, highSelected, lowSelected, scaleSelected, defensiveSelected);
                File pits = new File(nameField + ".csv");
                try {
                    FileWriter pitWriter = new FileWriter(pits);
                    pitWriter.write(temp.toString());
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}
