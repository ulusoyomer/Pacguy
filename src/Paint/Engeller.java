/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JLabel;

/**
 *
 * @author qq
 */
public class Engeller extends JLabel {

    private final int genislik = 300;

    public int getGenislik() {
        return genislik;
    }

    public Engeller() {

        setBounds(0, 0, genislik, genislik);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(0, 0, genislik, genislik);
        g2.setColor(Color.red);
        g2.draw(rect);
        g2.fill(rect);

    }

}
