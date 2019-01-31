
package Paint;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

public class bghost extends PacGuy{

    public bghost() {
    try {
           image = ImageIO.read(new FileImageInputStream(new File("bghost.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBounds(0, 0, genislik, genislik);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
         
    }
@Override
    public void image() {
        
    }
    
    
}
