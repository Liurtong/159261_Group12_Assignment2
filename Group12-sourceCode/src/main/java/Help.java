import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Help extends GameEngine{

    Image background = loadImage("picture/help.jpg");
    boolean bgm;
    boolean sound;
    //用来协调音量的神奇数字count家族，我真的谢谢他们，不然我就死了
    double count;
    double count1;

    AudioClip backgroundMusic;


    @Override
    public void paintComponent(Graphics graphics) {

    }

    public void init(){
        bgm = true;
        count = 0;
        count1 = 0;
        sound = true;
        //不能加setupWindow啊，是大坑，让所有东西都*2了
        backgroundMusic = loadAudio("src/Taps_bgm.wav");
        //startAudioLoop(backgroundMusic);
    }

    public void drawStart(){
        drawImage(background,0,0,992,778);
    }

    @Override
    public void update(double dt) {
        //mFrame.dispose();
        mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //stopAudioLoop(backgroundMusic);
    }

    @Override
    public void paintComponent() {
        drawStart();
    }

}



