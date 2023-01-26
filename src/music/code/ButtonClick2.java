package music.code;

import java.io.FileInputStream;
import sun.audio.*;

public class ButtonClick2 {
    public void playMusic()
{
	try {
		FileInputStream fileau=new FileInputStream("src/music/按钮音效/mouseClick2.wav" );
		AudioStream as=new AudioStream(fileau);
		AudioPlayer.player.start(as);
	}catch (Exception e){
		e.printStackTrace();
	}
}
}
