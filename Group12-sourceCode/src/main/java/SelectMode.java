import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class SelectMode extends GameEngine{
    public static int Mode = 0;

    Image background = loadImage("picture/background.png"); //游戏的logo，在左上角
    Image start_icon = loadImage("picture/single1.png");

    Image help_icon = loadImage("picture/single2.png");

    Image exit_icon = loadImage("picture/double.png");
    Image bgm1_icon = loadImage("picture/BGM_1.png");
    Image bgm2_icon = loadImage("picture/BGM_2.png");
    Image sound1_icon = loadImage("picture/Sound_1.png");
    Image sound2_icon = loadImage("picture/Sound_2.png");
    Image back  = loadImage("picture/back.png");
    boolean bgm;
    boolean sound;
    //用来协调音量的神奇数字count家族，我真的谢谢他们，不然我就死了
    double count;
    double count1;
    //用来开easy
    double easy;
    //用来开hard
    double hard;
    //用来开double
    double double1;
    AudioClip backgroundMusic;
    AudioClip soundMusic;

    public SelectMode(){

    }

    @Override
    public void paintComponent(Graphics graphics) {

    }

    public void init(){
        Mode = 0;
        bgm = true;
        count = 0;
        count1 = 0;
        easy = 0;
        hard = 0;
        double1 = 0;
        sound = true;
        //不能加setupWindow啊，是大坑，让所有东西都*2了
        backgroundMusic = loadAudio("src/Taps_bgm.wav");
        soundMusic = loadAudio("src/button.wav");
        startAudioLoop(backgroundMusic);
    }

    public void drawStart(){
        drawImage(background,0,0,992,778);
        drawImage(start_icon,320,410,370,65);
        drawImage(help_icon,320,510,370,65);
        drawImage(exit_icon,320,610,370,65);
        drawImage(back,10,10,60,60);

        if(bgm){
            drawImage(bgm1_icon,900,690,100,100);
        }
        if(sound){
            drawImage(sound1_icon,830,690,100,100);
        }
        if(!bgm){
            drawImage(bgm2_icon,900,690,100,100);
        }
        if(!sound){
            drawImage(sound2_icon,830,690,100,100);
        }
    }

    @Override
    public void update(double dt) {


    }

    @Override
    public void paintComponent() {
        drawStart();

    }

    public void mouseClicked(MouseEvent event) {
        if(event.getX() >= 320 && event.getX() <= 690 && event.getY() >= 410 && event.getY() <= 475 ){
            Mode = 1;
                createGame(new Easy_bg());
                mFrame.setVisible(false);
                stopAudioLoop(backgroundMusic);
            if(sound){
                playAudio(soundMusic);
            }

        }
        if(event.getX() >= 320 && event.getX() <= 690 && event.getY() >= 510 && event.getY() <= 575){
                //在此添加新的类
            Mode = 2;
            createGame(new Hard());
            mFrame.setVisible(false);
            stopAudioLoop(backgroundMusic);

            if(sound){
                playAudio(soundMusic);
            }
            mFrame.setVisible(false);

        }
        if(event.getX() >= 320 && event.getX() <= 690 && event.getY() >= 610 && event.getY() <= 675){
            //在此添加新的类
            Mode = 3;
            createGame(new Double());
            mFrame.setVisible(false);
            stopAudioLoop(backgroundMusic);
            if(sound){
                playAudio(soundMusic);
            }
            mFrame.setVisible(false);

        }
        if(event.getX() >= 900 && event.getX() <= 1000 && event.getY() >= 690 && event.getY() <= 790){
            count++;
            if(count%2 !=0 ){
                bgm = false;
                stopAudioLoop(backgroundMusic);
            }
            if(count%2 ==0){
                bgm = true;
                startAudioLoop(backgroundMusic);
            }
        }
        if(event.getX() >= 830 && event.getX() <= 930 && event.getY() >= 690 && event.getY() <= 790){
            count1++;
            if(count1%2 !=0 ){
                sound = false;
            }
            if(count1%2 ==0){
                sound= true;
            }
        }
        if(event.getX() >= 10 && event.getX() <= 70 && event.getY() >= 10 && event.getY() <= 70){
            stopAudioLoop(backgroundMusic);
            createGame(new GameFrame());
            mFrame.setVisible(false);

        }
    }
}
