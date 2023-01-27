package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Halicarnassus {
    public Halicarnassus() {
        JFrame HalicarnassusFrame = new JFrame();
        HalicarnassusFrame.setTitle("Halicarnassus");

        ImageIcon Halicarnassusbackground = new ImageIcon("src/images/wonderIntroduction/Halicarnassus.png");
        JLabel HalicarnassusLabel = new JLabel(Halicarnassusbackground);
        HalicarnassusLabel.setSize(Halicarnassusbackground.getIconWidth(),Halicarnassusbackground.getIconHeight());
        HalicarnassusFrame.getLayeredPane().add(HalicarnassusLabel,new Integer(Integer.MIN_VALUE));
        JPanel HalicarnassusPanel = (JPanel)HalicarnassusFrame.getContentPane();
        HalicarnassusPanel.setOpaque(false);     //transparence
        HalicarnassusLabel.setLayout(null);

        //Paramètres de l'écran
        HalicarnassusFrame.setSize(Halicarnassusbackground.getIconWidth(),Halicarnassusbackground.getIconHeight());;
        HalicarnassusFrame.setLocationRelativeTo(null);
        HalicarnassusFrame.setVisible(true);        
    }
}
