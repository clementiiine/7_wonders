package Wonders;

import java.util.ArrayList;
import java.util.List;

public class AllWonder {
    List<Wonder> allWonder = new ArrayList<>();

    public AllWonder(){
        Wonder Alexandria = new Wonder("Alexandria", "src/images/wonders/Alexandria/1.png", "src/images/wonders/Alexandria/2.png", "src/images/wonders/Alexandria/3.png", "src/images/wonders/Alexandria/4.png", "src/images/wonders/Alexandria/5.png");
        Wonder Babylon = new Wonder("Babylon", "src/images/wonders/Babylon/1.png", "src/images/wonders/Babylon/2.png", "src/images/wonders/Babylon/3.png", "src/images/wonders/Babylon/4.png", "src/images/wonders/Babylon/5.png");
        Wonder Ephesus = new Wonder("Ephesus", "src/images/wonders/Ephesus/1.png", "src/images/wonders/Ephesus/2.png", "src/images/wonders/Ephesus/3.png", "src/images/wonders/Ephesus/4.png", "src/images/wonders/Ephesus/5.png");
        Wonder Giza = new Wonder("Giza", "src/images/wonders/Giza/1.png", "src/images/wonders/Giza/2.png", "src/images/wonders/Giza/3.png", "src/images/wonders/Giza/4.png", "src/images/wonders/Giza/5.png");
        Wonder Halicarnassus = new Wonder("Halicarnassus", "src/images/wonders/Halicarnassus/1.png", "src/images/wonders/Halicarnassus/2.png", "src/images/wonders/Halicarnassus/3.png", "src/images/wonders/Halicarnassus/4.png", "src/images/wonders/Halicarnassus/5.png");
        Wonder Olympia = new Wonder("Olympia", "src/images/wonders/Olympia/1.png", "src/images/wonders/Olympia/2.png", "src/images/wonders/Olympia/3.png", "src/images/wonders/Olympia/4.png", "src/images/wonders/Olympia/5.png");
        Wonder Rhodes = new Wonder("Rhodes", "src/images/wonders/Rhodes/1.png", "src/images/wonders/Rhodes/2.png", "src/images/wonders/Rhodes/3.png", "src/images/wonders/Rhodes/4.png", "src/images/wonders/Rhodes/5.png");

        allWonder.add(Alexandria);
        allWonder.add(Babylon);
        allWonder.add(Ephesus);
        allWonder.add(Giza);
        allWonder.add(Halicarnassus);
        allWonder.add(Olympia);
        allWonder.add(Rhodes);


    }

    public List<Wonder> GetAllWonder(){
        return allWonder;
    }
}
