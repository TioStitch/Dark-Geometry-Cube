package tiostitch.geometry.cube.controllers;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImgController {

    public static ImageIcon resizeImageGif(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();

        return new ImageIcon(bufferedImage);
    }
}
