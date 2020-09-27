package net.demomaker.busnetworkgenerator.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JImagePanel extends JPanel {
    private BufferedImage image;
    private final String DEFAULT_IMAGE_PATH = "img/desktopbackground.png";
    public JImagePanel() {
        if(DEFAULT_IMAGE_PATH.isEmpty()) return;
        File file = new File("");
        try {
            file = new File(DEFAULT_IMAGE_PATH);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            image = ImageIO.read(file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setImageFromImage(BufferedImage image) {
        try {
            this.image = image;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setImageFromFile(File imageFile) {
        try {
            image = ImageIO.read(imageFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH), 0, 0, this);
    }
}