import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Win extends GameEngine{
    Image background = loadImage("picture/win.jpg");

    AudioClip backgroundMusic;

    @Override
    public void paintComponent(Graphics graphics) {
    }

    public void init(){
        backgroundMusic = loadAudio("src/win_short.wav");
        playAudio(backgroundMusic);
    }

    public void drawStart(){
        drawImage(background,0,0,992,778);
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void paintComponent() {
        drawStart();

    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_E) {
            System.exit(0);
        }

    }

}
