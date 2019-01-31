
package Paint;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

public class rghost extends PacGuy{

    public rghost() {
   try {
            image = ImageIO.read(new FileImageInputStream(new File("rghost.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBounds(0, 0, genislik, genislik);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
    public void image() {
        
    }
    
    
}
