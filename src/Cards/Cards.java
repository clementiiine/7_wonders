package Cards;

import javax.swing.ImageIcon;

public class Cards {
    private String name;    //nome de la carte
    private ImageIcon cardImage;
    private ImageIcon cardbackImage = new ImageIcon("src/images/cards/卡牌背面/卡背.png");    //image de la carte
    private int point;
    private String caregory;    //categorie de la carte
    private int cardWidth = 223;
    private int cardHeight = 302;

    public Cards(String name, ImageIcon cardImage){
        this.name = name;
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
