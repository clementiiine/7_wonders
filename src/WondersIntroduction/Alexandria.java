package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Alexandria {
    public Alexandria() {
        JFrame AlexandraFrame = new JFrame();
        AlexandraFrame.setTitle("Alexandra");

        ImageIcon Alexbackground = new ImageIcon("src/images/fond_des_merveilles/Alexandria.png");
        JLabel alexLabel = new JLabel(Alexbackground);
        alexLabel.setSize(Alexbackground.getIconWidth(),Alexbackground.getIconHeight());
        AlexandraFrame.getLayeredPane().add(alexLabel,new Integer(Integer.MIN_VALUE));
        JPanel alexPanel = (JPanel)AlexandraFrame.getContentPane();
        alexPanel.setOpaque(false); // transparence
        alexLabel.setLayout(null);

        //Paramètres de l'écran
        AlexandraFrame.setSize(Alexbackground.getIconWidth(),Alexbackground.getIconHeight());;
        AlexandraFrame.setLocationRelativeTo(null);
        AlexandraFrame.setVisible(true);
    }
}
