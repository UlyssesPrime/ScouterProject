import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //JFrame frame = new JFrame("Scouter");
                MainFrame frame = new MainFrame("Scouter");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setLayout(null);
            }
        });
    }
}
