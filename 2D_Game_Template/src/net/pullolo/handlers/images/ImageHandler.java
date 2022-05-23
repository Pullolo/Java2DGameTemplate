package net.pullolo.handlers.images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageHandler {
    public static BufferedImage loadImage(String src){
        BufferedImage img = null;
        try {
            img = ImageIO.read(ImageHandler.class.getClassLoader().getResource(src));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }

    public static BufferedImage cropImage(BufferedImage img ,int x, int y, int width, int height){
        return img.getSubimage(x, y, width, height);
    }
}
