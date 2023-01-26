package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Olympia {
    public Olympia(){
        JFrame OlympiaFrame = new JFrame();
        OlympiaFrame.setTitle("Olympia");

        ImageIcon Olympiabackground = new ImageIcon("src/images/fond_des_merveilles/Olympia.png");
        JLabel OlympiaLabel = new JLabel(Olympiabackground);
        OlympiaLabel.setSize(Olympiabackground.getIconWidth(),Olympiabackground.getIconHeight());
        OlympiaFrame.getLayeredPane().add(OlympiaLabel,new Integer(Integer.MIN_VALUE));
        JPanel OlympiaPanel = (JPanel)OlympiaFrame.getContentPane();
        OlympiaPanel.setOpaque(false);     //transparence
        OlympiaLabel.setLayout(null);

        //Paramètres de l'écran
        OlympiaFrame.setSize(Olympiabackground.getIconWidth(),Olympiabackground.getIconHeight());
        OlympiaFrame.setLocationRelativeTo(null);
        OlympiaFrame.setVisible(true);        
    }
}
