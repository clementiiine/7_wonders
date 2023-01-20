package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rhodes {
    public Rhodes() {
        JFrame RhodesFrame = new JFrame();
        RhodesFrame.setTitle("Rhodes");

        ImageIcon Rhodesbackground = new ImageIcon("C:\\Users\\zhouz\\Desktop\\7 wonders\\src\\images\\文明背景\\Rhodes.png");
        JLabel RhodesLabel = new JLabel(Rhodesbackground);
        RhodesLabel.setSize(Rhodesbackground.getIconWidth(),Rhodesbackground.getIconHeight());
        RhodesFrame.getLayeredPane().add(RhodesLabel,new Integer(Integer.MIN_VALUE));
        JPanel RhodesPanel = (JPanel)RhodesFrame.getContentPane();
        RhodesPanel.setOpaque(false);     //transparence
        RhodesLabel.setLayout(null);

        //Paramètre d'écran
        RhodesFrame.setSize(Rhodesbackground.getIconWidth(),Rhodesbackground.getIconHeight());;
        RhodesFrame.setLocationRelativeTo(null);
        RhodesFrame.setVisible(true);          
    }
}
