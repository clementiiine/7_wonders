package PVP;

import CardAndDeck.Card;
import Wonders.Wonder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Playersview {
    int number_of_player;
    Wonder wonder;
    JPanel centerCard;
    JPanel leftCard;
    JPanel rightCard;
    List<Card> cardChooseList;
    List<Card> resources = new ArrayList<>();
    List<Card> science = new ArrayList<>();
    List<Card> score = new ArrayList<>();
    List<Card> war = new ArrayList<>();
    //ArrayList<String> resource;

    public Playersview(int number_of_player, Wonder wonder,JPanel centerCard,  JPanel leftCard, JPanel rightCard, List<Card> CardChooseList){
        this.number_of_player = number_of_player;
        this.wonder = wonder;
        this.leftCard = leftCard;
        this.rightCard = rightCard;
        this.centerCard = centerCard;
        this.cardChooseList = CardChooseList;
    }

    public void setWonderName(Wonder wondername){
        wonder = wondername;
    }

    public Wonder getwonder(){
        return wonder;
    }

    public JPanel getCenterPanel(){
        return centerCard;
    }

    public List<Card> getCardChooseList(){
        return cardChooseList;
    }

    public JPanel getLeftPanel(){
        return leftCard;
    }

    public JPanel getRightPanel(){
        return rightCard;
    }

    public List<Card> getResourcesList(){
        return resources;
    }

    public List<Card> getScienceList(){
        return science;
    }

    public List<Card> getScoreList(){
        return score;
    }

    public List<Card> getWarList(){
        return war;
    }

    public void addResources(Card cards){
        resources.add(cards);
    }

    public void addScience(Card cards){
        science.add(cards);
    }

    public void addScore(Card cards){
        score.add(cards);
    }

    public void addWar(Card cards){
        war.add(cards);
    }
}
