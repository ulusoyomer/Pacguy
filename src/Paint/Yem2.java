/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author qq
 */
public class Yem2 extends JLabel{
    public Yem2() {
        setBounds(36, 36, 10, 10);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
        grphcs.setColor(Color.green);
        grphcs.fillOval(0, 0,10,10);
    }
}
