
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



public class PacGuy extends JLabel implements IYON{
    protected BufferedImage image;
    protected final int genislik = 25;
    private int yon= 1 ;
    private int yon2= 1;
    int x[] = {0, 1, 8, 15, 22, 29};
    int y[] = {0, 1, 3, 11, 13};

    public int getYon2() {
        return yon2;
    }

    public void setYon2(int yon2) {
        this.yon2 = yon2;
    }
    public int getGenislik() {
        return genislik;
    }

    public int getYon() {
        return yon;
    }

    public void setYon(int yon) {
        this.yon = yon;
    }
    
    public PacGuy() {
        
        try {
            image = ImageIO.read(new FileImageInputStream(new File("PacGuy.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBounds(0, 0, genislik, genislik);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
        grphcs.drawImage(image,0,0,image.getWidth() /20,image.getHeight()/20,this);
    }

 @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    public void image(){
        if(getYon() == Sol){
           try {
            image = ImageIO.read(new FileImageInputStream(new File("PacGuy-L.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
            repaint();
        }
        if(getYon() == Sag){
           try {
            image = ImageIO.read(new FileImageInputStream(new File("PacGuy.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
            repaint();
        }
        if(getYon() == Yukari){
           try {
            image = ImageIO.read(new FileImageInputStream(new File("PacGuy-U.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
            repaint();
        }
        if(getYon() == Asagi){
           try {
            image = ImageIO.read(new FileImageInputStream(new File("PacGuy-D.png")));
        } catch (IOException ex) {
            Logger.getLogger(PacGuy.class.getName()).log(Level.SEVERE, null, ex);
        }
            repaint();
        }
    }
    
    public void Fhareket(){
        if(yon == Sag){
        int PosX = getX();
        int PosY = getY();
        PosX+=1;
        setBounds(PosX, PosY, genislik, genislik);
        }
        else if (yon == Sol){
        int PosX = getX();
        int PosY = getY();
        PosX-=1;
        setBounds(PosX, PosY, genislik, genislik);
        }
 
    }
   
   
    
     public void hareket2(){
        if(yon == Sag ){
            sag();
        }
        else if (yon == Sol){
            sol();
        }
        else if(yon == Yukari){
            yukari();
        }
        else if(yon == Asagi){
            asagi();
        }
                
        
    }
   
    public void sag(){
        int PosX = getX();
        int PosY = getY();
       if(getX() < 555)
        PosX+=1;
        else
          yon=-yon;
        setBounds(PosX, PosY, genislik, genislik);
        
    }
    public void sol(){
        int PosX = getX();
        int PosY = getY();
     if(getX() > 0)
        PosX-=1;
       else
           yon=-yon;
        setBounds(PosX, PosY, genislik, genislik);
        
    }
    public void yukari(){
        int PosX = getX();
        int PosY = getY();
       if(getY() > 0)
        PosY-=1;
      else
         yon=-yon;
        setBounds(PosX, PosY, genislik, genislik);
        
    }
    public void asagi(){
        int PosX = getX();
        int PosY = getY();
       if(getY() < 480)
        PosY+=1;
      else
          yon=-yon;
        setBounds(PosX, PosY, genislik, genislik);
    }
    
    public void Map2haraket() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 5; j++) {
                if (getX() == x[i] * genislik && getY() == y[j] * genislik) {
                    if (yon != yon2) {

                        if ((getY() == 25 && yon2 == 4) || (getY() == 325 && yon2 == 3) || (getX() == 25 && yon2 == 2) || (getX() == 725 && yon2 == 1)) {
                            yon2 = yon;
                        }
                        yon = yon2;
                        image();
                    }
                }
            }
        }
        if (getY() == 175 && ((getX() == 25 && yon2 == 2) || (getX() == 725 && yon2 == 1))) {
            yon = yon2;
            image();
        }
        if (yon == 1)//sag
        {
            if (getX() == 725) {
                if (getY() == 175) {
                    setBounds(getX() + 1, getY(), 25, 25);
                }
            } else {
                if (getX() == 25 && getY() == 175) {
                    yon = 0;
                } else {
                    setBounds(getX() + 1, getY(), 25, 25);
                }

            }

            if (getX() == 775) {
                setBounds(-25, getY(), getWidth(), getHeight());
            }
        } else if (yon == 2)//sol
        {
            if (getX() == 25) {
                if (getY() == 175) {
                    setBounds(getX() - 1, getY(), 25, 25);
                }
            } else {
                if (getX() == 725 && getY() == 175) {
                    yon = 0;
                } else {
                    setBounds(getX() - 1, getY(), 25, 25);
                }
            }

            if (getX() == -25) {
                setBounds(775, getY(), getWidth(), getHeight());
            }
        } else if (yon == 3)//asagi
        {
            if (getY() < 325) {
                setBounds(getX(), getY() + 1, 25, 25);
            }
        } else if (yon == 4)//yukari
        {
            if (getY() > 25) {
                setBounds(getX(), getY() - 1, 25, 25);
            }
        } else {

        }

    }
    
    
}
