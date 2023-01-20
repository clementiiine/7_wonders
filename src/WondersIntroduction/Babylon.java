package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Babylon {
    public Babylon() {
        JFrame BabylonFrame = new JFrame();
        BabylonFrame.setTitle("Babylon");

        ImageIcon Babbackgroud = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\文明背景\\Babylon.png");
        JLabel BabLabel = new JLabel(Babbackgroud);
        BabLabel.setSize(Babbackgroud.getIconWidth(),Babbackgroud.getIconHeight());
        BabylonFrame.getLayeredPane().add(BabLabel,new Integer(Integer.MIN_VALUE));
        JPanel babPanel = (JPanel)BabylonFrame.getContentPane();
        babPanel.setOpaque(false);
        babPanel.setLayout(null);

        //Paramètres d’écran
        BabylonFrame.setSize(Babbackgroud.getIconWidth(),Babbackgroud.getIconHeight());;
        BabylonFrame.setLocationRelativeTo(null);
        BabylonFrame.setVisible(true);
    }
}
