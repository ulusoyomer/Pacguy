package Paint;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Engel extends JLabel {

    private int en = 0;
    private int boy = 0;
    private int x = 0;
    private int y = 0;

    public Engel(int x, int y, int en, int boy) {
        setX(x);
        setY(y);
        setEn(en);
        setBoy(boy);
        setBounds(this.x, this.y, this.en, this.boy);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillRect(0, 0, this.en, this.boy);
    }

    public void setEn(int en) {
        this.en = en;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
