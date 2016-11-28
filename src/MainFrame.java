import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JPanel implements ActionListener {

    JPanel originPanel = new JPanel();
    JPanel pitPanel = new JPanel();
    JPanel standPanel = new JPanel();

    public MainFrame() {
        super(new BorderLayout());

        JButton pitButton = new JButton("Pits");
        pitButton.addActionListener(this);

        JButton standButton = new JButton("Stands");
        standButton.addActionListener(this);

        originPanel.add(pitButton);
        originPanel.add(standButton);

        add(originPanel);
    }

      /** Listens to the buttons and performs the swap. */
    public void actionPerformed(ActionEvent e) {

      for (Component component : getComponents())
            if (originPanel == component) {
                remove(originPanel);
                add(pitPanel);
              }
            else {
                remove(originPanel);
                add(standPanel);
            }

        repaint();
        revalidate();
      }

      /**
       * Create the GUI and show it. For thread safety, this method should be
       * invoked from the event-dispatching thread.
       */
    private static void createAndShowGUI() {
          // Create and set up the window.
        JFrame frame = new JFrame("Voltage Scouter 386 - 2015 Edition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setLayout(null);

          // Create and set up the content pane.
        JComponent newContentPane = new MainFrame();
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);

          // Display the window.
        frame.pack();
        frame.setVisible(true);
      }
      public static void main(String[] args) {
          // Schedule a job for the event-dispatching thread:
          // creating and showing this application's GUI.
          javax.swing.SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  createAndShowGUI();
                }
          });
    }
}
