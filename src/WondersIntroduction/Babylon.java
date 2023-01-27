package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Babylon {
    public Babylon() {
        JFrame BabylonFrame = new JFrame();
        BabylonFrame.setTitle("Babylon");

        ImageIcon Babbackgroud = new ImageIcon("src/images/wonderIntroduction/Babylon.png");
        JLabel BabLabel = new JLabel(Babbackgroud);
        BabLabel.setSize(Babbackgroud.getIconWidth(),Babbackgroud.getIconHeight());
        BabylonFrame.getLayeredPane().add(BabLabel,new Integer(Integer.MIN_VALUE));
        JPanel babPanel = (JPanel)BabylonFrame.getContentPane();
        babPanel.setOpaque(false);
        babPanel.setLayout(null);

        //Paramètres de l'écran
        BabylonFrame.setSize(Babbackgroud.getIconWidth(),Babbackgroud.getIconHeight());;
        BabylonFrame.setLocationRelativeTo(null);
        BabylonFrame.setVisible(true);
    }
}
