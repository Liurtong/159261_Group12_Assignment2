import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Double extends GameEngine {
    //音乐
    AudioClip backgroundMusic;

    //地图
    private Image GameBg = loadImage("picture/white.png");
    private Image GameBg2 = loadImage("picture/bg08.png");
    private Image tree = loadImage("picture/tree01.png");

    //物品
    private Image Skill_bar = loadImage("picture/skill_bar.png");
    private Image Bread = loadImage("picture/Bread.png");
    private Image HP_bottle = loadImage("picture/HP_bottle.png");
    private Image MP_bottle = loadImage("picture/MP_bottle.png");
    private Image Key = loadImage("picture/Key.png");
    private Image stop = loadImage("picture/stop.png");
    private Image princess = loadImage("picture/princess.png");

    //WS 怪兽图像
    private Image enermy = loadImage("picture/Enermy.png");
    private Image brave = loadImage("picture/brave.png");
    private Image brave1 = loadImage("picture/brave1.png");
    private Image sang = loadImage("picture/sangShi.png");
    private Image common_mst_bullet = loadImage("picture/monsterBullet.png");
    private Image Boss = loadImage("picture/Boss.png");
    private Image bossAtk = loadImage("picture/bossAtk.png");
    private Image IMGBK = loadImage("picture/IMGBK.png");

    //GL 新加的子弹秀儿们
    private Image commonBullet = loadImage("picture/commonBullet.png");
    private Image iceBullet = loadImage("picture/iceBullet.png");
    private Image fireBullet = loadImage("picture/fireBullet.png");
    private Image caneBullet = loadImage("picture/caneBullet.png");

    private Random random = new Random();

    //怪兽图像切换
    public static Image Aa1;
    public static Image Aa2;
    public static Image Aa3;
    public static Image Ab1;
    public static Image Ab2;
    public static Image Ab3;
    public static Image Ac1;
    public static Image Ac2;
    public static Image Ac3;
    public static Image Ad1;
    public static Image Ad2;
    public static Image Ad3;

    //丧尸图像切换
    public static Image SA1;
    public static Image SA2;
    public static Image SA3;
    public static Image SB1;
    public static Image SB2;
    public static Image SB3;
    public static Image SC1;
    public static Image SC2;
    public static Image SC3;
    public static Image SD1;
    public static Image SD2;
    public static Image SD3;

    //大Boss分割图像
    public static Image BOSSA1;
    public static Image BOSSA2;
    public static Image BOSSA3;
    public static Image BOSSB1;
    public static Image BOSSB2;
    public static Image BOSSB3;
    public static Image BOSSC1;
    public static Image BOSSC2;
    public static Image BOSSC3;
    public static Image BOSSD1;
    public static Image BOSSD2;
    public static Image BOSSD3;

    //大BOSS子弹分割图像
    public static Image BOSSE1;
    public static Image BOSSE2;
    public static Image BOSSE3;
    public static Image BOSSE4;
    public static Image BOSSE5;

    //角色图像切换
    public static Image Aaa1;
    public static Image Aaa2;
    public static Image Aaa3;
    public static Image Abb1;
    public static Image Abb2;
    public static Image Abb3;
    public static Image Acc1;
    public static Image Acc2;
    public static Image Acc3;
    public static Image Add1;
    public static Image Add2;
    public static Image Add3;

    //角色图像切换
    public static Image Baa1;
    public static Image Baa2;
    public static Image Baa3;
    public static Image Bbb1;
    public static Image Bbb2;
    public static Image Bbb3;
    public static Image Bcc1;
    public static Image Bcc2;
    public static Image Bcc3;
    public static Image Bdd1;
    public static Image Bdd2;
    public static Image Bdd3;

    //怪兽普通子弹切换图像
    public static Image AB1;
    public static Image AB2;
    public static Image AB3;
    public static Image AB4;
    public static Image AB5;

    //GL 角色子弹切换
    //普通子弹
    public static Image CA1;
    public static Image CA2;
    public static Image CA3;
    public static Image CB1;
    public static Image CB2;
    public static Image CB3;
    public static Image CC1;
    public static Image CC2;
    public static Image CC3;
    public static Image CD1;
    public static Image CD2;
    public static Image CD3;

    //冰霜子弹
    public static Image IA1;
    public static Image IA2;
    public static Image IA3;
    public static Image IA4;
    public static Image IB1;
    public static Image IB2;
    public static Image IB3;
    public static Image IB4;
    public static Image IC1;
    public static Image IC2;
    public static Image IC3;
    public static Image IC4;
    public static Image ID1;
    public static Image ID2;
    public static Image ID3;
    public static Image ID4;

    //火焰子弹
    public static Image FA1;
    public static Image FA2;
    public static Image FA3;
    public static Image FB1;
    public static Image FB2;
    public static Image FB3;
    public static Image FC1;
    public static Image FC2;
    public static Image FC3;
    public static Image FD1;
    public static Image FD2;
    public static Image FD3;

    //藤蔓子弹
    public static Image TA1;
    public static Image TA2;
    public static Image TA3;
    public static Image TB1;
    public static Image TB2;
    public static Image TB3;
    public static Image TC1;
    public static Image TC2;
    public static Image TC3;
    public static Image TD1;
    public static Image TD2;
    public static Image TD3;

    //WS 规定怪兽帧
    static int framea = 0;
    static int frameb = 0;
    static int framec = 0;
    static int framed = 0;

    //规定丧尸帧
    static int framee = 0;
    static int framef = 0;
    static int frameg = 0;
    static int frameh = 0;

    //WS 规定角色帧
    static int frameaa = 0;
    static int framebb = 0;
    static int framecc = 0;
    static int framedd = 0;

    //规定第二个角色的帧
    static int frameaaa = 0;
    static int framebbb = 0;
    static int frameccc = 0;
    static int frameddd = 0;

    //怪兽子弹的帧
    static int frameAA = 0;
    //大Boss的子弹帧
    static int frameBossButton = 0;
    //大Boss的动画帧
    static int frameBaa = 0;
    static int frameBbb = 0;
    static int frameBcc = 0;
    static int frameBdd = 0;

    //角色的子弹帧 GL
    static int frameJ = 0;
    //冰霜
    static int frameJJ = 0;

    //WS 换了一下位置
    Rectangle rectangle;
    Config config;
    Bullet bullet;

    //WS 很多个怪兽的数组
    public static ArrayList<Monster> monsters = new ArrayList<>();

    //WS 角色 , bullet和config比较迷茫
    public Actor actor =  new Actor(150,450,32,35, rectangle, Direction.RIGHT, bullet, config);
    public Actor actor1 =  new Actor(100,430,32,35, rectangle, Direction.RIGHT, bullet, config);

    //地图
    int[][] originData;
    public static ArrayList<Square> wallList = new ArrayList<>();
    private List<String> lineData = new ArrayList<>();
    private int x = 0;
    private int y = -897;
    boolean down, up, left, right;
    boolean theOne = true;
    boolean theTwo = false;
    boolean theThree = false;
    boolean theFour = false;
    boolean thePrincess = true;
    boolean theLose = true;

    //掉落物品
    public static ArrayList<ItemDrop> Allconsumables = new ArrayList<>();
    //ALL背包容器
    public static ArrayList<ItemDrop> Allconsumablesl = new ArrayList<>();
    //面包容器  ID:1
    public static ArrayList<ItemDrop> dropA = new ArrayList<>();
    //血瓶容器  ID:2
    public static ArrayList<ItemDrop> dropB = new ArrayList<>();
    //蓝瓶容器  ID:3
    public static ArrayList<ItemDrop> dropC = new ArrayList<>();
    //钥匙容器  ID:4
    public static ArrayList<ItemDrop> dropD = new ArrayList<>();
    //公主容器
    public static ArrayList<ItemDrop> dropE = new ArrayList<>();
    //Stop符
    public static ArrayList<ItemDrop> dropO = new ArrayList<>();

    @Override
    public void paintComponent(Graphics graphics) {
    }

    public void readGetMap() throws Exception {
        FileInputStream fis = new FileInputStream("src/map.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (String value = br.readLine(); value != null; value = br.readLine()) {
            lineData.add(value);
        }
        // 关闭输入流
        br.close();
        //  确定行高
        int row = lineData.size();
        int cloum = 0;
        // 读取一行 确定列数
        for (int i = 0; i < 1; i++) {
            String str = lineData.get(i);
            //用 , 分割 str 字符串，并且将分割后的字符串数组赋值给 buff。
            String[] values = str.split(",");
            cloum = values.length;
        }
        //行列清楚表明
        originData = new int[row][cloum];
        //将读到的字符转换为整数，并赋值给二维数组map
        for (int i = 0; i < lineData.size(); i++) {
            String str = lineData.get(i);
            String[] values = str.split(",");
            for (int j = 0; j < values.length; j++) {
                originData[i][j] = Integer.parseInt(values[j]);
            }
        }
    }

    public void init(){
        backgroundMusic = loadAudio("src/Taps_bgm.wav");
        startAudioLoop(backgroundMusic);

        try {
            readGetMap();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            for (int i = 0; i < originData.length; i++) {
                for (int j = 0; j < originData[0].length; j++) {
                    if (originData[i][j] == 1) {
                        wallList.add(new Square(j * 32, -897 + 32 * i, 32, 32, rectangle));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //初始化禁止
        dropO.add(new ItemDrop(960, 355, 96, 32, 0, 0, 14, 1, 1, stop, rectangle));
        dropO.add(new ItemDrop(385, -160, 96, 32, 0, 0, 14, 2, 2, stop, rectangle));
        dropO.add(new ItemDrop(610, -670, 32, 96, 0, 0, 14, 3, 3, stop, rectangle));

        //WS 精灵图 怪物分图
        Aa1 = subImage(enermy,0,50,48,50);
        Aa2 = subImage(enermy,98,0,48,40);
        Aa3 = subImage(enermy,141,101,48,50);
        Ab1 = subImage(enermy,0,157,48,50);
        Ab2 = subImage(enermy,144,0,48,50);
        Ab3 = subImage(enermy,194,0,48,50);
        Ac1 = subImage(enermy,195,50,48,50);
        Ac2 = subImage(enermy,0,0,48,50);
        Ac3 = subImage(enermy,96,100,48,50);
        Ad1 = subImage(enermy,0,100,48,50);
        Ad2 = subImage(enermy,48,0,48,50);
        Ad3 = subImage(enermy,48,100,48,50);

        //精灵图 丧尸分图
        SA1 = subImage(sang,126,0,42,51);
        SA2 = subImage(sang,0,51,42,51);
        SA3 = subImage(sang,84,51,42,51);
        SB1 = subImage(sang,84,0,42,51);
        SB2 = subImage(sang,42,0,42,51);
        SB3 = subImage(sang,0,0,42,51);
        SC1 = subImage(sang,126,51,42,51);
        SC2 = subImage(sang,42,51,42,51);
        SC3 = subImage(sang,0,102,42,51);
        SD1 = subImage(sang,42,102,42,51);
        SD2 = subImage(sang,84,102,42,51);
        SD3 = subImage(sang,126,102,42,51);

        //精灵图 大Boss分图
        BOSSA1 = subImage(Boss,0,0,98,104);
        BOSSA2 = subImage(Boss,294,0,98,104);
        BOSSA3 = subImage(Boss,196,208,98,104);
        BOSSB1 = subImage(Boss,98,0,98,104);
        BOSSB2 = subImage(Boss,294,104,98,104);
        BOSSB3 = subImage(Boss,392,104,98,104);
        BOSSC1 = subImage(Boss,0,208,98,104);
        BOSSC2 = subImage(Boss,98,208,98,104);
        BOSSC3 = subImage(Boss,392,0,98,104);
        BOSSD1 = subImage(Boss,196,0,98,104);
        BOSSD2 = subImage(Boss,0,104,98,104);
        BOSSD3 = subImage(Boss,98,104,98,104);

        //精灵图 分割角色分图
        Aaa1 = subImage(brave,0,51,46,51);
        Aaa2 = subImage(brave,0,0,46,51);
        Aaa3 = subImage(brave,92,0,46,51);
        Abb1 = subImage(brave,138,51,46,51);
        Abb2 = subImage(brave,138,0,46,51);
        Abb3 = subImage(brave,0,102,46,51);
        Acc1 = subImage(brave,182,102,46,51);
        Acc2 = subImage(brave,182,0,46,51);
        Acc3 = subImage(brave,182,51,46,51);
        Add1 = subImage(brave,48,51,46,51);
        Add2 = subImage(brave,48,0,46,51);
        Add3 = subImage(brave,92,51,46,51);

        //精灵图 分割第二个角色
        Baa1 = subImage(brave1,90,51,45,51);
        Baa2 = subImage(brave1,45,0,45,51);
        Baa3 = subImage(brave1,0,51,45,51);
        Bbb1 = subImage(brave1,0,102,45,51);
        Bbb2 = subImage(brave1,135,0,45,51);
        Bbb3 = subImage(brave1,135,51,45,51);
        Bcc1 = subImage(brave1,180,102,45,51);
        Bcc2 = subImage(brave1,180,0,45,51);
        Bcc3 = subImage(brave1,180,51,45,51);
        Bdd1 = subImage(brave1,45,51,45,51);
        Bdd2 = subImage(brave1,0,0,45,51);
        Bdd3 = subImage(brave1,90,0,45,51);

        //精灵图 分割怪兽子弹
        AB1 = subImage(common_mst_bullet,0,0,54,54);
        AB2 = subImage(common_mst_bullet,54,0,54,54);
        AB3 = subImage(common_mst_bullet,108,0,54,54);
        AB4 = subImage(common_mst_bullet,0,54,54,54);
        AB5 = subImage(common_mst_bullet,54,54,54,54);

        //精灵图 分割boss子弹
        BOSSE1 = subImage(bossAtk,0,0,198,195);
        BOSSE2 = subImage(bossAtk,198,0,198,195);
        BOSSE3 = subImage(bossAtk,396,0,198,195);
        BOSSE4 = subImage(bossAtk,0,195,198,195);
        BOSSE5 = subImage(bossAtk,198,195,198,195);

        //精灵图 分割角色子弹之普通子弹
        CA1 = subImage(commonBullet,0,0,33,76);
        CA2 = subImage(commonBullet,41,0,33,76);
        CA3 = subImage(commonBullet,80,0,33,76);
        CB1 = subImage(commonBullet,111,0,76,33);
        CB2 = subImage(commonBullet,111,36,76,33);
        CB3 = subImage(commonBullet,0,90,76,33);
        CC1 = subImage(commonBullet,90,90,76,33);
        CC2 = subImage(commonBullet,0,127,76,33);
        CC3 = subImage(commonBullet,90,127,76,33);
        CD1 = subImage(commonBullet,200,0,33,76);
        CD2 = subImage(commonBullet,240,0,33,76);
        CD3 = subImage(commonBullet,0,165,33,76);

        //精灵图 分割角色子弹之冰霜子弹
        IA1 = subImage(iceBullet,0,0,78,174);
        IA2 = subImage(iceBullet,78,0,78,174);
        IA3 = subImage(iceBullet,467,0,78,174);
        IA4 = subImage(iceBullet,0,349,78,174);
        IB1 = subImage(iceBullet,141,0,174,78);
        IB2 = subImage(iceBullet,141,69,174,78);
        IB3 = subImage(iceBullet,67,332,174,78);
        IB4 = subImage(iceBullet,255,332,174,78);
        IC1 = subImage(iceBullet,0,189,174,78);
        IC2 = subImage(iceBullet,0,262,174,78);
        IC3 = subImage(iceBullet,69,403,174,78);
        IC4 = subImage(iceBullet,255,403,174,78);
        ID1 = subImage(iceBullet,333,0,78,174);
        ID2 = subImage(iceBullet,408,0,78,174);
        ID3 = subImage(iceBullet,544,0,78,174);
        ID4 = subImage(iceBullet,544,190,78,174);

        //精灵图 分割角色子弹之火焰子弹
        FA1 = subImage(fireBullet,0,0,65,162);
        FA2 = subImage(fireBullet,303,0,65,162);
        FA3 = subImage(fireBullet,371,0,65,162);
        FB1 = subImage(fireBullet,136,0,164,65);
        FB2 = subImage(fireBullet,66,162,164,65);
        FB3 = subImage(fireBullet,222,162,164,65);
        FC1 = subImage(fireBullet,136,70,164,65);
        FC2 = subImage(fireBullet,66,240,164,65);
        FC3 = subImage(fireBullet,223,240,164,65);
        FD1 = subImage(fireBullet,66,0,65,164);
        FD2 = subImage(fireBullet,0,162,65,162);
        FD3 = subImage(fireBullet,370,140,65,164);

        //精灵图  分割角色子弹之藤蔓子弹
        TA1 = subImage(caneBullet,15,0,60,114);
        TA2 = subImage(caneBullet,103,0,72,114);
        TA3 = subImage(caneBullet,192,0,72,114);
        TB1 = subImage(caneBullet,273,15,110,50);
        TB2 = subImage(caneBullet,0,135,108,57);
        TB3 = subImage(caneBullet,120,135,121,57);
        TC1 = subImage(caneBullet,270,102,127,57);
        TC2 = subImage(caneBullet,0,228,120,58);
        TC3 = subImage(caneBullet,122,228,130,57);
        TD1 = subImage(caneBullet,396,0,84,114);
        TD2 = subImage(caneBullet,400,118,66,122);
        TD3 = subImage(caneBullet,0,296,88,111);
    }

    //水平卷动
    public void moveHorizon(){
        //角色
        for (int i = 0; i < wallList.size(); i++) {
            if(actor.getX() >= 957){
                actor.setX(957);
            }
            if(actor1.getX() >= 957){
                actor1.setX(957);
            }
            if(actor.getX() <= 0){
                actor.setX(0);
            }
            if(actor1.getX() <= 0){
                actor1.setX(0);
            }
            if (actor.getX() >= 640 && actor.getX() <= 960) {
                if (x < -505) return;
                if(actor1.getX() >= 640 && actor1.getX() <= 960){
                    Config.ScollX -= actor.getSpeed();
                    x -= actor.getSpeed();
                    //人物卷动
                    actor.setX(actor.getX() - actor.getSpeed());
                    actor1.setX(actor1.getX() - actor.getSpeed());
                    //WS 怪兽卷动 这个函数需要改名字,另外 底下还有一个《 320 》 0，这是什么情况
                    for (int j = 0; j < monsters.size(); j++) {
                        monsters.get(j).setX(monsters.get(j).getX() - actor.getSpeed());
                    }
                    //墙
                    for (int j = 0; j < wallList.size(); j++) {
                        wallList.get(j).setX(wallList.get(j).getX() - actor.getSpeed());
                    }
                    //STOP
                    for (ItemDrop drop : dropO) {
                        drop.setX(drop.getX() - actor.getSpeed());
                    }
                    //物品
                    for (ItemDrop allconsumable : Allconsumables) {
                        allconsumable.setX(allconsumable.getX() - actor.getSpeed());
                    }
                    //敌方子弹卷动
                    for (int j = 0; j < Monster.bulletsMonster.size(); j++) {
                        Monster.bulletsMonster.get(j).setX(Monster.bulletsMonster.get(j).getX() - actor.getSpeed());
                    }
                    //人物子弹
                    for (int j = 0; j < Actor.bullets.size(); j++) {
                        Actor.bullets.get(j).setX(Actor.bullets.get(j).getX() - actor.getSpeed());
                    }
                }
            }else if (actor.getX() <= 320 && actor.getX() >= 0) {
                if (x > -5) return;
                if(actor1.getX() <= 320 && actor1.getX() >= 0){
                    Config.ScollX += actor.getSpeed();
                    x += actor.getSpeed();
                    //人物卷动
                    actor.setX(actor.getX() + actor.getSpeed());
                    actor1.setX(actor1.getX() + actor.getSpeed());
                    //怪物卷动
                    for (int j = 0; j < monsters.size(); j++) {
                        monsters.get(j).setX(monsters.get(j).getX() + actor.getSpeed());
                    }
                    //墙
                    for (int j = 0; j < wallList.size(); j++) {
                        wallList.get(j).setX(wallList.get(j).getX() + actor.getSpeed());
                    }
                    //STOP符卷动
                    for (ItemDrop drop : dropO) {
                        drop.setX(drop.getX() + actor.getSpeed());
                    }
                    //物品
                    for (ItemDrop allconsumable : Allconsumables) {
                        allconsumable.setX(allconsumable.getX() + actor.getSpeed());
                    }
                    //敌方子弹卷动
                    for (int j = 0; j < Monster.bulletsMonster.size(); j++) {
                        Monster.bulletsMonster.get(j).setX(Monster.bulletsMonster.get(j).getX() + actor.getSpeed());
                    }
                    //人物子弹
                    for (int j = 0; j < Actor.bullets.size(); j++) {
                        Actor.bullets.get(j).setX(Actor.bullets.get(j).getX() + actor.getSpeed());
                    }
                }
            }
        }
    }

    //垂直卷动
    public void moveVertical(){
        if(actor.getY() <= 0){
            actor.setY(0);
        }
        if(actor1.getY() <= 0){
            actor1.setY(0);
        }
        if(actor.getY() >= 738){
            actor.setY(738);
        }
        if(actor1.getY() >= 738){
            actor1.setY(738);
        }

        //角色1
        if (actor.getY() <= 188 && actor.getY() >= 0) {
            if (y > -5) return;
            if(actor.getY() <= 188 && actor.getY() >= 0){
                //地图卷动X
                Config.ScollY += actor.getSpeed();
                y += actor.getSpeed();
                //人物卷动
                actor.setY(actor.getY() + actor.getSpeed());
                actor1.setY(actor1.getY() + actor.getSpeed());
                //怪网格卷动物卷动
                for (int j = 0; j < monsters.size(); j++) {
                    monsters.get(j).setY(monsters.get(j).getY() + actor.getSpeed());
                }
                //墙
                for (int i = 0; i < wallList.size(); i++) {
                    wallList.get(i).setY(wallList.get(i).getY() + actor.getSpeed());
                }
                //STOP符卷动
                for (ItemDrop drop : dropO) {
                    drop.setY(drop.getY() + actor.getSpeed());
                }
                //物品
                for (ItemDrop allconsumable : Allconsumables) {
                    allconsumable.setY(allconsumable.getY() + actor.getSpeed());
                }
                //敌方子弹卷动
                for (int j = 0; j < Monster.bulletsMonster.size(); j++) {
                    Monster.bulletsMonster.get(j).setY(Monster.bulletsMonster.get(j).getY() + actor.getSpeed());
                }
                //人物子弹
                for (int j = 0; j < Actor.bullets.size(); j++) {
                    Actor.bullets.get(j).setY(Actor.bullets.get(j).getY() + actor.getSpeed());
                }
            }
        } else if (actor.getY() >= 458 && actor.getY() <= 610) {
            if (y < -742) return;
            if (actor1.getY() >= 458 && actor1.getY() <= 610){
                //地图卷动X
                Config.ScollY -= actor.getSpeed();
                y -= actor.getSpeed();
                //人物卷动
                actor.setY(actor.getY() - actor.getSpeed());
                actor1.setY(actor1.getY() - actor.getSpeed());
                //怪物卷动
                for (int j = 0; j < monsters.size(); j++) {
                    monsters.get(j).setY(monsters.get(j).getY() - actor.getSpeed());
                }
                //墙
                for (int i = 0; i < wallList.size(); i++) {
                    wallList.get(i).setY(wallList.get(i).getY() - actor.getSpeed());
                }
                //STOP符卷动
                for (ItemDrop drop : dropO) {
                    drop.setY(drop.getY() - actor.getSpeed());
                }
                //物品
                for (ItemDrop allconsumable : Allconsumables) {
                    allconsumable.setY(allconsumable.getY() - actor.getSpeed());
                }
                //敌方子弹卷动
                for (int j = 0; j < Monster.bulletsMonster.size(); j++) {
                    Monster.bulletsMonster.get(j).setY(Monster.bulletsMonster.get(j).getY() - actor.getSpeed());
                }
                //人物子弹
                for (int j = 0; j < Actor.bullets.size(); j++) {
                    Actor.bullets.get(j).setY(Actor.bullets.get(j).getY() - actor.getSpeed());
                }
            }
        }
    }

    //角色碰撞（stop，墙，道具）
    public void ActorandOther(){
        //墙
        actor.setActorL(false);
        actor.setActorR(false);
        actor.setActorU(false);
        actor.setActorD(false);
        //角色四个方向的提前预判（左 右 上 下 矩形块）
        Rectangle rectanglels = new Rectangle(actor.getRect().x - 5, actor.getRect().y, actor.getWidth(), actor.getHeight());
        Rectangle rectanglers = new Rectangle(actor.getRect().x + 5, actor.getRect().y, actor.getWidth(), actor.getHeight());
        Rectangle rectangleus = new Rectangle(actor.getRect().x, actor.getRect().y - 5, actor.getWidth(), actor.getHeight());
        Rectangle rectangleds = new Rectangle(actor.getRect().x, actor.getRect().y + 5, actor.getWidth(), actor.getHeight());
        //角色与墙体
        for (Square square : wallList) {
            if (rectanglels.intersects(square.getRect()))
                actor.setActorL(true);
            if (rectanglers.intersects(square.getRect()))
                actor.setActorR(true);
            if (rectangleus.intersects(square.getRect()))
                actor.setActorU(true);
            if (rectangleds.intersects(square.getRect()))
                actor.setActorD(true);
            //角色四个方向的提前预判（左 右 上 下 矩形块）
        }

        //stop
        for (ItemDrop drop : dropO) {
            if (rectanglels.intersects(drop.getRect()))
                actor.setActorL(true);
            if (rectanglers.intersects(drop.getRect()))
                actor.setActorR(true);
            if (rectangleus.intersects(drop.getRect()))
                actor.setActorU(true);
            if (rectangleds.intersects(drop.getRect()))
                actor.setActorD(true);
        }

        //道具
        for (int i = 0; i < Allconsumables.size(); i++) {
            if (Allconsumables.get(i).getRect().intersects(actor.getRect())) {
                Allconsumablesl.add(Allconsumables.get(i));
                if (Allconsumables.get(i).id == 1) {
                    dropA.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 2) {
                    dropB.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 3) {
                    dropC.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 4) {
                    dropD.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 5) {
                    dropE.add(Allconsumables.get(i));
                }
                Allconsumables.remove(i);
            }
        }

        if (Actor.bullets != null) {
            for (Bullet bullet : Actor.bullets) {
                //我方子弹与敌人碰撞
                for (Monster monster : this.monsters) {
                    if (bullet.getRect().intersects(monster.getRect())) {
                        //子弹消失
                        //1.角色普通攻击2.怪物普通攻击3.角色火焰4.角色寒冰5.角色藤曼
                        if (bullet.id == 2) {
                            monster.setActtackcount(1);
                            bullet.setVisible(false);
                            //怪物减去血量
                            monster.setLife(monster.getLife() - actor.getAtk());
                        } else if (bullet.id == 3) {
                            monster.setActtackcount(2);
//                            bullet.setVisible(false);
                            //怪物减去血量
                            monster.setLife(monster.getLife() - actor.getAtk());
                        } else if (bullet.id == 4) {
                            monster.setActtackcount(3);
//                            bullet.setVisible(false);
                            //怪物减去血量
                            monster.setLife(monster.getLife() - actor.getAtk());
                        } else if (bullet.id == 5) {
                            monster.setActtackcount(4);
//                            bullet.setVisible(false);
                            //怪物减去血量
                            monster.setLife(monster.getLife() - actor.getAtk());
                        }
                        break;
                    }
                }
                //我方子弹与墙体碰撞
                for (Square square : wallList) {
                    if (bullet.getRect().intersects(square.getRect())) {
                        bullet.setVisible(false);
                        break;
                    }
                }
            }
        }

        //角色2
        //墙
        actor1.setActorL(false);
        actor1.setActorR(false);
        actor1.setActorU(false);
        actor1.setActorD(false);
        //角色四个方向的提前预判（左 右 上 下 矩形块）
        Rectangle rectanglels1= new Rectangle(actor1.getRect().x - 5, actor1.getRect().y, actor1.getWidth(), actor1.getHeight());
        Rectangle rectanglers1 = new Rectangle(actor1.getRect().x + 5, actor1.getRect().y, actor1.getWidth(), actor1.getHeight());
        Rectangle rectangleus1 = new Rectangle(actor1.getRect().x, actor1.getRect().y - 5, actor1.getWidth(), actor1.getHeight());
        Rectangle rectangleds1 = new Rectangle(actor1.getRect().x, actor1.getRect().y + 5, actor1.getWidth(), actor1.getHeight());
        //角色与墙体
        for (Square square : wallList) {
            if (rectanglels1.intersects(square.getRect()))
                actor1.setActorL(true);
            if (rectanglers1.intersects(square.getRect()))
                actor1.setActorR(true);
            if (rectangleus1.intersects(square.getRect()))
                actor1.setActorU(true);
            if (rectangleds1.intersects(square.getRect()))
                actor1.setActorD(true);
            //角色四个方向的提前预判（左 右 上 下 矩形块）
        }

        //stop
        for (ItemDrop drop : dropO) {
            if (rectanglels1.intersects(drop.getRect()))
                actor1.setActorL(true);
            if (rectanglers1.intersects(drop.getRect()))
                actor1.setActorR(true);
            if (rectangleus1.intersects(drop.getRect()))
                actor1.setActorU(true);
            if (rectangleds1.intersects(drop.getRect()))
                actor1.setActorD(true);
        }

        //道具
        for (int i = 0; i < Allconsumables.size(); i++) {
            if (Allconsumables.get(i).getRect().intersects(actor1.getRect())) {
                Allconsumablesl.add(Allconsumables.get(i));
                if (Allconsumables.get(i).id == 1) {
                    dropA.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 2) {
                    dropB.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 3) {
                    dropC.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 4) {
                    dropD.add(Allconsumables.get(i));
                } else if (Allconsumables.get(i).id == 5) {
                    dropE.add(Allconsumables.get(i));
                }
                Allconsumables.remove(i);
            }
        }

    }

    //怪兽碰
    public void MonsterandActor(){
        //敌人碰撞
        for (Monster monster1 : monsters) {
            //每一个敌人状态重置
            monster1.Orientationl = false;
            monster1.Orientationr = false;
            monster1.Orientationu = false;
            monster1.Orientationd = false;
            //敌人四个方向的提前预判（左 右 上 下 矩形块）
            Rectangle rectanglel = new Rectangle(monster1.getRect().x - 5, monster1.getRect().y, monster1.getWidth(), monster1.getHeight());
            Rectangle rectangler = new Rectangle(monster1.getRect().x + 5, monster1.getRect().y, monster1.getWidth(), monster1.getHeight());
            Rectangle rectangleu = new Rectangle(monster1.getRect().x, monster1.getRect().y - 5, monster1.getWidth(), monster1.getHeight());
            Rectangle rectangled = new Rectangle(monster1.getRect().x, monster1.getRect().y + 5, monster1.getWidth(), monster1.getHeight());
            //敌人与墙发生碰撞就切换敌人状态为移动，计时器清零操作没有完成
            for (Square square : wallList) {
                if (rectanglel.intersects(square.getRect())) {
                    monster1.setOrientationl(true);
                    monster1.setRadom(random.nextInt(4));
                }
                if (rectangler.intersects(square.getRect())) {
                    monster1.setOrientationr(true);
                    monster1.setRadom(random.nextInt(4));
                }
                if (rectangleu.intersects(square.getRect())) {
                    monster1.setOrientationu(true);
                    monster1.setRadom(random.nextInt(4));
                }
                if (rectangled.intersects(square.getRect())) {
                    monster1.setOrientationd(true);
                    monster1.setRadom(random.nextInt(4));
                }
            }
            //敌人与角色1
            if (rectanglel.intersects(actor.getRect()))
                monster1.setOrientationl(true);
            if (rectangler.intersects(actor.getRect()))
                monster1.setOrientationr(true);
            if (rectangleu.intersects(actor.getRect()))
                monster1.setOrientationu(true);
            if (rectangled.intersects(actor.getRect()))
                monster1.setOrientationd(true);

            //敌人与角色2
            if (rectanglel.intersects(actor1.getRect()))
                monster1.setOrientationl(true);
            if (rectangler.intersects(actor1.getRect()))
                monster1.setOrientationr(true);
            if (rectangleu.intersects(actor1.getRect()))
                monster1.setOrientationu(true);
            if (rectangled.intersects(actor1.getRect()))
                monster1.setOrientationd(true);
        }

        //角色1与敌人
        for (Monster monster1 : monsters) {
            Rectangle rectangleAMls = new Rectangle(actor.getRect().x - 5, actor.getRect().y, actor.getWidth(), actor.getHeight());
            Rectangle rectangleAMrs = new Rectangle(actor.getRect().x + 5, actor.getRect().y, actor.getWidth(), actor.getHeight());
            Rectangle rectangleAMus = new Rectangle(actor.getRect().x, actor.getRect().y - 6, actor.getWidth(), actor.getHeight());
            Rectangle rectangleAMds = new Rectangle(actor.getRect().x, actor.getRect().y + 6, actor.getWidth(), actor.getHeight());

            if (rectangleAMls.intersects(monster1.getRect()))
                actor.setActorL(true);
            if (rectangleAMrs.intersects(monster1.getRect()))
                actor.setActorR(true);
            if (rectangleAMus.intersects(monster1.getRect()))
                actor.setActorU(true);
            if (rectangleAMds.intersects(monster1.getRect()))
                actor.setActorD(true);
        }

        //角色2与敌人
        for (Monster monster1 : monsters) {
            Rectangle rectangleAMls = new Rectangle(actor1.getRect().x - 5, actor1.getRect().y, actor1.getWidth(), actor1.getHeight());
            Rectangle rectangleAMrs = new Rectangle(actor1.getRect().x + 5, actor1.getRect().y, actor1.getWidth(), actor1.getHeight());
            Rectangle rectangleAMus = new Rectangle(actor1.getRect().x, actor1.getRect().y - 6, actor1.getWidth(), actor1.getHeight());
            Rectangle rectangleAMds = new Rectangle(actor1.getRect().x, actor1.getRect().y + 6, actor1.getWidth(), actor1.getHeight());

            if (rectangleAMls.intersects(monster1.getRect()))
                actor1.setActorL(true);
            if (rectangleAMrs.intersects(monster1.getRect()))
                actor1.setActorR(true);
            if (rectangleAMus.intersects(monster1.getRect()))
                actor1.setActorU(true);
            if (rectangleAMds.intersects(monster1.getRect()))
                actor1.setActorD(true);
        }

        //遍历特效子弹
        //敌人所有子弹与角色的碰撞
        if (Monster.bulletsMonster != null) {
            //角色1
            for (Bullet bullet1 : Monster.bulletsMonster) {
                if (bullet1.getRect().intersects(actor.getRect())) {
                    //子弹消失
                    //actor.setActorbeat(1);
                    bullet1.setVisible(false);
                    config.HP -= bullet1.getatk();
                }
            }
            //角色2
            for (Bullet bullet1 : Monster.bulletsMonster) {
                if (bullet1.getRect().intersects(actor1.getRect())) {
                    //子弹消失
                    //actor.setActorbeat(1);
                    bullet1.setVisible(false);
                    config.HP1 -= bullet1.getatk();
                }
            }
            //敌人子弹与墙体
            for (Bullet bullet1 : Monster.bulletsMonster) {
                for (Square square : wallList) {
                    if (bullet1.getRect().intersects(square.getRect())) {
                        //子弹消失
                        if (bullet1.id == 4) {
                            break;
                        } else if (bullet1.id != 4) {
                            bullet1.setVisible(false);
                        }
                    }
                }
            }
        }
    }

    //画怪兽 WS
    public void drawMonster(){
        //第一关怪物绘制
        if(dropD.size() == 0){
            if(monsters.size() != 0){
                for(int i = 0; i < monsters.size(); i++){
                    drawImage(monsters.get(i).image, monsters.get(i).getX(),monsters.get(i).getY());
                    monsters.get(i).ai();
                    monsters.get(i).move();
                    changeColor(Color.blue);
                    drawRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, 40, 2);
                    changeColor(Color.red);
                    drawSolidRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, (int) (monsters.get(i).getLife() * 0.2), 3);
                }
            }
        }
        //第二关怪物绘制
        if (dropD.size() == 1){
            if(monsters.size() != 0){
                for(int i = 0; i < monsters.size(); i++){
                    drawImage(monsters.get(i).image, monsters.get(i).getX(),monsters.get(i).getY());
                    monsters.get(i).ai();
                    if (monsters.get(i).id == 2) {
                        monsters.get(i).Smove();
                    } else if (monsters.get(i).id == 1) {
                        monsters.get(i).move();
                    }
                    changeColor(Color.blue);
                    if (monsters.get(i).id == 2) {
                        drawRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, 60, 2);
                    } else if (monsters.get(i).id == 1) {
                        drawRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, 40, 2);
                    }
                    changeColor(Color.red);
                    drawSolidRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, (int) (monsters.get(i).getLife() * 0.2), 3);
                }
            }
        }
        //第三关绘制
        if (dropD.size() == 2){
            if(monsters.size() != 0){
                for(int i = 0; i < monsters.size(); i++){
                    drawImage(monsters.get(i).image, monsters.get(i).getX(),monsters.get(i).getY());
                    monsters.get(i).ai();
                    monsters.get(i).Smove();
                    changeColor(Color.blue);
                    drawRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, 60, 2);
                    changeColor(Color.red);
                    drawSolidRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, (int) (monsters.get(i).getLife() * 0.2), 3);
                }
            }
        }
        //第四关绘制
        if (dropD.size() == 3){
            drawImage(IMGBK,0,0);
            if(monsters.size() != 0){
                for(int i = 0; i < monsters.size(); i++){
                    if(monsters.get(i).id == 2){
                        drawImage(monsters.get(i).image, monsters.get(i).getX(),monsters.get(i).getY());
                    }
                    if(monsters.get(i).id == 3){
                        drawImage(monsters.get(i).image1, monsters.get(i).getX(),monsters.get(i).getY());
                    }
                    monsters.get(i).ai();
                    if(monsters.get(i).id == 2){
                        monsters.get(i).Smove();
                    }
                    if(monsters.get(i).id == 3){
                        monsters.get(i).Boss_move();
                    }
                    changeColor(Color.blue);
                    if (monsters.get(i).id == 2) {
                        drawRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, 60, 2);
                    } else if (monsters.get(i).id == 3) {
                        drawRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, 200, 2);
                    }
                    changeColor(Color.red);
                    drawSolidRectangle(monsters.get(i).getX() - 2, monsters.get(i).getY() - 8, (int) (monsters.get(i).getLife() * 0.2), 3);
                }
            }
        }
    }

    //画禁止
    public void drawStop(){
        //遍历钥匙 对对禁止进行删除
        //禁止
        for (int k = 0; k < dropO.size(); k++) {
            for (int j = 0; j < dropD.size(); j++) {
                if (dropO.get(k).uid == dropD.get(j).uid) {
                    dropO.remove(k);
                    return;
                }
            }
        }

        for (ItemDrop drop : dropO){
            drawImage(stop, drop.getX(), drop.getY());
        }
    }

    //画血条和蓝条
    public void drawHPMP(){
        if (Config.HP > 0){
            //1血条 起始200（最大）
            changeColor(red);
            drawText(20, 30, "P1_HP : ", 15);
            drawRectangle( 20, 35,200,10);
            drawSolidRectangle(20,35, Config.HP,10);//把config里面的数变了
            drawText(230, 47, Config.HP + " / 200.0", 15);

            //1蓝条 起始200（最大）
            changeColor(blue);
            drawText(20, 75, "P1_MP : ", 15);
            drawRectangle( 20, 80,200,10);
            drawSolidRectangle(20,80, Config.MP,10);
            drawText(230, 92, Config.MP + " / 200.0", 15);
        } else {
            //1血条 起始200（最大）
            changeColor(red);
            drawText(20, 30, "P1_HP : ", 15);
            drawRectangle( 20, 35,200,10);
            drawSolidRectangle(20,35, 0,10);//把config里面的数变了
            drawText(230, 47, 0 + " / 200.0", 15);

            //1蓝条 起始200（最大）
            Config.MP = 0;
            changeColor(blue);
            drawText(20, 75, "P1_MP : ", 15);
            drawRectangle( 20, 80,200,10);
            drawSolidRectangle(20,80, 0,10);
            drawText(230, 92, 0 + " / 200.0", 15);
        }

        if (Config.HP1 > 0){
            //2血条 起始200（最大）
            changeColor(red);
            drawText(20, 120, "P2_HP : ", 15);
            drawRectangle( 20, 125,200,10);
            drawSolidRectangle(20,125, Config.HP1,10);//把config里面的数变了
            drawText(230, 137, Config.HP1 + " / 200.0", 15);

            //2蓝条 起始200（最大）
            changeColor(blue);
            drawText(20, 165, "P2_MP : ", 15);
            drawRectangle( 20, 170,200,10);
            drawSolidRectangle(20,170, Config.MP1,10);
            drawText(230, 182, Config.MP1 + " / 200.0", 15);
        } else {
            //2血条 起始200（最大）
            changeColor(red);
            drawText(20, 120, "P2_HP : ", 15);
            drawRectangle( 20, 125,200,10);
            drawSolidRectangle(20,125, 0,10);//把config里面的数变了
            drawText(230, 137, 0 + " / 200.0", 15);

            //2蓝条 起始200（最大）
            changeColor(blue);
            drawText(20, 165, "P2_MP : ", 15);
            drawRectangle( 20, 170,200,10);
            drawSolidRectangle(20,170, 0,10);
            drawText(230, 182, 0 + " / 200.0", 15);
        }

        if (Config.HP <= 0 && Config.HP1 <= 0 && theLose){
            createGame(new Lose());
            mFrame.setVisible(false);
            stopAudioLoop(backgroundMusic);
            theLose = false;
        }

        if (Config.HP <= 0){
            Config.MP = 0;
            actor.setX(actor1.getX());
            actor.setY(actor1.getY());
        }

        if (Config.HP1 <= 0){
            Config.MP1 = 0;
            actor1.setX(actor.getX());
            actor1.setY(actor.getY());
        }
    }

    //WS 画角色
    public void drawActor(){
        if (Config.HP > 0){
            drawImage(actor.image, actor.getX(), actor.getY());
            actor.move();
            changeColor(Color.white);
            drawText(actor.getX() + 8, actor.getY() - 8, "P1", 15);
        }
    }

    public void drawActor1(){
        if (Config.HP1 > 0){
            drawImage(actor1.image1, actor1.getX(), actor1.getY());
            actor1.move1();
            changeColor(Color.white);
            drawText(actor1.getX() + 8, actor1.getY() - 8, "P2", 15);
        }
    }

    //WS 画子弹喽，先来怪兽的
    public void drawMonsterBullet() {
        for (Bullet bullet : Monster.bulletsMonster) {
                if(bullet.id == 1){
                    bullet.move(bullet.direction, 1);
                    drawImage(bullet.image, bullet.getX(), bullet.getY());
                }
                if(bullet.id == 6){
                    bullet.move(bullet.direction, 6);
                    drawImage(bullet.image2, bullet.getX(), bullet.getY());
                }

        }
        //遍历所有子弹 将子弹还原至对象池  1. 碰撞墙体  2.打击敌人
        for (int i = 0; i < Monster.bulletsMonster.size(); i++) {
            if (!Monster.bulletsMonster.get(i).isVisible()) {
                BulletsPool.theReturn(Monster.bulletsMonster.remove(i));
            }
        }
    }

    //角色普通子弹
    public void drawActorCommonBullet(){
        for (Bullet bullet : Actor.bullets) {
            if(bullet.id == 2){
                bullet.move(bullet.direction, 2);
                drawImage(bullet.image1, bullet.getX(), bullet.getY());
            }else if(bullet.id == 3){
                bullet.move(bullet.direction, 3);
                drawImage(bullet.image1, bullet.getX(), bullet.getY());
            }else if(bullet.id == 4){
                bullet.move(bullet.direction, 4);
                drawImage(bullet.image1, bullet.getX(), bullet.getY());
            }else if(bullet.id == 5){
                bullet.move(bullet.direction, 5);
                drawImage(bullet.image1, bullet.getX(), bullet.getY());
            }

        }
        //遍历所有的子弹 将子弹还原至对象池分为两种状态  1.消失窗体外  2.与人物的碰撞检测  3.与墙体的碰撞检测
        for (int i = 0; i < actor.bullets.size(); i++) {
            if (!actor.bullets.get(i).isVisible()) {
                BulletsPool.theReturn(actor.bullets.remove(i));
            }
        }
    }

    //怪物消失
    public void remove() {
        for (int i = 0; i < monsters.size(); i++) {
            if (monsters.get(i).getLife() < 1) {
                int X = monsters.get(i).getX();
                int Y = monsters.get(i).getY();
                //怪物随机掉落
                switch (random.nextInt(3)) {
                    case 0:
                        //面包
                        Allconsumables.add(new ItemDrop(X, Y, 32, 32, 15, 15, 1, 0, Bread, rectangle));
                        break;
                    case 1:
                        //血瓶
                        Allconsumables.add(new ItemDrop(X, Y, 32, 32, 15, 15, 2, 0, HP_bottle, rectangle));
                        break;
                    case 2:
                        //蓝瓶
                        Allconsumables.add(new ItemDrop(X, Y, 32, 32, 15, 15, 3, 0, MP_bottle, rectangle));
                        break;
                }
                monsters.remove(i);

                //钥匙掉落
                switch (dropD.size()) {
                    case 0:
                        if (monsters.size() < 1) {
                            Allconsumables.add(new ItemDrop(1280 + Config.ScollX, 450 + Config.ScollY, 32, 32, 15, 15, 4, 1, 1, Key, rectangle));
                        }
                        break;
                    case 1:
                        if (monsters.size() < 1) {
                            Allconsumables.add(new ItemDrop(620 + Config.ScollX, -100 + Config.ScollY, 32, 32, 15, 15, 4, 2, 2, Key, rectangle));
                        }
                        break;
                    case 2:
                        if (monsters.size() < 1) {
                            Allconsumables.add(new ItemDrop(140 + Config.ScollX, -765 + Config.ScollY, 32, 32, 15, 15, 4, 3, 3, Key, rectangle));
                        }
                        break;
                    case 3:
                        if (monsters.size() < 1) {
                            Allconsumables.add(new ItemDrop(1050 + Config.ScollX, -680 + Config.ScollY, 32, 32, 15, 15, 5, 1, 1, princess, rectangle));
                        }
                        break;
                }

            }
        }
    }

    //怪物更新
    public void updateMonster(){
        if(dropD.size() == 0 && theOne){
            for(int i = 0; i < 7; i++){
                monsters.add(new Monster(400+ Config.ScollX + rand(6) * 45, 250 + Config.ScollY + rand(6) * 35,48, 50, rectangle, 200, 5, Direction.DOWN,1));
            }
            theOne = false;
            theTwo = true;
        } else if(dropD.size() == 1 && theTwo){
            for(int i = 0; i < 4; i++){
                monsters.add(new Monster(750+ Config.ScollX + rand(6) * 45, -250 + Config.ScollY + rand(6) * 35,48, 50, rectangle, 200, 5, Direction.DOWN,1));
            }
            for(int i = 0; i < 4; i++){
                monsters.add(new Monster(750 + Config.ScollX + random.nextInt(6) * 45, -250 + Config.ScollY + random.nextInt(5) * 30, 32, 30, rectangle, 300, 10, Direction.DOWN,  2));
            }
            theTwo = false;
            theThree = true;
        } else if(dropD.size() == 2 && theThree){
            for(int i = 0; i < 8; i++){
                monsters.add(new Monster(200+ Config.ScollX + rand(6) * 45, -500 + Config.ScollY + rand(6) * 35,48, 50, rectangle, 300, 10, Direction.DOWN,2));
            }
            theThree = false;
            theFour = true;
        } else if(dropD.size() == 3 && theFour){
            for(int i = 0; i < 5; i++){
                monsters.add(new Monster(900+ Config.ScollX + rand(6) * 45, -700 + Config.ScollY + rand(6) * 35,48, 50, rectangle, 300, 10, Direction.DOWN,2));
            }
            monsters.add(new Monster(960 + Config.ScollX + random.nextInt(5) * 45, -850+ Config.ScollY + random.nextInt(5) * 25, 98, 104, rectangle, 1000, 50, Direction.RIGHT, 3));
            theFour = false;
        }
    }

    //公主更新
    public void updatePrincess(){
        if(dropE.size() == 1 && thePrincess){
            createGame(new Win());
            mFrame.setVisible(false);
            stopAudioLoop(backgroundMusic);
            thePrincess = false;
        }
    }

    @Override
    public void update(double dt) {
        //把前面删了移到这里来了，原来在updateActor里面,把updateActor删除了
        //角色碰撞
        ActorandOther();
        //水平卷动
        moveHorizon();
        //垂直卷动
        moveVertical();
        //怪兽碰撞
        MonsterandActor();
        //怪兽移除
        remove();
        updateMonster();

        updatePrincess();
    }

    @Override
    public void paintComponent() {
        drawImage(GameBg, x, y);
        drawImage(GameBg2, x, y);

        //WS 画出怪兽
        drawMonster();
        drawMonsterBullet();

        drawActor();
        drawActor1();

        //角色子弹
        drawActorCommonBullet();

        //stop符
        drawStop();

        //画道具
        for (ItemDrop drop : Allconsumables) {
            drawImage(drop.getImage(), drop.getX(), drop.getY());
        }

        drawImage(tree, x, y);
        //技能栏
        drawImage(Skill_bar, 50, 350);
        drawHPMP();
        //面包数量
        changeColor(white);
        drawText(105.0, 695.0, "Space/J", 20);
        drawText(180.0, 735.0, "4/B", 20);
        drawText(175.0, 760.0, "* " + dropA.size(), 15);
        //血瓶数量
        drawText(225.0, 735.0, "5/N", 20);
        drawText(220.0, 760.0, "* " + dropB.size(), 15);
        //蓝瓶数量
        drawText(270.0, 735.0, "6/M", 20);
        drawText(265.0, 760.0, "* " + dropC.size(), 15);
        //钥匙数量
        drawText(515.0, 760.0, "* " + dropD.size() + "/3", 20);
        drawText(785.0, 730.0, "1/I", 20);
        drawText(845.0, 730.0, "2/O", 20);
        drawText(910.0, 730.0, "3/P", 20);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key) {
            case KeyEvent.VK_LEFT:
                actor.pressedLeft = true;
                actor.direction = Direction.LEFT;
                break;
            case KeyEvent.VK_DOWN:
                actor.pressedDown = true;
                actor.direction = Direction.DOWN;
                break;
            case KeyEvent.VK_RIGHT:
                actor.pressedRight = true;
                actor.direction = Direction.RIGHT;
                break;
            case KeyEvent.VK_UP:
                actor.pressedUp = true;
                actor.direction = Direction.UP;
                break;
            case KeyEvent.VK_W:
                actor1.pressedW = true;
                actor1.direction = Direction.UP;
                break;
            case KeyEvent.VK_A:
                actor1.pressedA = true;
                actor1.direction = Direction.LEFT;
                break;
            case KeyEvent.VK_S:
                actor1.pressedS = true;
                actor1.direction = Direction.DOWN;
                break;
            case KeyEvent.VK_D:
                actor1.pressedD = true;
                actor1.direction = Direction.RIGHT;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key) {
            case KeyEvent.VK_LEFT:
                actor.pressedLeft = false;
                break;
            case KeyEvent.VK_DOWN:
                actor.pressedDown = false;
                break;
            case KeyEvent.VK_RIGHT:
                actor.pressedRight = false;
                break;
            case KeyEvent.VK_UP:
                actor.pressedUp = false;
                break;
            case KeyEvent.VK_A:
                actor1.pressedA = false;
                break;
            case KeyEvent.VK_W:
                actor1.pressedW = false;
                break;
            case KeyEvent.VK_S:
                actor1.pressedS = false;
                break;
            case KeyEvent.VK_D:
                actor1.pressedD = false;
                break;
            case KeyEvent.VK_SPACE:
                if(Config.HP > 0){
                    actor.ACTOR_fire();
                }
                break;
            case KeyEvent.VK_J:
                if(Config.HP1 > 0){
                    actor1.ACTOR_fire();
                }
                break;
            case KeyEvent.VK_I:
                if(Config.MP1 > 15) {
                    actor1.Flame_fire();
                    Config.MP1 -= 15;
                }
                break;
            case KeyEvent.VK_O:
                if(Config.MP1 > 15) {
                    actor1.Ice_fire();
                    Config.MP1 -= 15;
                }
                break;
            case KeyEvent.VK_P:
                if(Config.MP1 > 25) {
                    actor1.Creeper_fire();
                    Config.MP1 -= 25;
                }
                break;
            case KeyEvent.VK_B:
                if(Config.HP1 > 0){
                    actor1.Four1();
                }
                break;
            case KeyEvent.VK_N:
                if(Config.HP1 > 0){
                    actor1.Five1();
                }
                break;
            case KeyEvent.VK_M:
                if(Config.HP1 > 0){
                    actor1.Six1();
                }
                break;
            case KeyEvent.VK_1:
            case KeyEvent.VK_NUMPAD1:
                if(Config.MP > 15) {
                    actor.Flame_fire();
                    Config.MP -= 15;
                }
                break;
            case KeyEvent.VK_2:
            case KeyEvent.VK_NUMPAD2:
                if(Config.MP > 15) {
                    actor.Ice_fire();
                    Config.MP -= 15;
                }
                break;
            case KeyEvent.VK_3:
            case KeyEvent.VK_NUMPAD3:
                if(Config.MP > 25) {
                    actor.Creeper_fire();
                    Config.MP -= 25;
                }
                break;
            case KeyEvent.VK_4:
            case KeyEvent.VK_NUMPAD4:
                if(Config.HP > 0){
                    actor.Four();
                }
                break;
            case KeyEvent.VK_5:
            case KeyEvent.VK_NUMPAD5:
                if(Config.HP > 0){
                    actor.Five();
                }
                break;
            case KeyEvent.VK_6:
            case KeyEvent.VK_NUMPAD6:
                if(Config.HP > 0){
                    actor.Six();
                }
                break;
        }
    }

}
