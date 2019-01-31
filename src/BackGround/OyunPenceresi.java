package BackGround;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OyunPenceresi extends JFrame {

    public int zorluk;
    int genislik = 600;
    JPanel jPanel = null;
    Map map = null;

    public int getZorluk() {
        return zorluk;
    }

    public void setZorluk(int zorluk) {
        this.zorluk = zorluk;
    }

    public OyunPenceresi(int zorluk) {
        this.zorluk = zorluk;
        setDimension();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(false);
        setContentPane(getJPanel());
        getJPanel().add(getMap());
        setVisible(true);
    }

    public void setDimension() { //Ekrana ortalama işini yapar
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int PosX;
        int PosY;
        PosX = (dim.width - genislik) / 2;
        PosY = (dim.height - genislik) / 2;
        setBounds(PosX, PosY, genislik, genislik);

    }

    public JPanel getJPanel() {
        if (jPanel == null) {
            jPanel = new JPanel();
            jPanel.setLayout(null);
            jPanel.setBackground(Color.black);
            jPanel.setFocusable(false);
        }
        return jPanel;
    }

    public Map getMap() {
        if (map == null) {
            map = new Map(getZorluk());
        }
        return map;
    }

}
