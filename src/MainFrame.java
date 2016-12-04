import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JPanel implements ActionListener {

    JPanel originPanel = new JPanel();
    JPanel pitPanel = new JPanel();
    JPanel standPanel = new JPanel();

    public MainFrame() {
        super(new BorderLayout());

        JTextField teamNameField = new JTextField("Team Name Here");
        JTextField teamNumberField = new JTextField("Team Number Here");
        JTextField studentNameField = new JTextField("Your Name Here");

        JRadioButton nothingAutoButton = new JRadioButton("Nothing");
        nothingAutoButton.setMnemonic(KeyEvent.VK_B);
        nothingAutoButton.setActionCommand("Nothing");
        nothingAutoButton.setSelected(true);

        JRadioButton driveAutoButton = new JRadioButton("Drive");
        driveAutoButton.setMnemonic(KeyEvent.VK_C);
        driveAutoButton.setActionCommand("Drive");

        JRadioButton crossAutoButton = new JRadioButton("Cross");
        crossAutoButton.setMnemonic(KeyEvent.VK_D);
        crossAutoButton.setActionCommand("Cross");

        JRadioButton scoreHighAutoButton = new JRadioButton("Score High");
        scoreHighAutoButton.setMnemonic(KeyEvent.VK_R);
        scoreHighAutoButton.setActionCommand("Score High");

        JRadioButton scoreLowAutoButton = new JRadioButton("Score Low");
        scoreLowAutoButton.setMnemonic(KeyEvent.VK_R);
        scoreLowAutoButton.setActionCommand("Score Low");

        ButtonGroup group = new ButtonGroup();
        group.add(nothingAutoButton);
        group.add(driveAutoButton);
        group.add(crossAutoButton);
        group.add(scoreHighAutoButton);
        group.add(scoreLowAutoButton);


        JButton pitButton = new JButton("Pits");
        pitButton.addActionListener(this);

        JButton standButton = new JButton("Stands");
        standButton.addActionListener(this);

        //JButton nothingAutoButton = new JButton("Nothing");
        //standButton.addActionListener(this)

        //JButton driveAutoButton = new JButton("Drive");
        //standButton.addActionListener(this);

        //JButton crossAutoButton = new JButton("Cross");
        //standButton.addActionListener(this);

        //JButton scoreHighAutoButton = new JButton("Shoot High");
        //standButton.addActionListener(this);

        //JButton scoreLowAutoButton = new JButton("Score Low");
        //standButton.addActionListener(this);

        JButton portcullisButton = new JButton("Portcullis");
        standButton.addActionListener(this);

        JButton cdfButton = new JButton("Cheval De Frise");
        standButton.addActionListener(this);

        JButton moatButton = new JButton("Moat");
        standButton.addActionListener(this);

        JButton drawBridgeButton = new JButton("Drawbridge");
        standButton.addActionListener(this);

        JButton roughTerrainButton = new JButton("Rough Terrain");
        standButton.addActionListener(this);

        JButton rockWallButton = new JButton("Rock Wall");
        standButton.addActionListener(this);

        JButton lowBarButton = new JButton("Low Bar");
        standButton.addActionListener(this);

        JButton scaleButton = new JButton("Scale");
        standButton.addActionListener(this);

        JButton increaseButton = new JButton("+");
        standButton.addActionListener(this);

        JButton decreaseButton = new JButton("-");
        standButton.addActionListener(this);

        //JLabel labels[] = new JLabel[];

        originPanel.add(studentNameField);
        originPanel.add(pitButton);
        originPanel.add(standButton);

      //  pitPanel.add(teamNameField);
      //  pitPanel.add(teamNumberField);
        pitPanel.add(nothingAutoButton);
        pitPanel.add(driveAutoButton);
        pitPanel.add(crossAutoButton);
        pitPanel.add(scoreHighAutoButton);
        pitPanel.add(scoreLowAutoButton);
        pitPanel.add(portcullisButton);
        pitPanel.add(cdfButton);
        pitPanel.add(moatButton);
        pitPanel.add(drawBridgeButton);
        pitPanel.add(roughTerrainButton);
        pitPanel.add(rockWallButton);
        pitPanel.add(lowBarButton);
        pitPanel.add(scaleButton);

        add(originPanel);

        pitPanel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 0.5;
        gc.weighty = 0.5;


        gc.gridx = 0;
        gc.gridy = 0;
        pitPanel.add(teamNameField);

        gc.gridx = 1;
        pitPanel.add(teamNumberField);

        gc.gridx = 0;
        gc.gridy = 1;
        //add()


    }

    public void actionPerformed(ActionEvent e) {
      final JButton source = (JButton)e.getSource();
      //if (source.equals(pitButton || standButton)){

        for (Component component : getComponents())
            if (originPanel == component) {
                remove(originPanel);
                add(pitPanel);

              }
            else {
                remove(originPanel);
                add(standPanel);
            }
      //}
      //else if(source.){

      //}
        repaint();
        revalidate();
      }



    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Voltage Scouter 386 - 2015 Edition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setLayout(null);

        JComponent newContentPane = new MainFrame();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
      }
      public static void main(String[] args) {

          javax.swing.SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  createAndShowGUI();
                }
          });
    }
  }
