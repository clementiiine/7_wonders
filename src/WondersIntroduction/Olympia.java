package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Olympia {
    public Olympia(){
        JFrame OlympiaFrame = new JFrame();
        OlympiaFrame.setTitle("Olympia");

        ImageIcon Olympiabackground = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\文明背景\\Olympia.png");
        JLabel OlympiaLabel = new JLabel(Olympiabackground);
        OlympiaLabel.setSize(Olympiabackground.getIconWidth(),Olympiabackground.getIconHeight());
        OlympiaFrame.getLayeredPane().add(OlympiaLabel,new Integer(Integer.MIN_VALUE));
        JPanel OlympiaPanel = (JPanel)OlympiaFrame.getContentPane();
        OlympiaPanel.setOpaque(false);     //transparence
        OlympiaLabel.setLayout(null);

        //Paramètre d'écran
        OlympiaFrame.setSize(Olympiabackground.getIconWidth(),Olympiabackground.getIconHeight());;
        OlympiaFrame.setLocationRelativeTo(null);
        OlympiaFrame.setVisible(true);        
    }
}
