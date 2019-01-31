/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JLabel;

/**
 *
 * @author qq
 */
public class PAC extends JLabel {

    protected BufferedImage image;

    public PAC() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("PAC.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBounds(0, 0, 100, 100);

    }

    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        grphcs.drawImage(image, 0, 0, image.getWidth() / 5, image.getHeight() / 5, this);
    }

}
