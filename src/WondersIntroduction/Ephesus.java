package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ephesus {
    public Ephesus() {
        JFrame EphesusFrame = new JFrame();
        EphesusFrame.setTitle("Ephesus");

        ImageIcon Ephesusbackground = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\文明背景\\Ephesus.png");
        JLabel EphesusLabel = new JLabel(Ephesusbackground);
        EphesusLabel.setSize(Ephesusbackground.getIconWidth(),Ephesusbackground.getIconHeight());
        EphesusFrame.getLayeredPane().add(EphesusLabel,new Integer(Integer.MIN_VALUE));
        JPanel EphesusPanel = (JPanel)EphesusFrame.getContentPane();
        EphesusPanel.setOpaque(false);     //不透明
        EphesusLabel.setLayout(null);

        //Paramètres d’écran
        EphesusFrame.setSize(Ephesusbackground.getIconWidth(),Ephesusbackground.getIconHeight());;
        EphesusFrame.setLocationRelativeTo(null);
        EphesusFrame.setVisible(true);        
    }
}
