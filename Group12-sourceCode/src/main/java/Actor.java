import java.awt.*;
import java.util.ArrayList;

public class Actor extends GameObject{
    //picture
    Image image = Toolkit.getDefaultToolkit().getImage("picture/right1.png");
    Image image1 = Toolkit.getDefaultToolkit().getImage("picture/right11.png");

    int speed = 5;
    Bullet bullet;
    Config config;
    boolean ActorL,ActorR,ActorU,ActorD;
    // attack
    public int atk = 100;

    public boolean pressedLeft, pressedUp, pressedRight, pressedDown;
    public boolean pressedA, pressedW, pressedD, pressedS;
    static ArrayList<Bullet> bullets = new ArrayList<>();



    public Actor(){}

    public Actor(int x, int y, int width, int height, Rectangle rectangle, Direction direction, Bullet bullet, Config config){
        super(x,y,width,height,rectangle,direction);
        this.speed = 6;
        this.bullet = bullet;
        this.config = config;
    }

    //update actor move
    public void downward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.frameaa >= 0 && Easy_bg.frameaa < 6){
                image = Easy_bg.Aaa1;
                Easy_bg.frameaa++;
            }
            if(Easy_bg.frameaa >= 6 && Easy_bg.frameaa < 12){
                image = Easy_bg.Aaa2;
                Easy_bg.frameaa++;
            }
            if(Easy_bg.frameaa >= 12 && Easy_bg.frameaa < 18){
                image = Easy_bg.Aaa3;
                Easy_bg.frameaa++;
            }
            if(Easy_bg.frameaa == 18){
                Easy_bg.frameaa = 0;
            }
        }
        if(SelectMode.Mode == 2){
            if(Hard.frameaa >= 0 && Hard.frameaa < 6){
                image = Hard.Aaa1;
                Hard.frameaa++;
            }
            if(Hard.frameaa >= 6 && Hard.frameaa < 12){
                image = Hard.Aaa2;
                Hard.frameaa++;
            }
            if(Hard.frameaa >= 12 && Hard.frameaa < 18){
                image = Hard.Aaa3;
                Hard.frameaa++;
            }
            if(Hard.frameaa == 18){
                Hard.frameaa = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameaa >= 0 && Double.frameaa < 6){
                image = Double.Aaa1;
                Double.frameaa++;
            }
            if(Double.frameaa >= 6 && Double.frameaa < 12){
                image = Double.Aaa2;
                Double.frameaa++;
            }
            if(Double.frameaa >= 12 && Double.frameaa < 18){
                image = Double.Aaa3;
                Double.frameaa++;
            }
            if(Double.frameaa == 18){
                Double.frameaa = 0;
            }
        }

    }

    public void upward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.framebb >= 0 && Easy_bg.framebb < 8){
                image = Easy_bg.Add1;
                Easy_bg.framebb++;
            }
            if(Easy_bg.framebb >= 8 && Easy_bg.framebb < 16){
                image = Easy_bg.Add2;
                Easy_bg.framebb++;
            }
            if(Easy_bg.framebb >= 16 && Easy_bg.framebb < 24){
                image = Easy_bg.Add3;
                Easy_bg.framebb++;
            }
            if(Easy_bg.framebb == 24){
                Easy_bg.framebb = 0;
            }
        }
        if(SelectMode.Mode == 2){
            if(Hard.framebb >= 0 && Hard.framebb < 8){
                image = Hard.Add1;
                Hard.framebb++;
            }
            if(Hard.framebb >= 8 && Hard.framebb < 16){
                image = Hard.Add2;
                Hard.framebb++;
            }
            if(Hard.framebb >= 16 && Hard.framebb < 24){
                image = Hard.Add3;
                Hard.framebb++;
            }
            if(Hard.framebb == 24){
                Hard.framebb = 0;
            }
        }
        if (SelectMode.Mode == 3){
            if(Double.framebb >= 0 && Double.framebb < 8){
                image = Double.Add1;
                Double.framebb++;
            }
            if(Double.framebb >= 8 && Double.framebb < 16){
                image = Double.Add2;
                Double.framebb++;
            }
            if(Double.framebb >= 16 && Double.framebb < 24){
                image = Double.Add3;
                Double.framebb++;
            }
            if(Double.framebb == 24){
                Double.framebb = 0;
            }
        }

    }

    public void leftward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.framecc >= 0 && Easy_bg.framecc < 8){
                image = Easy_bg.Abb1;
                Easy_bg.framecc++;
            }
            if(Easy_bg.framecc >= 8 && Easy_bg.framecc < 16){
                image = Easy_bg.Abb2;
                Easy_bg.framecc++;
            }
            if(Easy_bg.framecc >= 16 && Easy_bg.framecc < 24){
                image = Easy_bg.Abb3;
                Easy_bg.framecc++;
            }
            if(Easy_bg.framecc == 24){
                Easy_bg.framecc = 0;
            }
        }
        if(SelectMode.Mode == 2){
            if(Hard.framecc >= 0 && Hard.framecc < 8){
                image = Hard.Abb1;
                Hard.framecc++;
            }
            if(Hard.framecc >= 8 && Hard.framecc < 16){
                image = Hard.Abb2;
                Hard.framecc++;
            }
            if(Hard.framecc >= 16 && Hard.framecc < 24){
                image = Hard.Abb3;
                Hard.framecc++;
            }
            if(Hard.framecc == 24){
                Hard.framecc = 0;
            }
        }
        if (SelectMode.Mode == 3){
            if(Double.framecc >= 0 && Double.framecc < 8){
                image = Double.Abb1;
                Double.framecc++;
            }
            if(Double.framecc >= 8 && Double.framecc < 16){
                image = Double.Abb2;
                Double.framecc++;
            }
            if(Double.framecc >= 16 && Double.framecc < 24){
                image = Double.Abb3;
                Double.framecc++;
            }
            if(Double.framecc == 24){
                Double.framecc = 0;
            }
        }

    }

    public void rightward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.framedd>= 0 && Easy_bg.framedd < 8){
                image = Easy_bg.Acc1;
                Easy_bg.framedd++;
            }
            if(Easy_bg.framedd >= 8 && Easy_bg.framedd < 16){
                image = Easy_bg.Acc2;
                Easy_bg.framedd++;
            }
            if(Easy_bg.framedd >= 16 && Easy_bg.framedd < 24){
                image = Easy_bg.Acc3;
                Easy_bg.framedd++;
            }
            if(Easy_bg.framedd == 24){
                Easy_bg.framedd = 0;
            }
        }
        if(SelectMode.Mode == 2){
            if(Hard.framedd>= 0 && Hard.framedd < 8){
                image = Hard.Acc1;
                Hard.framedd++;
            }
            if(Hard.framedd >= 8 && Hard.framedd < 16){
                image = Hard.Acc2;
                Hard.framedd++;
            }
            if(Hard.framedd >= 16 && Hard.framedd < 24){
                image = Hard.Acc3;
                Hard.framedd++;
            }
            if(Hard.framedd == 24){
                Hard.framedd = 0;
            }
        }
        if (SelectMode.Mode == 3){
            if(Double.framedd>= 0 && Double.framedd < 8){
                image = Double.Acc1;
                Double.framedd++;
            }
            if(Double.framedd >= 8 && Double.framedd < 16){
                image = Double.Acc2;
                Double.framedd++;
            }
            if(Double.framedd >= 16 && Double.framedd < 24){
                image = Double.Acc3;
                Double.framedd++;
            }
            if(Double.framedd == 24){
                Double.framedd = 0;
            }
        }

    }

    //第二个角色
    public void downward1(){
        if(SelectMode.Mode == 3){
            if(Double.frameaaa >= 0 && Double.frameaaa < 6){
                image1 = Double.Baa1;
                Double.frameaaa++;
            }
            if(Double.frameaaa >= 6 && Double.frameaaa < 12){
                image1 = Double.Baa2;
                Double.frameaaa++;
            }
            if(Double.frameaaa >= 12 && Double.frameaaa < 18){
                image1 = Double.Baa3;
                Double.frameaaa++;
            }
            if(Double.frameaaa == 18){
                Double.frameaaa = 0;
            }
        }
    }
    public void leftward1(){
        if(SelectMode.Mode == 3){
            if(Double.framebbb >= 0 && Double.framebbb < 6){
                image1 = Double.Bbb1;
                Double.framebbb++;
            }
            if(Double.framebbb >= 6 && Double.framebbb < 12){
                image1 = Double.Bbb2;
                Double.framebbb++;
            }
            if(Double.framebbb >= 12 && Double.framebbb < 18){
                image1 = Double.Bbb3;
                Double.framebbb++;
            }
            if(Double.framebbb == 18){
                Double.framebbb = 0;
            }
        }
    }
    public void rightward1(){
        if(SelectMode.Mode == 3){
            if(Double.frameccc >= 0 && Double.frameccc < 6){
                image1 = Double.Bcc1;
                Double.frameccc++;
            }
            if(Double.frameccc >= 6 && Double.frameccc < 12){
                image1 = Double.Bcc2;
                Double.frameccc++;
            }
            if(Double.frameccc >= 12 && Double.frameccc < 18){
                image1 = Double.Bcc3;
                Double.frameccc++;
            }
            if(Double.frameccc == 18){
                Double.frameccc = 0;
            }
        }
    }
    public void upward1(){
        if(SelectMode.Mode == 3){
            if(Double.frameddd >= 0 && Double.frameddd < 6){
                image1 = Double.Bdd1;
                Double.frameddd++;
            }
            if(Double.frameddd >= 6 && Double.frameddd < 12){
                image1 = Double.Bdd2;
                Double.frameddd++;
            }
            if(Double.frameddd >= 12 && Double.frameddd < 18){
                image1 = Double.Bdd3;
                Double.frameddd++;
            }
            if(Double.frameddd == 18){
                Double.frameddd = 0;
            }
        }
    }

    //actor move by keyboard
    public void move() {
        if (pressedLeft) {
            leftward();
            if (!ActorL) {
                x -= speed;
            }
        } else if (pressedRight) {
            rightward();
            if (!ActorR) {
                x += speed;
            }
        } else if (pressedUp) {
            upward();
            if (!ActorU) {
                y -= speed;
            }
        } else if (pressedDown) {
            downward();
            if (!ActorD) {

                y += speed;
            }
        }
    }


    public void move1(){
        if (pressedA) {
            leftward1();
            if (!ActorL) {
                x -= speed;
            }
        } else if (pressedD) {
            rightward1();
            if (!ActorR) {
                x += speed;
            }
        } else if (pressedW) {
            upward1();
            if (!ActorU) {
                y -= speed;
            }
        } else if (pressedS) {
            downward1();
            if (!ActorD) {

                y += speed;
            }
        }
    }

    //bullet
    public void ACTOR_fire() {
        int BulletX = x;
        int BulletY = y;
        switch (direction) {
            case DOWN: {
                BulletY += 15;
                BulletX += 5;
            }
            break;
            case UP: {
                BulletY -= 55;
                BulletX += 5;
            }
            break;
            case RIGHT: {
                BulletX += 10;
            }
            break;
            case LEFT: {
                BulletX -= 60;
                BulletX += 5;
            }
            break;
        }

        Bullet bullet = BulletsPool.get();
        bullet.setX(BulletX);
        bullet.setY(BulletY);
        bullet.setWidth(32);
        bullet.setHeight(32);
        bullet.setatk(300);
        bullet.setSpeed(15);
        bullet.setId(2);
        bullet.setDirection(direction);
        bullet.setVisible(true);
        bullets.add(bullet);
    }

    //火焰子弹修正状态动画
    public void Flame_fire() {
        int BulletX = x;
        int BulletY = y;
        switch (direction) {
            case DOWN: {
                BulletY += 15;
                BulletX -= 5;
            }
            break;
            case UP: {
                BulletY -= 85;
                BulletX -= 5;
            }
            break;
            case RIGHT: {
                BulletY -= 10;
                BulletX -= 15;
            }
            break;
            case LEFT: {
                BulletY -= 10;
                BulletX -= 35;
            }
            break;
        }
        //子弹对象池抽离
        Bullet bullet = BulletsPool.get();
        bullet.setX(BulletX);
        bullet.setY(BulletY);
        bullet.setWidth(32);
        bullet.setHeight(32);
        bullet.setatk(7);
        bullet.setSpeed(15);
        bullet.setId(3);
        bullet.setDirection(direction);
        bullet.setVisible(true);
        bullets.add(bullet);
    }

    //冰霜子弹 修正动画
    public void Ice_fire() {
        int BulletX = x;
        int BulletY = y;
        switch (direction) {
            case DOWN: {
                BulletY += 15;
                BulletX -= 2;
            }
            break;
            case UP: {
                BulletY -= 85;
                BulletX -= 2;
            }
            break;
            case RIGHT: {
                BulletY -= 10;
                BulletX -= 5;
            }
            break;
            case LEFT: {
                BulletY -= 10;
                BulletX -= 35;
            }
            break;
        }
        //子弹对象池抽离
        Bullet bullet = BulletsPool.get();
        bullet.setX(BulletX);
        bullet.setY(BulletY);
        bullet.setWidth(32);
        bullet.setHeight(32);
        bullet.setId(4);
        bullet.setatk(7);
        bullet.setSpeed(15);
        bullet.setDirection(direction);
        bullet.setVisible(true);
        bullets.add(bullet);
    }

    //藤曼子弹 修正动画
    public void Creeper_fire() {
        int BulletX = x;
        int BulletY = y;
        switch (direction) {
            case DOWN: {
                BulletY += 15;
                BulletX -= 20;
            }
            break;
            case UP: {
                BulletY -= 85;
                BulletX -= 20;
            }
            break;
            case RIGHT: {
                BulletY -= 15;
                BulletX -= 5;
            }
            break;
            case LEFT: {
                BulletY -= 15;
                BulletX -= 35;
            }
            break;
        }
        //子弹对象池抽离
        Bullet bullet = BulletsPool.get();
        bullet.setX(BulletX);
        bullet.setY(BulletY);
        bullet.setWidth(32);
        bullet.setHeight(32);
        bullet.setatk(7);
        bullet.setSpeed(15);
        bullet.setId(5);
        bullet.setDirection(direction);
        bullet.setVisible(true);
        bullets.add(bullet);
    }

    //道具使用
    //面包   MP + 5 HP + 5
    public void Four() {
        if(SelectMode.Mode == 1){
            for (int i = 0; i < Easy_bg.dropA.size(); i++) {
                if (Config.HP < Config.HPmax || Config.MP < Config.MPmax) {
                    Config.HP += 5;
                    Config.MP += 5;
                    if (Config.HP > Config.HPmax) {
                        Config.HP = Config.HPmax;
                    }
                    if (Config.MP > Config.MPmax) {
                        Config.MP = Config.MPmax;
                    }
                    Easy_bg.dropA.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 2){
            for (int i = 0; i < Hard.dropA.size(); i++) {
                if (Config.HP < Config.HPmax || Config.MP < Config.MPmax) {
                    Config.HP += 5;
                    Config.MP += 5;
                    if (Config.HP > Config.HPmax) {
                        Config.HP = Config.HPmax;
                    }
                    if (Config.MP > Config.MPmax) {
                        Config.MP = Config.MPmax;
                    }
                    Hard.dropA.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 3){
            for (int i = 0; i < Double.dropA.size(); i++) {
                if (Config.HP < Config.HPmax || Config.MP < Config.MPmax) {
                    Config.HP += 5;
                    Config.MP += 5;
                    if (Config.HP > Config.HPmax) {
                        Config.HP = Config.HPmax;
                    }
                    if (Config.MP > Config.MPmax) {
                        Config.MP = Config.MPmax;
                    }
                    Double.dropA.remove(i);
                    break;
                }
            }
        }

    }

    public void Four1() {
        if(SelectMode.Mode == 1){
            for (int i = 0; i < Easy_bg.dropA.size(); i++) {
                if (Config.HP1 < Config.HPmax || Config.MP1 < Config.MPmax) {
                    Config.HP1 += 5;
                    Config.MP1 += 5;
                    if (Config.HP1 > Config.HPmax) {
                        Config.HP1 = Config.HPmax;
                    }
                    if (Config.MP1 > Config.MPmax) {
                        Config.MP1 = Config.MPmax;
                    }
                    Easy_bg.dropA.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 2){
            for (int i = 0; i < Hard.dropA.size(); i++) {
                if (Config.HP1 < Config.HPmax || Config.MP1 < Config.MPmax) {
                    Config.HP1 += 5;
                    Config.MP1 += 5;
                    if (Config.HP1 > Config.HPmax) {
                        Config.HP1 = Config.HPmax;
                    }
                    if (Config.MP1 > Config.MPmax) {
                        Config.MP1 = Config.MPmax;
                    }
                    Hard.dropA.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 3){
            for (int i = 0; i < Double.dropA.size(); i++) {
                if (Config.HP1 < Config.HPmax || Config.MP1 < Config.MPmax) {
                    Config.HP1 += 5;
                    Config.MP1 += 5;
                    if (Config.HP1 > Config.HPmax) {
                        Config.HP1 = Config.HPmax;
                    }
                    if (Config.MP1 > Config.MPmax) {
                        Config.MP1 = Config.MPmax;
                    }
                    Double.dropA.remove(i);
                    break;
                }
            }
        }

    }

    //血瓶 HP + 10
    public void Five() {
        if(SelectMode.Mode == 1){
            for (int i = 0; i < Easy_bg.dropB.size(); i++) {
                if (Config.HP < Config.HPmax) {
                    Config.HP += 10;
                    if (Config.HP > Config.HPmax) {
                        Config.HP = Config.HPmax;
                    }
                    Easy_bg.dropB.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 2){
            for (int i = 0; i < Hard.dropB.size(); i++) {
                if (Config.HP < Config.HPmax) {
                    Config.HP += 10;
                    if (Config.HP > Config.HPmax) {
                        Config.HP = Config.HPmax;
                    }
                    Hard.dropB.remove(i);
                    break;
                }
            }
        }

        if (SelectMode.Mode == 3){
            for (int i = 0; i < Double.dropB.size(); i++) {
                if (Config.HP < Config.HPmax) {
                    Config.HP += 10;
                    if (Config.HP > Config.HPmax) {
                        Config.HP = Config.HPmax;
                    }
                    Double.dropB.remove(i);
                    break;
                }
            }
        }
    }

    public void Five1() {
        if(SelectMode.Mode == 1){
            for (int i = 0; i < Easy_bg.dropB.size(); i++) {
                if (Config.HP1 < Config.HPmax) {
                    Config.HP1 += 10;
                    if (Config.HP1 > Config.HPmax) {
                        Config.HP1 = Config.HPmax;
                    }
                    Easy_bg.dropB.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 2){
            for (int i = 0; i < Hard.dropB.size(); i++) {
                if (Config.HP1 < Config.HPmax) {
                    Config.HP1 += 10;
                    if (Config.HP1 > Config.HPmax) {
                        Config.HP1 = Config.HPmax;
                    }
                    Hard.dropB.remove(i);
                    break;
                }
            }
        }

        if (SelectMode.Mode == 3){
            for (int i = 0; i < Double.dropB.size(); i++) {
                if (Config.HP1 < Config.HPmax) {
                    Config.HP1 += 10;
                    if (Config.HP1 > Config.HPmax) {
                        Config.HP1 = Config.HPmax;
                    }
                    Double.dropB.remove(i);
                    break;
                }
            }
        }
    }

    //蓝瓶 MP + 10
    public void Six() {
        if(SelectMode.Mode == 1){
            for (int i = 0; i < Easy_bg.dropC.size(); i++) {
                if (Config.MP < Config.MPmax) {
                    Config.MP += 10;
                    if (Config.MP > Config.MPmax) {
                        Config.MP = Config.MPmax;
                    }
                    Easy_bg.dropC.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 2){
            for (int i = 0; i < Hard.dropC.size(); i++) {
                if (Config.MP < Config.MPmax) {
                    Config.MP += 10;
                    if (Config.MP > Config.MPmax) {
                        Config.MP = Config.MPmax;
                    }
                    Hard.dropC.remove(i);
                    break;
                }
            }
        }
        if (SelectMode.Mode == 3){
            for (int i = 0; i < Double.dropC.size(); i++) {
                if (Config.MP < Config.MPmax) {
                    Config.MP += 10;
                    if (Config.MP > Config.MPmax) {
                        Config.MP = Config.MPmax;
                    }
                    Double.dropC.remove(i);
                    break;
                }
            }
        }

    }

    public void Six1() {
        if(SelectMode.Mode == 1){
            for (int i = 0; i < Easy_bg.dropC.size(); i++) {
                if (Config.MP1 < Config.MPmax) {
                    Config.MP1 += 10;
                    if (Config.MP1 > Config.MPmax) {
                        Config.MP1 = Config.MPmax;
                    }
                    Easy_bg.dropC.remove(i);
                    break;
                }
            }
        }
        if(SelectMode.Mode == 2){
            for (int i = 0; i < Hard.dropC.size(); i++) {
                if (Config.MP1 < Config.MPmax) {
                    Config.MP1 += 10;
                    if (Config.MP1 > Config.MPmax) {
                        Config.MP1 = Config.MPmax;
                    }
                    Hard.dropC.remove(i);
                    break;
                }
            }
        }
        if (SelectMode.Mode == 3){
            for (int i = 0; i < Double.dropC.size(); i++) {
                if (Config.MP1 < Config.MPmax) {
                    Config.MP1 += 10;
                    if (Config.MP1 > Config.MPmax) {
                        Config.MP1 = Config.MPmax;
                    }
                    Double.dropC.remove(i);
                    break;
                }
            }
        }

    }

    public int getAtk() {
        return atk;
    }

    public void setActorL(boolean actorL) {
        ActorL = actorL;
    }

    public void setActorR(boolean actorR) {
        ActorR = actorR;
    }

    public void setActorU(boolean actorU) {
        ActorU = actorU;
    }

    public void setActorD(boolean actorD) {
        ActorD = actorD;
    }
    public int getSpeed() {
        return speed;
    }

}
