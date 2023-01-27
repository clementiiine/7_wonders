package CardAndDeck;

import javax.swing.ImageIcon;

public class Card {
    private String name;    //Noms des cartes
    private ImageIcon cardImage;
    private ImageIcon cardbackImage = new ImageIcon("src/images/cards/CardBack/cardBack.png");    //de de la carte
    private int point;
    private String caregory;    //Catégorie
    private int cardWidth = 223;
    private int cardHeight = 302;

    public Card(String name,String caregory, ImageIcon cardImage){
        this.name = name;
        this.caregory = caregory;
        this.cardImage = cardImage;
    }

    public ImageIcon getCardImage(){
        return cardImage;
    }

    public int getPoint(){
        return point;
    }

    public ImageIcon getCardbackImage(){
        return cardbackImage;
    }

    public String getName(){
        return name;
    }
    
    public String getCaregory(){
        return caregory;
    }

    public int getCardWidth(){
        return cardWidth;
    }

    public int getCardHeight(){
        return cardHeight;
    }

    public void jugemenycard(String nameofcard){
        if (nameofcard == name){
            getCardImage();
        }
    }
}
