package EffectOfScience;

import javax.swing.ImageIcon;

public class effectofscience {
    private String name;
    private ImageIcon effectofsciencImage;
    private ImageIcon effectofsciencbackImage = new ImageIcon("src/images/EffectOfScience/Back.png");    //Dos de la effectofscience
    private int EffectOfScienceWidth = 120;
    private int EffectOfScienceHeight = 100;

    public effectofscience(String name,ImageIcon effectofscienceImageIcon_choose){
        this.name = name;
        this.effectofsciencImage = effectofscienceImageIcon_choose;
    }

    public ImageIcon getEffectOfScienceImage(){
        return effectofsciencImage;
    }

    public ImageIcon getEffectOfSciencebackImage(){
        return effectofsciencbackImage;
    }

    public String getName(){
        return name;
    }


    public int getEffectOfScienceWidth(){
        return EffectOfScienceWidth;
    }

    public int getEffectOfScienceHeight(){
        return EffectOfScienceHeight;
    }

}
