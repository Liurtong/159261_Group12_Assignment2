import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class GameFrame extends GameEngine{
    Image background = loadImage("picture/background.png"); //游戏的logo，在左上角
    Image start_icon = loadImage("picture/start.png");

    Image help_icon = loadImage("picture/help.png");

    Image exit_icon = loadImage("picture/exit.png");
    Image bgm1_icon = loadImage("picture/BGM_1.png");
    Image bgm2_icon = loadImage("picture/BGM_2.png");
    Image sound1_icon = loadImage("picture/Sound_1.png");
    Image sound2_icon = loadImage("picture/Sound_2.png");

    boolean bgm;
    boolean sound;
    //用来协调音量的神奇数字count家族，我真的谢谢他们，不然我就死了
    double count;
    double count1;
    AudioClip backgroundMusic;
    AudioClip soundMusic;

    public GameFrame(){
    }

    @Override
    public void paintComponent(Graphics graphics) {
    }

    public void init(){
        bgm = true;
        count = 0;
        count1 = 0;
        sound = true;
        backgroundMusic = loadAudio("src/Taps_bgm.wav");
        soundMusic = loadAudio("src/button.wav");
        startAudioLoop(backgroundMusic);
    }

    public void drawStart(){
        drawImage(background,0,0,992,778);
        drawImage(start_icon,320,410,370,65);
        drawImage(help_icon,320,510,370,65);
        drawImage(exit_icon,320,610,370,65);

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
                createGame(new SelectMode());
                mFrame.setVisible(false);
                stopAudioLoop(backgroundMusic);

            if(sound){
                playAudio(soundMusic);
            }

        }
        if(event.getX() >= 320 && event.getX() <= 690 && event.getY() >= 510 && event.getY() <= 575){
            createGame(new Help());
            //stopAudioLoop(backgroundMusic);
            if(sound){
                playAudio(soundMusic);
            }

        }
        if(event.getX() >= 320 && event.getX() <= 690 && event.getY() >= 610 && event.getY() <= 675){
            if(sound){
                playAudio(soundMusic);
            }
            System.exit(0);
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
    }
}
