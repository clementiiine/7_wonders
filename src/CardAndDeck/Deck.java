package CardAndDeck;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Deck {
        List<Card> AllCardList = new ArrayList<>();
        //List<ImageIcon> CardListIcon = new ArrayList<ImageIcon>();
        
        public Deck(){
            //création d'une pioche de cartes
            //ressources
            Card BRICK = new Card("Brick","resources", new ImageIcon("src/images/cards/resources/BRICK.png"));
            Card GLASS = new Card("Glass","resources", new ImageIcon("src/images/cards/resources/GLASS.png"));
            Card GOLD = new Card("Gold","resources", new ImageIcon("src/images/cards/resources/GOLD.png"));
            Card PAPER = new Card("Paper","resources", new ImageIcon("src/images/cards/resources/PAPER.png"));
            Card STONE = new Card("Stone","resources", new ImageIcon("src/images/cards/resources/STONE.png"));
            Card WOOD = new Card("Wood","resources", new ImageIcon("src/images/cards/resources/WOOD.png"));
            //science
            Card PLOT = new Card("Plot","science", new ImageIcon("src/images/cards/science/PLOT.png"));
            Card SLATE = new Card("Slate","science", new ImageIcon("src/images/cards/science/SLATE.png"));
            Card WHEEL = new Card("Wheel","science", new ImageIcon("src/images/cards/science/WHEEL.png"));
            //score
            Card TWOPOINTSANDCAT  = new Card("TwoPointsAndCat","score", new ImageIcon("src/images/cards/score/2 points + pièces d'échecs du chat.png"));
            Card THREEPOINTS = new Card("ThreePoints","score", new ImageIcon("src/images/cards/score/3points.png"));
            //war
            Card WAR = new Card("War","war", new ImageIcon("src/images/cards/war/War score.png"));
            Card WAR1 = new Card("War1","war", new ImageIcon("src/images/cards/war/War score + 1 horn.png"));
            Card WAR2 = new Card("War2","war", new ImageIcon("src/images/cards/war/War score + 2 horns.png"));
            
            for(int i = 0; i<27;i++){
                AllCardList.add(GOLD);
            }
            for (int i = 0;i<17;i++){
                AllCardList.add(BRICK);
                AllCardList.add(GLASS);
                AllCardList.add(PAPER);
                AllCardList.add(STONE);
                AllCardList.add(WOOD);
            }
            for (int i =0;i<14;i++){
                AllCardList.add(PLOT);
                AllCardList.add(SLATE);
                AllCardList.add(WHEEL);
            }
            for(int i = 0;i<16;i++){
                AllCardList.add(THREEPOINTS);
            }
            for (int i = 0;i<24;i++){
                AllCardList.add(TWOPOINTSANDCAT);
            }
            for (int i = 0;i<18;i++){
                AllCardList.add(WAR);
            }
            for (int i = 0;i<15;i++){
                AllCardList.add(WAR1);
            }
            for(int i = 0;i<8;i++){
                AllCardList.add(WAR2);
            }

            //for(int i = 0;i<AllCardList.size();i++){
                //ImageIcon cardIcon = AllCardList.get(i).getCardImage();

            //}
        }



        public List<Card> getAllCardList(){
            return AllCardList;
        }
}
