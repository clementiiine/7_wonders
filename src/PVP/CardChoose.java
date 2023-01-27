package PVP;

import CardAndDeck.Card;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CardChoose {
    List<Card> cardchooseList;

    CardChoose(List<Card> cardchooseList){
        this.cardchooseList = cardchooseList;

        JFrame cardchooseFrame = new JFrame();
        cardchooseFrame.setTitle("Card Choose");
        JPanel jPanel = new JPanel();
        //Change Cardlist to the Stringlist
        List<String> CardChooseList_String = new ArrayList<>();
        for(int i = 0; i<cardchooseList.size();i++){
            CardChooseList_String.add(cardchooseList.get(i).getName());
        }
        String[] showCardStrings = CardChooseList_String.toArray(new String[CardChooseList_String.size()]);
        ListModel<String> jListModel = new DefaultComboBoxModel<>(showCardStrings);
        JList<String> cardJList = new JList<>();
        cardJList.setModel(jListModel);

        jPanel.add(cardJList);
        cardchooseFrame.add(jPanel);

        cardchooseFrame.setSize(500,500);
        cardchooseFrame.setLocationRelativeTo(null);
        cardchooseFrame.setVisible(true);
    }
}
