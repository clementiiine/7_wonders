package Wonders;

import Players.Players;

public class Wonder {
    String wondername;        //noms des merveilles
    //cinq étapes
    String stage1;
    String stage2;
    String stage3;
    String stage4;
    String stage5;
    //définir le maitre du jeu
    Players owner;

    public Wonder(String wondername,String stage1,String stage2,String stage3,String stage4,String stage5,Players owner){
        this.wondername = wondername;
        this.stage1 = stage1;
        this.stage2 = stage2;
        this.stage3 = stage3;
        this.stage4 = stage4;
        this.stage5 = stage5;
        this.owner = owner;
    }

    public String getWonderName(){
        return wondername;
    }

    public String getStage1(){
        return stage1;
    }

    public String getStage2(){
        return stage2;
    }

    public String getStage3(){
        return stage3;
    }

    public String getStage4(){
        return stage4;
    }

    public String getStage5(){
        return stage5;
    }

    public Players getOwner(){
        return owner;
    }
}
