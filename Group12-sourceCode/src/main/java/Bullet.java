import java.awt.*;

public class Bullet extends GameObject{
    public int atk = 5;
    public Direction direction;

    //我方子弹状态是否可见飞出屏幕
    public boolean visible = true;
    public int speed;
    public int id;
    public double degree;
    Image image = Toolkit.getDefaultToolkit().getImage("picture/monsterBullet.png");

    Image image1 = Toolkit.getDefaultToolkit().getImage("picture/monsterBullet.png");
    Image image2 = Toolkit.getDefaultToolkit().getImage("picture/boss_atk_1.png");
    public Bullet() {
        degree = Math.random()*Math.PI*2;
    }

    private void ChangeImg(int dir){
        switch (dir){
            case 1:
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameAA >= 0 && Easy_bg.frameAA < 8){
                        image = Easy_bg.AB1;
                        Easy_bg.frameAA++;
                    }
                    if(Easy_bg.frameAA >= 8 && Easy_bg.frameAA < 16){
                        image = Easy_bg.AB2;
                        Easy_bg.frameAA++;
                    }
                    if(Easy_bg.frameAA >= 16 && Easy_bg.frameAA < 24){
                        image = Easy_bg.AB3;
                        Easy_bg.frameAA++;
                    }
                    if(Easy_bg.frameAA >= 24 && Easy_bg.frameAA < 32){
                        image = Easy_bg.AB4;
                        Easy_bg.frameAA++;
                    }
                    if(Easy_bg.frameAA >= 32 && Easy_bg.frameAA < 40){
                        image = Easy_bg.AB5;
                        Easy_bg.frameAA++;
                    }
                    if(Easy_bg.frameAA == 40){
                        Easy_bg.frameAA = 0;
                    }
                }

//HARD
                if(SelectMode.Mode == 2){
                    if(Hard.frameAA >= 0 && Hard.frameAA < 8){
                        image = Hard.AB1;
                        Hard.frameAA++;
                    }
                    if(Hard.frameAA >= 8 && Hard.frameAA < 16){
                        image = Hard.AB2;
                        Hard.frameAA++;
                    }
                    if(Hard.frameAA >= 16 && Hard.frameAA < 24){
                        image = Hard.AB3;
                        Hard.frameAA++;
                    }
                    if(Hard.frameAA >= 24 && Hard.frameAA < 32){
                        image = Hard.AB4;
                        Hard.frameAA++;
                    }
                    if(Hard.frameAA >= 32 && Hard.frameAA < 40){
                        image = Hard.AB5;
                        Hard.frameAA++;
                    }
                    if(Hard.frameAA == 40){
                        Hard.frameAA = 0;
                    }
                }

                if(SelectMode.Mode == 3){
                    if(Double.frameAA >= 0 && Double.frameAA < 8){
                        image = Double.AB1;
                        Double.frameAA++;
                    }
                    if(Double.frameAA >= 8 && Double.frameAA < 16){
                        image = Double.AB2;
                        Double.frameAA++;
                    }
                    if(Double.frameAA >= 16 && Double.frameAA < 24){
                        image = Double.AB3;
                        Double.frameAA++;
                    }
                    if(Double.frameAA >= 24 && Double.frameAA < 32){
                        image = Double.AB4;
                        Double.frameAA++;
                    }
                    if(Double.frameAA >= 32 && Double.frameAA < 40){
                        image = Double.AB5;
                        Double.frameAA++;
                    }
                    if(Double.frameAA == 40){
                        Double.frameAA = 0;
                    }
                }

                break;
            //人物的普通子弹
            case 2:
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.CA1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.CA2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.CA3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.CA1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.CA2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.CA3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.CA1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.CA2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.CA3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                //普通子弹下

                break;
            case 3:
                //普通子弹左
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.CB1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.CB2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.CB3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.CB1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.CB2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.CB3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.CB1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.CB2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.CB3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                break;
            case 4:
                //普通子弹右
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.CC1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.CC2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.CC3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.CC1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.CC2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.CC3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.CC1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.CC2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.CC3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }

                break;
            case 5:
                //普通子弹上
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.CD1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.CD2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.CD3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.CD1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.CD2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.CD3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.CD1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.CD2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.CD3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                break;
                //冰霜子弹
            case 6:
                //冰霜子弹下
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJJ >= 0 && Easy_bg.frameJJ < 8){
                        image1 = Easy_bg.IA1;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 8 && Easy_bg.frameJJ < 16){
                        image1 = Easy_bg.IA2;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 16 && Easy_bg.frameJJ < 24){
                        image1 = Easy_bg.IA3;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 24 && Easy_bg.frameJJ < 32){
                        image1 = Easy_bg.IA4;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJJ == 32){
                        Easy_bg.frameJJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJJ >= 0 && Hard.frameJJ < 8){
                        image1 = Hard.IA1;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 8 && Hard.frameJJ < 16){
                        image1 = Hard.IA2;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 16 && Hard.frameJJ < 24){
                        image1 = Hard.IA3;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 24 && Hard.frameJJ < 32){
                        image1 = Hard.IA4;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJJ == 32){
                        Hard.frameJJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJJ >= 0 && Double.frameJJ < 8){
                        image1 = Double.IA1;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 8 && Double.frameJJ < 16){
                        image1 = Double.IA2;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 16 && Double.frameJJ < 24){
                        image1 = Double.IA3;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 24 && Double.frameJJ < 32){
                        image1 = Double.IA4;
                        Double.frameJ++;
                    }
                    if(Double.frameJJ == 32){
                        Double.frameJJ = 0;
                    }
                }

                break;
            case 7:
                //冰霜子弹左
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJJ >= 0 && Easy_bg.frameJJ < 8){
                        image1 = Easy_bg.IB1;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 8 && Easy_bg.frameJJ < 16){
                        image1 = Easy_bg.IB2;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 16 && Easy_bg.frameJJ < 24){
                        image1 = Easy_bg. IB3;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 24 && Easy_bg.frameJJ < 32){
                        image1 = Easy_bg.IB4;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ == 32){
                        Easy_bg.frameJJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJJ >= 0 && Hard.frameJJ < 8){
                        image1 = Hard.IB1;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 8 && Hard.frameJJ < 16){
                        image1 = Hard.IB2;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 16 && Hard.frameJJ < 24){
                        image1 = Hard.IB3;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 24 && Hard.frameJJ < 32){
                        image1 = Hard.IB4;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ == 32){
                        Hard.frameJJ = 0;
                    }
                }

                if(SelectMode.Mode == 3){
                    if(Double.frameJJ >= 0 && Double.frameJJ < 8){
                        image1 = Double.IB1;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 8 && Double.frameJJ < 16){
                        image1 = Double.IB2;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 16 && Double.frameJJ < 24){
                        image1 = Double.IB3;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 24 && Double.frameJJ < 32){
                        image1 = Double.IB4;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ == 32){
                        Double.frameJJ = 0;
                    }
                }

                break;
            case 8:
                //冰霜子弹右
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJJ >= 0 && Easy_bg.frameJJ < 8){
                        image1 = Easy_bg.IC1;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 8 && Easy_bg.frameJJ < 16){
                        image1 = Easy_bg.IC2;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 16 && Easy_bg.frameJJ < 24){
                        image1 = Easy_bg.IC3;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 24 && Easy_bg.frameJJ < 32){
                        image1 = Easy_bg.IC4;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ == 32){
                        Easy_bg.frameJJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJJ >= 0 && Hard.frameJJ < 8){
                        image1 = Hard.IC1;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 8 && Hard.frameJJ < 16){
                        image1 = Hard.IC2;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 16 && Hard.frameJJ < 24){
                        image1 = Hard.IC3;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 24 && Hard.frameJJ < 32){
                        image1 = Hard.IC4;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ == 32){
                        Hard.frameJJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJJ >= 0 && Double.frameJJ < 8){
                        image1 = Double.IC1;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 8 && Double.frameJJ < 16){
                        image1 = Double.IC2;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 16 && Double.frameJJ < 24){
                        image1 = Double.IC3;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 24 && Double.frameJJ < 32){
                        image1 = Double.IC4;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ == 32){
                        Double.frameJJ = 0;
                    }
                }
                break;
            case 9:
                //冰霜子弹上
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJJ >= 0 && Easy_bg.frameJJ < 8){
                        image1 = Easy_bg.ID1;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 8 && Easy_bg.frameJJ < 16){
                        image1 = Easy_bg.ID2;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 16 && Easy_bg.frameJJ < 24){
                        image1 = Easy_bg. ID3;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ >= 24 && Easy_bg.frameJJ < 32){
                        image1 = Easy_bg.ID4;
                        Easy_bg.frameJJ++;
                    }
                    if(Easy_bg.frameJJ == 32){
                        Easy_bg.frameJJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJJ >= 0 && Hard.frameJJ < 8){
                        image1 = Hard.ID1;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 8 && Hard.frameJJ < 16){
                        image1 = Hard.ID2;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 16 && Hard.frameJJ < 24){
                        image1 = Hard.ID3;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ >= 24 && Hard.frameJJ < 32){
                        image1 = Hard.ID4;
                        Hard.frameJJ++;
                    }
                    if(Hard.frameJJ == 32){
                        Hard.frameJJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJJ >= 0 && Double.frameJJ < 8){
                        image1 = Double.ID1;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 8 && Double.frameJJ < 16){
                        image1 = Double.ID2;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 16 && Double.frameJJ < 24){
                        image1 = Double.ID3;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ >= 24 && Double.frameJJ < 32){
                        image1 = Double.ID4;
                        Double.frameJJ++;
                    }
                    if(Double.frameJJ == 32){
                        Double.frameJJ = 0;
                    }
                }

                break;
                //火焰子弹
            case 10:
                //火焰子弹下
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.FA1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.FA2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.FA3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.FA1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.FA2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.FA3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.FA1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.FA2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.FA3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }

                break;
            case 11:
                //火焰子弹左
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.FB1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.FB2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.FB3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.FB1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.FB2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.FB3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.FB1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.FB2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.FB3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                break;
            case 12:
                //火焰子弹右
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.FC1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.FC2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.FC3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }

                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.FC1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.FC2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.FC3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.FC1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.FC2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.FC3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                break;
            case 13:
                //火焰子弹上
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.FD1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.FD2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.FD3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.FD1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.FD2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.FD3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.FD1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.FD2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.FD3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }

                break;
                //藤曼子弹
            case 14:
                //藤曼下
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.TA1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.TA2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.TA3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.TA1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.TA2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.TA3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.TA1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.TA2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.TA3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }

                break;
            case 15:
                //藤曼左
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.TB1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.TB2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.TB3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.TB1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.TB2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.TB3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.TB1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.TB2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.TB3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                break;
            case 16:
                //藤曼右
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.TC1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.TC2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.TC3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.TC1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.TC2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.TC3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.TC1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.TC2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.TC3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }

                break;
            case 17:
                //藤曼下
                if(SelectMode.Mode == 1){
                    if(Easy_bg.frameJ >= 0 && Easy_bg.frameJ < 8){
                        image1 = Easy_bg.TD1;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 8 && Easy_bg.frameJ < 16){
                        image1 = Easy_bg.TD2;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ >= 16 && Easy_bg.frameJ < 24){
                        image1 = Easy_bg.TD3;
                        Easy_bg.frameJ++;
                    }
                    if(Easy_bg.frameJ == 24){
                        Easy_bg.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 2){
                    if(Hard.frameJ >= 0 && Hard.frameJ < 8){
                        image1 = Hard.TD1;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 8 && Hard.frameJ < 16){
                        image1 = Hard.TD2;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ >= 16 && Hard.frameJ < 24){
                        image1 = Hard.TD3;
                        Hard.frameJ++;
                    }
                    if(Hard.frameJ == 24){
                        Hard.frameJ = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameJ >= 0 && Double.frameJ < 8){
                        image1 = Double.TD1;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 8 && Double.frameJ < 16){
                        image1 = Double.TD2;
                        Double.frameJ++;
                    }
                    if(Double.frameJ >= 16 && Double.frameJ < 24){
                        image1 = Double.TD3;
                        Double.frameJ++;
                    }
                    if(Double.frameJ == 24){
                        Double.frameJ = 0;
                    }
                }
                break;
            case 18:
                if(SelectMode.Mode == 2){
                    if(Hard.frameBossButton >= 0 && Hard.frameBossButton < 8){
                        image2 = Hard.BOSSE1;
                        Hard.frameBossButton++;
                    }
                    if(Hard.frameBossButton >= 8 && Hard.frameBossButton < 16){
                        image2 = Hard.BOSSE2;
                        Hard.frameBossButton++;
                    }
                    if(Hard.frameBossButton >= 16 && Hard.frameBossButton < 24){
                        image2 = Hard.BOSSE3;
                        Hard.frameBossButton++;
                    }
                    if(Hard.frameBossButton >= 24 && Hard.frameBossButton < 32){
                        image2 = Hard.BOSSE4;
                        Hard.frameBossButton++;
                    }
                    if(Hard.frameBossButton >= 32 && Hard.frameBossButton < 40){
                        image2 = Hard.BOSSE5;
                        Hard.frameBossButton++;
                    }
                    if(Hard.frameBossButton == 40){
                        Hard.frameBossButton = 0;
                    }
                }
                if(SelectMode.Mode == 3){
                    if(Double.frameBossButton >= 0 && Double.frameBossButton < 8){
                        image2 = Double.BOSSE1;
                        Double.frameBossButton++;
                    }
                    if(Double.frameBossButton >= 8 && Double.frameBossButton < 16){
                        image2 = Double.BOSSE2;
                        Double.frameBossButton++;
                    }
                    if(Double.frameBossButton >= 16 && Double.frameBossButton < 24){
                        image2 = Double.BOSSE3;
                        Double.frameBossButton++;
                    }
                    if(Double.frameBossButton >= 24 && Double.frameBossButton <= 32){
                        image2 = Double.BOSSE4;
                        Double.frameBossButton++;
                    }
                    if(Double.frameBossButton >= 32 && Double.frameBossButton <= 40){
                        image2 = Double.BOSSE5;
                        Double.frameBossButton++;
                    }
                    if(Double.frameBossButton == 40){
                        Double.frameBossButton = 0;
                    }
                }
                break;
        }
    }



    //子弹移动
    public void move(Direction direction,int id){
        //怪兽普通子弹
        if(id == 1){
            ChangeImg(1);
            switch (direction) {
                case DOWN:
                    y += speed;
                    if (y > 640) this.visible = false;
                    break;
                case UP:
                    y -= speed;
                    if (y < 0)
                        this.visible = false;
                    break;
                case RIGHT:
                    x += speed;
                    if (x > 960)
                        this.visible = false;
                    break;
                case LEFT:
                    x -= speed;
                    if (x < 0)
                        this.visible = false;
                    break;
            }
        }//角色的普通子弹
        else if(id == 2){
            switch (direction) {
                case DOWN:
                    ChangeImg(2);
                    y += speed;
                    if (y > 640) this.visible = false;
                    break;
                case UP:
                    ChangeImg(5);
                    y -= speed;
                    if (y < 0)
                        this.visible = false;
                    break;
                case RIGHT:
                    ChangeImg(4);
                    x += speed;
                    if (x > 960)
                        this.visible = false;
                    break;
                case LEFT:
                    ChangeImg(3);
                    x -= speed;
                    if (x < 0)
                        this.visible = false;
                    break;
            }//角色火焰子弹
        }else if(id == 3){
            switch (direction) {
                case DOWN:
                    ChangeImg(10);
                    y += speed;
                    if (y > 640) this.visible = false;
                    break;
                case UP:
                    ChangeImg(13);
                    y -= speed;
                    if (y < 0)
                        this.visible = false;
                    break;
                case RIGHT:
                    ChangeImg(12);
                    x += speed;
                    if (x > 960)
                        this.visible = false;
                    break;
                case LEFT:
                    ChangeImg(11);
                    x -= speed;
                    if (x < 0)
                        this.visible = false;
                    break;
            }
        }//角色冰霜子弹
        else if(id == 4){
            switch (direction) {
                case DOWN:
                    ChangeImg(6);
                    y += speed;
                    if (y > 640) this.visible = false;
                    break;
                case UP:
                    ChangeImg(9);
                    y -= speed;
                    if (y < 0)
                        this.visible = false;
                    break;
                case RIGHT:
                    ChangeImg(8);
                    x += speed;
                    if (x > 960)
                        this.visible = false;
                    break;
                case LEFT:
                    ChangeImg(7);
                    x -= speed;
                    if (x < 0)
                        this.visible = false;
                    break;
            }
        }//角色藤曼子弹
        else if(id == 5){
            switch (direction) {
                case DOWN:
                    ChangeImg(14);
                    y += speed;
                    if (y > 640) this.visible = false;
                    break;
                case UP:
                    ChangeImg(17);
                    y -= speed;
                    if (y < 0)
                        this.visible = false;
                    break;
                case RIGHT:
                    ChangeImg(16);
                    x += speed;
                    if (x > 960)
                        this.visible = false;
                    break;
                case LEFT:
                    ChangeImg(15);
                    x -= speed;
                    if (x < 0)
                        this.visible = false;
                    break;
            }
        }else if(id == 6){
            switch (direction) {
                case DOWN:
                    ChangeImg(18);
                    y += speed;
                    if (y > 640) this.visible = false;
                    break;
                case UP:
                    ChangeImg(18);
                    y -= speed;
                    if (y < 0)
                        this.visible = false;
                    break;
                case RIGHT:
                    ChangeImg(18);
                    x += speed;
                    if (x > 960)
                        this.visible = false;
                    break;
                case LEFT:
                    ChangeImg(18);
                    x -= speed;
                    if (x < 0)
                        this.visible = false;
                    break;
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public int getatk() {
        return atk;
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setatk(int atk) {
        this.atk = atk;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setId(int id) {
        this.id = id;
    }



}
