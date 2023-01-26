package Wonders;


import javax.swing.ImageIcon;

public class Wonder{
    String WonderName ;      //文明名字
    ImageIcon Stage1Icon;
    ImageIcon Stage2Icon;
    ImageIcon Stage3Icon;
    ImageIcon Stage4Icon;
    ImageIcon Stage5Icon;
    Boolean Stage2Pass = false;
    Boolean Stage3Pass = false;
    Boolean Stage4Pass = false;
    Boolean Win = false;

    public Wonder(String wondername,String stage1,String stage2,String stage3,String stage4,String stage5){
        this.WonderName = wondername;
        this.Stage1Icon = new ImageIcon(stage1);
        this.Stage2Icon = new ImageIcon(stage2);
        this.Stage3Icon = new ImageIcon(stage3);
        this.Stage4Icon = new ImageIcon(stage4);
        this.Stage5Icon = new ImageIcon(stage5);

    }

    public String getWonderName(){
        return WonderName;
    } 

    public ImageIcon getStage1Icon(){
        return Stage1Icon;
    }

    public ImageIcon getStage2Icon(){
        return Stage2Icon;
    }

    public ImageIcon getStage3Icon(){
        return Stage3Icon;
    }

    public ImageIcon getStage4Icon(){
        return Stage4Icon;
    }

    public ImageIcon getStage5Icon(){
        return Stage5Icon;
    }

    public void PassStage2(){
        Stage2Pass = true;
    }

    public void PassStage3(){
        Stage3Pass = true;
    }

    public void PassStage4(){
        Stage4Pass = true;
    }

    public void PlayerWin(){
        Win = true;
    }
}
