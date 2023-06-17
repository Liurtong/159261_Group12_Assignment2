import java.awt.*;

public class ItemDrop extends GameObject{
    int id;
    int uid;
    int price;
    double hp;
    double mp;
    int atk;
    Image image;
    boolean buy=false;

    public ItemDrop(int x, int y, int width, int height, double hp, double mp, int id, int uid, int atk, Image img, Rectangle rectangle){
        super(x,y,width,height,hp,mp,img,rectangle);
        this.id = id;
        this.uid=uid;
        this.hp=hp;
        this.mp=mp;
        this.atk = atk;
        this.image = img;
    }

    public ItemDrop(int x, int y, int width, int height, double hp, double mp, int id, int uid, int atk, int price, boolean buy, Image img, Rectangle rectangle){
        super(x,y,width,height,hp,mp,img,rectangle);
        this.id = id;
        this.uid=uid;
        this.price=price;
        this.buy=buy;
        this.hp=hp;
        this.mp=mp;
        this.atk = atk;
        this.image = img;
    }

    public ItemDrop(int x, int y, int width, int height, double hp, double mp, int id, int atk, Image img, Rectangle rectangle){
        super(x,y,width,height,hp,mp,img,rectangle);
        this.id = id;
        this.hp=hp;
        this.mp=mp;
        this.atk = atk;
        this.image = img;
    }

    public Image getImage(){
        return img;
    }
}
