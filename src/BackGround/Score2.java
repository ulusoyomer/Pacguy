package BackGround;

import Paint.PacGuy;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Score2 extends JPanel {

    private int score = 0;
    private int can = 2;
    ArrayList<PacGuy> pList = null;
    PacGuy pacGuy, pacGuy2, pacGuy1 = null;

    public ArrayList<PacGuy> getpList() {
        return pList;
    }

    public Score2() {
        pList = new ArrayList<PacGuy>();
        setBounds(0, 376, 791, 90);
        setBackground(Color.BLACK);
        setLayout(null);
        add(getPacGuy());
        add(getPacGuy1());
        add(getPacGuy2());
        pList.add(getPacGuy());
        pList.add(getPacGuy1());
        pList.add(getPacGuy2());
        setVisible(true);
    }

    public void setpList(ArrayList<PacGuy> pList) {
        this.pList = pList;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        grphcs.setColor(Color.BLUE);
        grphcs.drawLine(0, 0, 791, 0);
        grphcs.setFont(new Font("Arial", Font.BOLD, 20));
        grphcs.drawString("Score : " + score, 650, 30);
        grphcs.setFont(new Font("Arial", Font.BOLD, 50));
        grphcs.drawString("" + (can + 1), 365, 45);

    }

    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    public PacGuy getPacGuy() {
        if (pacGuy == null) {
            pacGuy = new PacGuy();
            pacGuy.setLocation(10, 10);
            pacGuy.setVisible(true);
        }
        return pacGuy;
    }

    public PacGuy getPacGuy1() {
        if (pacGuy1 == null) {
            pacGuy1 = new PacGuy();
            pacGuy1.setLocation(50, 10);
            pacGuy1.setVisible(true);
        }
        return pacGuy1;
    }

    public PacGuy getPacGuy2() {
        if (pacGuy2 == null) {
            pacGuy2 = new PacGuy();
            pacGuy2.setLocation(90, 10);
            pacGuy2.setVisible(true);
        }
        return pacGuy2;
    }

}
