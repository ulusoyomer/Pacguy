/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JLabel;

/**
 *
 * @author qq
 */
public class Yem extends JLabel{
    public Yem() {
        setBounds(36, 36, 5, 5);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
        grphcs.setColor(Color.red);
        grphcs.fillOval(0, 0, 5, 5);
    }
    
    
}
