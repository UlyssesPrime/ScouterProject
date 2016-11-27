import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//testing grounds for a generic frame
//learning Swing and such
public class MainFrame extends JFrame {
  public MainFrame(String title){
    super(title);

    setLayout(null);
    //final JTextArea textArea = new JTextArea();
    //textArea.setBounds(200, 200, 100, 100);
    final JButton pit = new JButton("Pit Entry");
    pit.setBounds(90, 90, 75, 75);
    final JButton stands = new JButton("Stand Entry");
    stands.setBounds(180, 90, 135, 75);

    Container contentPane = getContentPane();
    contentPane.add(pit);
    contentPane.add(stands);

    JPanel pitPanel = new JPanel();

    //JLabel label = new JLabel(/*add something here*/);
    //frame.getContentPane().add(label);

    pit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){

      }
    });
  }
}
