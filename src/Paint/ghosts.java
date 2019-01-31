
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


public class ghosts extends PacGuy implements IYON{

    public  ghosts() {
    try {
            image = ImageIO.read(new FileImageInputStream(new File("ghost.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBounds(0, 0, genislik, genislik);
    
    }

    @Override
    public  void paint(Graphics grphcs) {
        super.paint(grphcs); 
    }

    @Override
    public void image() {
        
    }
    
    
    
}
