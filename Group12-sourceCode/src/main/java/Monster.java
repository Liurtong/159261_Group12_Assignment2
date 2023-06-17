import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Monster extends GameObject{
    private int life;
    int id;
    private int atk;
    private long aitime;
    private int Random;
    private int speed = 1;

    //    Image imageDown,imageUP,imageLeft,imageRight; // 一个公共的图片（怪兽）
    Image image = Toolkit.getDefaultToolkit().getImage("picture/blue.png");
    Image image1 = Toolkit.getDefaultToolkit().getImage("picture/bossR.png");
    boolean monsterUP,monsterDown,monsterLeft,monsterRight;
    public boolean Orientationl = false, Orientationr = false, Orientationu = false, Orientationd = false;
    //敌人的子弹容器
    static ArrayList<Bullet> bulletsMonster = new ArrayList<>();
    Random Radom = new Random();
    //怪物是否受击
    public int acttackcount = 0;

    public Monster(){

    }

    public Monster(int x, int y, int width, int height, Rectangle rectangle, int life, int atk, Direction direction, int id) {
        super(x, y, width, height, rectangle, direction);
        this.life = life;
        this.id = id;
        this.atk = atk;
        aitime = System.currentTimeMillis();   //敌人创建,开始计算时间
    }

    //WS 更新黑衣怪兽动画
    public void downward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.framea >= 0 && Easy_bg.framea < 20){
                image = Easy_bg.Aa1;
                Easy_bg.framea++;
            }
            if(Easy_bg.framea >= 20 && Easy_bg.framea < 40){
                image = Easy_bg.Aa2;
                Easy_bg.framea++;
            }
            if(Easy_bg.framea >= 40 && Easy_bg.framea < 60){
                image = Easy_bg.Aa3;
                Easy_bg.framea++;
            }
            if(Easy_bg.framea == 60){
                Easy_bg.framea = 0;
            }
        }
        if(SelectMode.Mode == 2){
            //Hard模式下的图片
            if(Hard.framea >= 0 && Hard.framea < 20){
                image = Hard.Aa1;
                Hard.framea++;
            }
            if(Hard.framea >= 20 && Hard.framea < 40){
                image = Hard.Aa2;
                Hard.framea++;
            }
            if(Hard.framea >= 40 && Hard.framea < 60){
                image = Hard.Aa3;
                Hard.framea++;
            }
            if(Hard.framea == 60){
                Hard.framea = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.framea >= 0 && Double.framea < 20){
                image = Double.Aa1;
                Double.framea++;
            }
            if(Double.framea >= 20 && Double.framea < 40){
                image = Double.Aa2;
                Double.framea++;
            }
            if(Double.framea >= 40 && Double.framea < 60){
                image = Double.Aa3;
                Double.framea++;
            }
            if(Double.framea == 60){
                Double.framea = 0;
            }
        }
    }

    public void upward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.frameb >= 0 && Easy_bg.frameb < 20){
                image = Easy_bg.Ad1;
                Easy_bg.frameb++;
            }
            if(Easy_bg.frameb >= 20 && Easy_bg.frameb < 40){
                image = Easy_bg.Ad2;
                Easy_bg.frameb++;
            }
            if(Easy_bg.frameb >= 40 && Easy_bg.frameb < 60){
                image = Easy_bg.Ad3;
                Easy_bg.frameb++;
            }
            if(Easy_bg.frameb == 60){
                Easy_bg.frameb = 0;
            }
        }


        if(SelectMode.Mode == 2){
            //HARD 模式
            if(Hard.frameb >= 0 && Hard.frameb < 20){
                image = Hard.Ad1;
                Hard.frameb++;
            }
            if(Hard.frameb >= 20 && Hard.frameb < 40){
                image = Hard.Ad2;
                Hard.frameb++;
            }
            if(Hard.frameb >= 40 && Hard.frameb < 60){
                image = Hard.Ad3;
                Hard.frameb++;
            }
            if(Hard.frameb == 60){
                Hard.frameb = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameb >= 0 && Double.frameb < 20){
                image = Double.Ad1;
                Double.frameb++;
            }
            if(Double.frameb >= 20 && Double.frameb < 40){
                image = Double.Ad2;
                Double.frameb++;
            }
            if(Double.frameb >= 40 && Double.frameb < 60){
                image = Double.Ad3;
                Double.frameb++;
            }
            if(Double.frameb == 60){
                Double.frameb = 0;
            }
        }

    }

    public void leftward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.framec >= 0 && Easy_bg.framec < 20){
                image = Easy_bg.Ab1;
                Easy_bg.framec++;
            }
            if(Easy_bg.framec >= 20 && Easy_bg.framec < 40){
                image = Easy_bg.Ab2;
                Easy_bg.framec++;
            }
            if(Easy_bg.framec >= 40 && Easy_bg.framec < 60){
                image = Easy_bg.Ab3;
                Easy_bg.framec++;
            }
            if(Easy_bg.framec == 60){
                Easy_bg.framec = 0;
            }
        }

        if(SelectMode.Mode == 2){
            //HARD
            if(Hard.framec >= 0 && Hard.framec < 20){
                image = Hard.Ab1;
                Hard.framec++;
            }
            if(Hard.framec >= 20 && Hard.framec < 40){
                image = Hard.Ab2;
                Hard.framec++;
            }
            if(Hard.framec >= 40 && Hard.framec < 60){
                image = Hard.Ab3;
                Hard.framec++;
            }
            if(Hard.framec == 60){
                Hard.framec = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.framec >= 0 && Double.framec < 20){
                image = Double.Ab1;
                Double.framec++;
            }
            if(Double.framec >= 20 && Double.framec < 40){
                image = Double.Ab2;
                Double.framec++;
            }
            if(Double.framec >= 40 && Double.framec < 60){
                image =Double.Ab3;
                Double.framec++;
            }
            if(Double.framec == 60){
                Double.framec = 0;
            }
        }
    }

    public void rightward(){
        if(SelectMode.Mode == 1){
            if(Easy_bg.framed>= 0 && Easy_bg.framed < 20){
                image = Easy_bg.Ac1;
                Easy_bg.framed++;
            }
            if(Easy_bg.framed >= 20 && Easy_bg.framed < 40){
                image = Easy_bg.Ac2;
                Easy_bg.framed++;
            }
            if(Easy_bg.framed >= 40 && Easy_bg.framed < 60){
                image = Easy_bg.Ac3;
                Easy_bg.framed++;
            }
            if(Easy_bg.framed == 60){
                Easy_bg.framed = 0;
            }
        }

        if(SelectMode.Mode == 2){
            //HARD
            if(Hard.framed>= 0 && Hard.framed < 20){
                image = Hard.Ac1;
                Hard.framed++;
            }
            if(Hard.framed >= 20 && Hard.framed < 40){
                image = Hard.Ac2;
                Hard.framed++;
            }
            if(Hard.framed >= 40 && Hard.framed < 60){
                image = Hard.Ac3;
                Hard.framed++;
            }
            if(Hard.framed == 60){
                Hard.framed = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.framed>= 0 && Double.framed < 20){
                image = Double.Ac1;
                Double.framed++;
            }
            if(Double.framed >= 20 && Double.framed < 40){
                image = Double.Ac2;
                Double.framed++;
            }
            if(Double.framed >= 40 && Double.framed < 60){
                image = Double.Ac3;
                Double.framed++;
            }
            if(Double.framed == 60){
                Double.framed = 0;
            }
        }
    }


    //丧尸的方向变化动画
    public void downwardS(){
        if(SelectMode.Mode == 2){
            if(Hard.framee >= 0 && Hard.framee < 20){
                image = Hard.SA1;
                Hard.framee++;
            }
            if(Hard.framee >= 20 && Hard.framee < 40){
                image = Hard.SA2;
                Hard.framee++;
            }
            if(Hard.framee >= 40 && Hard.framee < 60){
                image = Hard.SA3;
                Hard.framee++;
            }
            if(Hard.framee == 60){
                Hard.framee = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.framee >= 0 && Double.framee < 20){
                image = Double.SA1;
                Double.framee++;
            }
            if(Double.framee >= 20 && Double.framee < 40){
                image = Double.SA2;
                Double.framee++;
            }
            if(Double.framee >= 40 && Double.framee < 60){
                image = Double.SA3;
                Double.framee++;
            }
            if(Double.framee == 60){
                Double.framee = 0;
            }
        }

    }

    public void leftwardS(){
        if(SelectMode.Mode == 2){
//HARD
            if(Hard.framef >= 0 && Hard.framef < 20){
                image = Hard.SB1;
                Hard.framef++;
            }
            if(Hard.framef >= 20 && Hard.framef < 40){
                image = Hard.SB2;
                Hard.framef++;
            }
            if(Hard.framef >= 40 && Hard.framef < 60){
                image = Hard.SB3;
                Hard.framef++;
            }
            if(Hard.framef == 60){
                Hard.framef = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.framef >= 0 && Double.framef < 20){
                image = Double.SB1;
                Double.framef++;
            }
            if(Double.framef >= 20 && Double.framef < 40){
                image = Double.SB2;
                Double.framef++;
            }
            if(Double.framef >= 40 && Double.framef < 60){
                image = Double.SB3;
                Double.framef++;
            }
            if(Double.framef == 60){
                Double.framef = 0;
            }
        }
    }

    public void rightwardS(){
        if(SelectMode.Mode == 2){
//HARD
            if(Hard.frameg>= 0 && Hard.frameg < 20){
                image = Hard.SC1;
                Hard.frameg++;
            }
            if(Hard.frameg >= 20 && Hard.frameg < 40){
                image = Hard.SC2;
                Hard.frameg++;
            }
            if(Hard.frameg >= 40 && Hard.frameg < 60){
                image = Hard.SC3;
                Hard.frameg++;
            }
            if(Hard.frameg == 60){
                Hard.frameg = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameg>= 0 && Double.frameg < 20){
                image = Double.SC1;
                Double.frameg++;
            }
            if(Double.frameg >= 20 && Double.frameg < 40){
                image = Double.SC2;
                Double.frameg++;
            }
            if(Double.frameg >= 40 && Double.frameg < 60){
                image = Double.SC3;
                Double.frameg++;
            }
            if(Double.frameg == 60){
                Double.frameg = 0;
            }
        }
    }

    public void upwardS(){
        if(SelectMode.Mode == 2){
//HARD 模式
            if(Hard.frameh >= 0 && Hard.frameh < 20){
                image = Hard.SD1;
                Hard.frameh++;
            }
            if(Hard.frameh >= 20 && Hard.frameh < 40){
                image = Hard.SD2;
                Hard.frameh++;
            }
            if(Hard.frameh >= 40 && Hard.frameh < 60){
                image = Hard.SD3;
                Hard.frameh++;
            }
            if(Hard.frameh == 60){
                Hard.frameh = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameh >= 0 && Double.frameh < 20){
                image = Double.SD1;
                Double.frameh++;
            }
            if(Double.frameh >= 20 && Double.frameh < 40){
                image = Double.SD2;
                Double.frameh++;
            }
            if(Double.frameh >= 40 && Double.frameh < 60){
                image = Double.SD3;
                Double.frameh++;
            }
            if(Double.frameh == 60){
                Double.frameh = 0;
            }
        }
    }

    //大boss方向变换的动画
    public void downwardB(){
        if(SelectMode.Mode == 2){
            if(Hard.frameBaa >= 0 && Hard.frameBaa < 30){
                image1 = Hard.BOSSA1;
                Hard.frameBaa++;
            }
            if(Hard.frameBaa >= 30 && Hard.frameBaa < 60){
                image1 = Hard.BOSSA2;
                Hard.frameBaa++;
            }
            if(Hard.frameBaa >= 60 && Hard.frameBaa < 90){
                image1 = Hard.BOSSA3;
                Hard.frameBaa++;
            }
            if(Hard.frameBaa == 90){
                Hard.frameBaa = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameBaa >= 0 && Double.frameBaa < 30){
                image1 = Double.BOSSA1;
                Double.frameBaa++;
            }
            if(Double.frameBaa >= 30 && Double.frameBaa < 60){
                image1 = Double.BOSSA2;
                Double.frameBaa++;
            }
            if(Double.frameBaa >= 60 && Double.frameBaa < 90){
                image1 = Double.BOSSA3;
                Double.frameBaa++;
            }
            if(Double.frameBaa == 90){
                Double.frameBaa = 0;
            }
        }
    }
    public void leftwardB(){
        if(SelectMode.Mode == 2){
            if(Hard.frameBbb >= 0 && Hard.frameBbb < 30){
                image1 = Hard.BOSSB1;
                Hard.frameBbb++;
            }
            if(Hard.frameBbb >= 30 && Hard.frameBbb < 60){
                image1 = Hard.BOSSB2;
                Hard.frameBbb++;
            }
            if(Hard.frameBbb >= 60 && Hard.frameBbb < 90){
                image1 = Hard.BOSSB3;
                Hard.frameBbb++;
            }
            if(Hard.frameBbb == 90){
                Hard.frameBbb = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameBbb >= 0 && Double.frameBbb < 30){
                image1 = Double.BOSSB1;
                Double.frameBbb++;
            }
            if(Double.frameBbb >= 30 && Double.frameBbb < 60){
                image1 = Double.BOSSB2;
                Double.frameBbb++;
            }
            if(Double.frameBbb >= 60 && Double.frameBbb < 90){
                image1 = Double.BOSSB3;
                Double.frameBbb++;
            }
            if(Double.frameBbb == 90){
                Double.frameBbb = 0;
            }
        }
    }
    public void rightwardB(){
        if(SelectMode.Mode == 2){
            if(Hard.frameBcc >= 0 && Hard.frameBcc < 30){
                image1 = Hard.BOSSC1;
                Hard.frameBcc++;
            }
            if(Hard.frameBcc >= 30 && Hard.frameBcc < 60){
                image1 = Hard.BOSSC2;
                Hard.frameBcc++;
            }
            if(Hard.frameBcc >= 60 && Hard.frameBcc < 90){
                image1 = Hard.BOSSC3;
                Hard.frameBcc++;
            }
            if(Hard.frameBcc == 90){
                Hard.frameBcc = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameBcc >= 0 && Double.frameBcc < 30){
                image1 = Double.BOSSC1;
                Double.frameBcc++;
            }
            if(Double.frameBcc >= 30 && Double.frameBcc < 60){
                image1 = Double.BOSSC2;
                Double.frameBcc++;
            }
            if(Double.frameBcc >= 60 && Double.frameBcc < 90){
                image1 = Double.BOSSC3;
                Double.frameBcc++;
            }
            if(Double.frameBcc == 90){
                Double.frameBcc = 0;
            }
        }
    }
    public void upwardB(){
        if(SelectMode.Mode == 2){
            if(Hard.frameBdd >= 0 && Hard.frameBdd < 30){
                image1 = Hard.BOSSD1;
                Hard.frameBdd++;
            }
            if(Hard.frameBdd >= 30 && Hard.frameBdd < 60){
                image1 = Hard.BOSSD2;
                Hard.frameBdd++;
            }
            if(Hard.frameBdd >= 60 && Hard.frameBdd < 90){
                image1 = Hard.BOSSD3;
                Hard.frameBdd++;
            }
            if(Hard.frameBdd == 90){
                Hard.frameBdd = 0;
            }
        }
        if(SelectMode.Mode == 3){
            if(Double.frameBdd >= 0 && Double.frameBdd < 30){
                image1 = Double.BOSSD1;
                Double.frameBdd++;
            }
            if(Double.frameBdd >= 30 && Double.frameBdd < 60){
                image1 = Double.BOSSD2;
                Double.frameBdd++;
            }
            if(Double.frameBdd >= 60 && Double.frameBdd < 90){
                image1 = Double.BOSSD3;
                Double.frameBdd++;
            }
            if(Double.frameBdd == 90){
                Double.frameBdd = 0;
            }
        }
    }

    //黑衣怪物移动
    public void move(){
        if(monsterDown){
            downward();
            if(!Orientationd){
                setY(getY() + getSpeed());
            }
        } else if(monsterUP){
            upward();
            if (!Orientationu) {
                setY(getY() - getSpeed());
            }
        } else if(monsterLeft){
            leftward();
            if (!Orientationl) {
                setX(getX() - getSpeed());
            }
        } else if(monsterRight){
            rightward();
            if (!Orientationr) {
                setX(getX() + getSpeed());
            }
        }
    }

    //丧失的移动
    public void Smove() {
        if (monsterLeft) {
            leftwardS();
            if (!Orientationl) {
                setX(getX() - getSpeed());
            }
        } else if (monsterRight) {
            rightwardS();
            if (!Orientationr) {
                setX(getX() + getSpeed());
            }
        } else if (monsterUP) {
            upwardS();
            if (!Orientationu) {
                setY(getY() - getSpeed());
            }
        } else if (monsterDown) {
            downwardS();
            if (!Orientationd) {
                setY(getY() + getSpeed());
            }
        }
    }

    //大Boss的移动
    public void Boss_move() {
        if (monsterLeft) {
            leftwardB();
            if (!Orientationl) {
                setX(getX() - getSpeed());
            }
        } else if (monsterRight) {
            rightwardB();
            if (!Orientationr) {
                setX(getX() + getSpeed());
            }
        } else if (monsterUP) {
            upwardB();
            if (!Orientationu) {
                setY(getY() - getSpeed());
            }
        } else if (monsterDown) {
            downwardB();
            if (!Orientationd) {
                setY(getY() + getSpeed());
            }
        }
    }


    //ai功能 每隔三秒转换形态
    public void ai(){
        if(System.currentTimeMillis() - aitime > 2000){
            aitime = System.currentTimeMillis();
            int randomNum = Radom.nextInt(8);

            if (randomNum == 1) {
                this.direction = Direction.LEFT;
                monsterLeft = true;
                monsterRight = false;
                monsterUP = false;
                monsterDown = false;
            } else if (randomNum == 2) {
                this.direction = Direction.RIGHT;
                monsterLeft = false;
                monsterRight = true;
                monsterUP = false;
                monsterDown = false;
                if(id == 3){
                    Bossfire();
                }
            } else if (randomNum == 3) {
                this.direction = Direction.UP;
                monsterLeft = false;
                monsterRight = false;
                monsterUP = true;
                monsterDown = false;
            } else if (randomNum == 4) {
                this.direction = Direction.DOWN;
                monsterLeft = false;
                monsterRight = false;
                monsterUP = false;
                monsterDown = true;
                if(id == 3){
                    Bossfire();
                }
            }else if(randomNum == 5 || randomNum == 6 || randomNum == 7){
                if(id == 3){
                    Bossfire();
                }else{
                    fire();
                }

            }
        }
    }

    //初始化子弹并且修正子弹初始位置
    public void fire(){
        //使子弹默认在怪兽上方出现
        int BULLETX = x;
        int BULLETY = y;
        switch (direction) {
            case DOWN:
                BULLETY += 10;
                break;
            case UP:
                BULLETY -= 10;
                break;
            case RIGHT:
                BULLETX += 10;
                break;
            case LEFT:
                BULLETX -= 10;
                break;
        }
        //初始化子弹
        Bullet bullet = BulletsPool.get();
        bullet.setX(BULLETX);
        bullet.setY(BULLETY);
//        bullet.setImg(bulletImg);
        bullet.setWidth(32);
        bullet.setHeight(32);
        bullet.setSpeed(4);
        bullet.setId(1);
        bullet.setatk(15);
        bullet.setDirection(direction);
        bullet.setVisible(true);
        bulletsMonster.add(bullet);
    }

    public void Bossfire(){
        //使子弹默认在怪物上方
        int MonsterX = x;
        int MonsterY = y;
        switch (direction) {
            case DOWN:
                MonsterX -= 23;
                MonsterY += 10;
                break;
            case UP:
                MonsterX -= 23;
                MonsterY -= 10;
                break;
            case RIGHT:
                MonsterY += 50;
                MonsterX += 10;
                break;
            case LEFT:
                MonsterY += 50;
                MonsterX -= 10;
                break;
        }
        //初始化子弹
        Bullet bullet = BulletsPool.get();
        bullet.setX(MonsterX);
        bullet.setY(MonsterY);
//        bullet.setImg(bulletImg);
        bullet.setWidth(140);
        bullet.setHeight(172);
        bullet.setSpeed(4);
        bullet.setId(6);
        bullet.setatk(50);
        bullet.setDirection(direction);
        bullet.setVisible(true);
        bulletsMonster.add(bullet);
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    public void setOrientationl(boolean orientationl) {
        Orientationl = orientationl;
    }
    public void setOrientationr(boolean orientationr) {
        Orientationr = orientationr;
    }

    public void setOrientationu(boolean orientationu) {
        Orientationu = orientationu;
    }

    public void setOrientationd(boolean orientationd) {
        Orientationd = orientationd;
    }

    public void setRadom(int radom) {
        Random = radom;
    }

    public void setActtackcount(int acttackcount) {
        this.acttackcount = acttackcount;
    }
}
