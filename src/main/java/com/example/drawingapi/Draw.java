package com.example.drawingapi;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Draw {
    public void draw() throws IOException {
        int width = 300;
        int height = 300;
        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = buffImg.createGraphics();

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0,width, height);

        g2d.setColor(Color.black);
        g2d.fillOval(0,0,width, height);

        g2d.dispose();

        File file = new File("imgs.png");
        ImageIO.write(buffImg, "png", file);
    }
}
