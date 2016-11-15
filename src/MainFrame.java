import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
  public MainFrame(String title){
    super(title);

    setLayout(new BorderLayout());
    final JTextArea textArea = new JTextArea();
    JButton button = new JButton("CLICK ME");

    Container contentPane = getContentPane();
    contentPane.add(button, BorderLayout.SOUTH);
    contentPane.add(textArea, BorderLayout.CENTER);

    //JLabel label = new JLabel(/*add something here*/);
    //frame.getContentPane().add(label);

    button.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        textArea.append("KYS fgt\n");
      }
    });
  }
}
