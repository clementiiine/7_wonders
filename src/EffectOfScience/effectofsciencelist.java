package EffectOfScience;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class effectofsciencelist {
    List<effectofscience> AllEffectOfScience = new ArrayList<>();

    public effectofsciencelist(){

        effectofscience Architecture = new effectofscience("Architecture",new ImageIcon("src/images/EffectOfScience/Architecture.png"));
        effectofscience Crafts = new effectofscience("Crafts",new ImageIcon("src/images/EffectOfScience/Crafts.png"));
        effectofscience Culture = new effectofscience("Culture",new ImageIcon("src/images/EffectOfScience/Culture.png"));
        effectofscience Decor = new effectofscience("Decor",new ImageIcon("src/images/EffectOfScience/Decor.png"));
        effectofscience Economy = new effectofscience("Economy",new ImageIcon("src/images/EffectOfScience/Economy.png"));
        effectofscience Education = new effectofscience("Education",new ImageIcon("src/images/EffectOfScience/Education.png"));
        effectofscience Engineering = new effectofscience("Engineering",new ImageIcon("src/images/EffectOfScience/Engineering.png"));
        effectofscience Jewellery = new effectofscience("Jewellery",new ImageIcon("src/images/EffectOfScience/Jewellery.png"));
        effectofscience Politics = new effectofscience("Politics",new ImageIcon("src/images/EffectOfScience/Politics.png"));
        effectofscience Propaganda = new effectofscience("Propaganda",new ImageIcon("src/images/EffectOfScience/Propaganda.png"));
        effectofscience Science = new effectofscience("Science",new ImageIcon("src/images/EffectOfScience/Science.png"));
        effectofscience Strategy = new effectofscience("Strategy",new ImageIcon("src/images/EffectOfScience/Strategy.png"));
        effectofscience Tactics = new effectofscience("Tactics",new ImageIcon("src/images/EffectOfScience/Tactics.png"));
        effectofscience Urbanism = new effectofscience("Urbanism",new ImageIcon("src/images/EffectOfScience/Urbanism.png"));

        AllEffectOfScience.add(Architecture);
        AllEffectOfScience.add(Crafts);
        AllEffectOfScience.add(Culture);
        AllEffectOfScience.add(Decor);
        AllEffectOfScience.add(Economy);
        AllEffectOfScience.add(Education);
        AllEffectOfScience.add(Engineering);
        AllEffectOfScience.add(Jewellery);
        AllEffectOfScience.add(Politics);
        AllEffectOfScience.add(Propaganda);
        AllEffectOfScience.add(Science);
        AllEffectOfScience.add(Strategy);
        AllEffectOfScience.add(Tactics);
        AllEffectOfScience.add(Urbanism);
    }

    public List<effectofscience> getAllEffectOfScienceList(){
        return AllEffectOfScience;
    }
}
