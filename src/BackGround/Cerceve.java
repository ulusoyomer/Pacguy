package BackGround;

import Listener.TimStartGui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cerceve {

    JFrame jFrame;
    private final int genislik = 600;
    JPanel jPanel;
    StartGui startGui;
    OyunPenceresi oyun;
    TimStartGui timStartGui;

    public Cerceve() {
        getJFrame();
        setDimension();
        getstartGui();
        jFrame.setVisible(true);
    }
////

    public JFrame getJFrame() {
        if (jFrame == null) {
            jFrame = new JFrame("PacGuy");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setContentPane(getstartGui());
            jFrame.setResizable(false);
            jFrame.setFocusable(false);

        }
        return jFrame;
    }
///

    public void setDimension() { //Ekrana ortalama işini yapar
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int PosX;
        int PosY;
        PosX = (dim.width - genislik) / 2;
        PosY = (dim.height - genislik) / 2;
        jFrame.setBounds(PosX, PosY, genislik, genislik);

    }

    public StartGui getstartGui() {
        if (startGui == null) {
            startGui = new StartGui();
            startGui.setBackground(Color.black);
            startGui.getEasy().addActionListener(getTimStartGui());
            startGui.getHard().addActionListener(getTimStartGui());
            startGui.getMedium().addActionListener(getTimStartGui());
            startGui.getMap2().addActionListener(getTimStartGui());
            startGui.setFocusable(false);
        }
        return startGui;
    }

    public TimStartGui getTimStartGui() {
        if (timStartGui == null) {
            timStartGui = new TimStartGui(this);
        }
        return timStartGui;
    }

    public void setZorluk(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getOyun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
