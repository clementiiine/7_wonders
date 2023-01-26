package WondersIntroduction;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Giza {
    public Giza() {
        JFrame GizaFrame = new JFrame();
        GizaFrame.setTitle("Giza");

        ImageIcon Gizabackground = new ImageIcon("src/images/fond_des_merveilles/Giza.png");
        JLabel GizaLabel = new JLabel(Gizabackground);
        GizaLabel.setSize(Gizabackground.getIconWidth(),Gizabackground.getIconHeight());
        GizaFrame.getLayeredPane().add(GizaLabel,new Integer(Integer.MIN_VALUE));
        JPanel GizaPanel = (JPanel)GizaFrame.getContentPane();
        GizaPanel.setOpaque(false);     //transparence
        GizaLabel.setLayout(null);

        //Paramètres de l'écran
        GizaFrame.setSize(Gizabackground.getIconWidth(),Gizabackground.getIconHeight());;
        GizaFrame.setLocationRelativeTo(null);
        GizaFrame.setVisible(true);        
    }
}
