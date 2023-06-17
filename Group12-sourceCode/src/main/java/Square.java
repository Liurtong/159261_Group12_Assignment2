import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class Square extends GameObject {

    //Image IMGX;
    File file = new File("picture/Z.png");
    Image IMGX = ImageIO.read(file);
    //无参构造

    public Square(int x, int y, int width, int height, Rectangle rectangle) throws IOException {
        super(x, y, width, height, rectangle);
        super.img = IMGX;
    }
}
