package Players;


public class Players {
    private String numberofPlayer;
    private String name;
    private String wonder;

    public Players(String numberofPlayer, String name, String wonder){
        this.numberofPlayer = numberofPlayer;
        this.name = name;
        this.wonder = wonder;
    }

    public String getNumberofPlayer(){
        return numberofPlayer;
    }

    public String getName(){
        return name;
    }

    public String getWonder(){
        return wonder;
    }

}
