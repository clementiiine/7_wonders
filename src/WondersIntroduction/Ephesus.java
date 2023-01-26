package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ephesus {
    public Ephesus() {
        JFrame EphesusFrame = new JFrame();
        EphesusFrame.setTitle("Ephesus");

        ImageIcon Ephesusbackground = new ImageIcon("src/images/fond_des_merveilles/Ephesus.png");
        JLabel EphesusLabel = new JLabel(Ephesusbackground);
        EphesusLabel.setSize(Ephesusbackground.getIconWidth(),Ephesusbackground.getIconHeight());
        EphesusFrame.getLayeredPane().add(EphesusLabel,new Integer(Integer.MIN_VALUE));
        JPanel EphesusPanel = (JPanel)EphesusFrame.getContentPane();
        EphesusPanel.setOpaque(false);     //transparence du panel
        EphesusLabel.setLayout(null);

        //Paramètres de l'écran
        EphesusFrame.setSize(Ephesusbackground.getIconWidth(),Ephesusbackground.getIconHeight());;
        EphesusFrame.setLocationRelativeTo(null);
        EphesusFrame.setVisible(true);        
    }
}
