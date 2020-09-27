package net.demomaker.busnetworkgenerator.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JMapPanel extends JPanel {
    private BufferedImage image;

    public void SetImageFromFile(File imageFile) {
        try {
            image = ImageIO.read(imageFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
