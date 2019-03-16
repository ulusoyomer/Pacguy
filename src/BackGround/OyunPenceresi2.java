/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackGround;

import Listener.KeyListenerr;
import Listener.TimStartGui;
import Paint.Engel;
import Paint.PacGuy;
import Paint.Yem;
import Paint.ghosts;
import Paint.rghost;
import Paint.yghost;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author qq
 */
public class OyunPenceresi2 {

    JFrame jframe = null;
    JPanel jpanel = null;
    PacGuy pacguy = null;
    ArrayList<Yem> yList = new ArrayList<Yem>();
    ArrayList<PacGuy> gList = new ArrayList<PacGuy>();
    Yem yem1 = null;
    int k = 0, l = 0;
    ghosts ghost = null;
    rghost rghost = null;
    yghost yghost = null;
    AudioPlayer MGP = AudioPlayer.player;
    AudioStream BGM = null;
    AudioData MD = null;
    AudioDataStream loop = null;
    Score2 score2 = null;

    Engel engelUst = new Engel(0, 0, 775, 25);
    Engel engelSag1 = new Engel(0, 25, 25, 150);
    Engel engelSag2 = new Engel(0, 200, 25, 175);
    Engel engelSol1 = new Engel(750, 25, 25, 150);
    Engel engelSol2 = new Engel(750, 200, 25, 175);
    Engel engelAlt = new Engel(25, 350, 725, 25);

/////////////////////////////////////////////////////    
    Engel sekil01 = new Engel(50, 50, 150, 25);
    Engel sekil02 = new Engel(225, 50, 150, 25);
    Engel sekil03 = new Engel(400, 50, 150, 25);
    Engel sekil04 = new Engel(575, 50, 150, 25);

/////////////////////////////////////////////////
    Engel harfcu01 = new Engel(50, 100, 150, 1);
    Engel harfcu02 = new Engel(225, 100, 150, 1); ////// üst çizgiler
    Engel harfcu03 = new Engel(400, 100, 150, 1);
    Engel harfcu04 = new Engel(575, 100, 150, 1);
////////////////////////////////////////////////////
    Engel harfcl01 = new Engel(50, 100, 1, 175);
    Engel harfcl02 = new Engel(225, 100, 1, 175);
    Engel harfcl03 = new Engel(400, 100, 1, 175);
    Engel harfcl04 = new Engel(575, 100, 1, 175);

    Engel harfcr01 = new Engel(200, 100, 1, 175);
    Engel harfcr02 = new Engel(375, 100, 1, 175);
    Engel harfcr03 = new Engel(550, 100, 1, 175);
    Engel harfcr04 = new Engel(725, 100, 1, 175);
//////////////////////////////////////////////////
    Engel harfcd01 = new Engel(50, 275, 150, 1);
    Engel harfcd02 = new Engel(225, 275, 150, 1); //////// al çizgiler
    Engel harfcd03 = new Engel(400, 275, 150, 1);
    Engel harfcd04 = new Engel(575, 275, 150, 1);

///////////////////////////////////////////////////   
    

////////////////////////////////////////////////////// 
    Engel sekil06 = new Engel(50, 300, 150, 25);
    Engel sekil08 = new Engel(225, 300, 150, 25);
    Engel sekil10 = new Engel(400, 300, 150, 25);
    Engel sekil12 = new Engel(575, 300, 150, 25);

////////////////////////////////////////////////
    TimStartGui Timstartgui = null;
    KeyListenerr key = null;
    Timer timer = null;
    Timer timer1 = null;
    Random random = null;

    public OyunPenceresi2() {
        random = new Random(System.currentTimeMillis());
        getJframe();
        setDimension();
        getJframe().add(getScore2());
        getJpanel().add(getPacguy());
        getJpanel().add(getGhost());
        getJpanel().add(getYghost());
        getJpanel().add(getRghost());
        YemEkle();
        jframe.setVisible(true);
        map();
        getTimer().start();
        getTimer1().start();
    }

    public void setDimension() { //Ekrana ortalama işini yapar
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int PosX;
        int PosY;
        PosX = (dim.width - 791) / 2;
        PosY = (dim.height - 413) / 2;
        getJframe().setBounds(PosX, PosY, 791, 468);

    }

    public void map() {
        getJpanel().add(engelUst);
        getJpanel().add(engelSol1);
        getJpanel().add(engelSol2);
        getJpanel().add(engelSag1);
        getJpanel().add(engelSag2);
        getJpanel().add(engelAlt);

        getJpanel().add(sekil01);
        getJpanel().add(sekil02);
        getJpanel().add(sekil03);
        getJpanel().add(sekil04);

        getJpanel().add(harfcu01);
        getJpanel().add(harfcu02);
        getJpanel().add(harfcu03);
        getJpanel().add(harfcu04);

        getJpanel().add(harfcl01);
        getJpanel().add(harfcl02);
        getJpanel().add(harfcl03);
        getJpanel().add(harfcl04);

        getJpanel().add(harfcr01);
        getJpanel().add(harfcr02);
        getJpanel().add(harfcr03);
        getJpanel().add(harfcr04);

        getJpanel().add(harfcd01);
        getJpanel().add(harfcd02);
        getJpanel().add(harfcd03);
        getJpanel().add(harfcd04);

        

        getJpanel().add(sekil06);
        getJpanel().add(sekil08);
        getJpanel().add(sekil10);
        getJpanel().add(sekil12);

    }

    public JFrame getJframe() {
        if (jframe == null) {
            jframe = new JFrame("Pacguy");
            jframe.setBounds(0, 0, 791, 413);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setContentPane(getJpanel());
            jpanel.setFocusable(true);
            jpanel.addKeyListener(getKey());
        }
        return jframe;
    }

    public JPanel getJpanel() {
        if (jpanel == null) {
            jpanel = new JPanel();
            jpanel.setBackground(Color.black);
            jpanel.setLayout(null);
            jpanel.setFocusable(false);

        }
        return jpanel;
    }

    public Score2 getScore2() {
        if (score2 == null) {
            score2 = new Score2();
        }
        return score2;
    }

    public PacGuy getPacguy() {
        if (pacguy == null) {
            pacguy = new PacGuy();
            pacguy.setBounds(25, 25, 25, 25);
        }
        return pacguy;
    }

    public TimStartGui getTimstartgui() {
        if (Timstartgui == null) {
            Timstartgui = new TimStartGui(this);
        }
        return Timstartgui;
    }

    public Timer getTimer() {
        if (timer == null) {
            timer = new Timer(5, getTimstartgui());
        }
        return timer;
    }

    public Timer getTimer1() {
        if (timer1 == null) {
            timer1 = new Timer(1000, getTimstartgui());
        }

        return timer1;
    }

    public KeyListenerr getKey() {
        if (key == null) {
            key = new KeyListenerr(this);
        }
        return key;
    }

    public void YemEkle() {
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                Yem yem = new Yem();
                yList.add(yem);
                getJpanel().add(yem);
                for (int j = 0; j < 28; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(yList.get(k).getX() + 25, yList.get(k).getY(), 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;

                }
            }
            if (i == 1) {
                Yem yem = new Yem();
                yem.setBounds(36, 86, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 28; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(yList.get(k).getX() + 25, 86, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;

                }
            }
            if (i == 2) {
                Yem yem = new Yem();
                yem.setBounds(36, 286, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 28; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(yList.get(k).getX() + 25, 286, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;

                }
            }
            if (i == 3) {
                Yem yem = new Yem();
                yem.setBounds(36, 336, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 28; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(yList.get(k).getX() + 25, 336, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;

                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                Yem yem = new Yem();
                yem.setBounds(36, 61, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                yem = new Yem();
                yem.setBounds(36, 111, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 6; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(36, yList.get(k).getY() + 25, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;
                }
                yem = new Yem();
                yem.setBounds(36, 311, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
            }

            if (i == 1) {
                Yem yem = new Yem();
                yem.setBounds(211, 61, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                yem = new Yem();
                yem.setBounds(211, 111, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 6; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(211, yList.get(k).getY() + 25, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;
                }
                yem = new Yem();
                yem.setBounds(211, 311, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
            }

            if (i == 2) {
                Yem yem = new Yem();
                yem.setBounds(386, 61, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                yem = new Yem();
                yem.setBounds(386, 111, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 6; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(386, yList.get(k).getY() + 25, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;
                }
                yem = new Yem();
                yem.setBounds(386, 311, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
            }

            if (i == 3) {
                Yem yem = new Yem();
                yem.setBounds(561, 61, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                yem = new Yem();
                yem.setBounds(561, 111, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 6; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(561, yList.get(k).getY() + 25, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;
                }
                yem = new Yem();
                yem.setBounds(561, 311, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
            }

            if (i == 4) {
                Yem yem = new Yem();
                yem.setBounds(736, 61, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                yem = new Yem();
                yem.setBounds(736, 111, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
                for (int j = 0; j < 6; j++) {
                    yem1 = new Yem();
                    yem1.setBounds(736, yList.get(k).getY() + 25, 5, 5);
                    yList.add(yem1);
                    getJpanel().add(yem1);
                    k++;
                }
                yem = new Yem();
                yem.setBounds(736, 311, 5, 5);
                yList.add(yem);
                getJpanel().add(yem);
                k++;
            }

        }

    }

    public void Yemkontrol() {
        for (int i = 0; i < yList.size(); i++) {
            if (new Rectangle(getPacguy().getX(), getPacguy().getY(), 25, 25).intersects(new Rectangle(yList.get(i).getX(), yList.get(i).getY(), 5, 5))) {
                yList.get(i).setBounds(0, 0, 0, 0);
                yList.remove(i);
                score2.setScore(score2.getScore() + 1);
                score2.repaint();
                music();
                if (yList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bitti.");
                    timer.stop();
                    timer1.stop();
                }
            }
        }
    }

    public ghosts getGhost() {
        if (ghost == null) {
            ghost = new ghosts();
            ghost.setYon(2);
            ghost.setYon2(2);
            ghost.setBounds(725, 25, 25, 25);
            gList.add(ghost);
        }
        return ghost;
    }

    public rghost getRghost() {
        if (rghost == null) {
            rghost = new rghost();
            rghost.setYon(1);
            rghost.setYon2(1);
            rghost.setBounds(25, 325, 25, 25);
            gList.add(rghost);
        }
        return rghost;
    }

    public yghost getYghost() {
        if (yghost == null) {
            yghost = new yghost();
            yghost.setYon(2);
            yghost.setYon2(2);
            yghost.setBounds(725, 325, 25, 25);
            gList.add(yghost);
        }
        return yghost;
    }

    public void GhostKontrol() throws InterruptedException {
        for (int i = 0; i < gList.size(); i++) {
            if (new Rectangle(getPacguy().getX(), getPacguy().getY(), 25, 25).intersects(new Rectangle(gList.get(i).getX(), gList.get(i).getY(), 25, 25))) {
                music2();
                if (score2.getCan() > 0) {
                    ghost.setLocation(725, 25);
                    yghost.setLocation(725, 325);
                    rghost.setLocation(25, 325);
                    getPacguy().setLocation(25, 25);
                    score2.getpList().get(score2.getCan()).setVisible(false);
                    score2.getpList().remove(score2.getCan());
                    score2.setScore(score2.getScore() - 10);
                    score2.setCan(score2.getCan() - 1);
                    Thread.sleep(1000);
                    score2.repaint();
                } else {
                    score2.getpList().get(score2.getCan()).setVisible(false);
                    score2.getpList().remove(score2.getCan());
                    score2.setScore(score2.getScore() - 10);
                    score2.setCan(score2.getCan() - 1);
                    score2.repaint();
                    timer.stop();
                    timer1.stop();
                    JOptionPane.showMessageDialog(null, "Oyun bitti");
                }
            }

        }

    }

    public void GhostYon() {
        int x = 1 + random.nextInt(4);
        int y = 1 + random.nextInt(4);
        int z = 1 + random.nextInt(4);
        GhostHareket(getGhost(), x);
        GhostHareket(getRghost(), y);
        GhostHareket(getYghost(), z);
       
    }

    public <E extends PacGuy> void GhostHareket(E e, int x) {
        switch (x) {
            case 2:
                if (e.getY() == 25 || e.getY() == 75 || e.getY() == 275 || e.getY() == 325) {
                    e.setYon(2);
                    e.setYon2(2);
                } else {
                    e.setYon2(2);
                }

                break;
            case 1:
                if (e.getY() == 25 || e.getY() == 75 || e.getY() == 275 || e.getY() == 325) {
                    e.setYon(1);
                    e.setYon2(1);
                } else {
                    e.setYon2(1);
                }

                break;
            case 4:
                if (e.getX() == 25 || e.getX() == 200 || e.getX() == 375 || e.getX() == 550 || e.getX() == 725) {
                    e.setYon(4);
                    e.setYon2(4);

                } else {
                    e.setYon2(4);
                }

                break;
            case 3:
                if (e.getX() == 25 || e.getX() == 200 || e.getX() == 375 || e.getX() == 550 || e.getX() == 725) {
                    e.setYon(3);
                    e.setYon2(3);

                } else {
                    e.setYon2(3);
                }

                break;
            default:
                break;
        }

    }

    public void music() { // Yem yeme sesi

        try {
            BGM = new AudioStream(new FileInputStream("pacguyeatfruit.wav"));
            MD = BGM.getData();
            loop = new AudioDataStream(MD);
        } catch (IOException error) {

        }
        MGP.start(loop);

    }

    public void music2() {  // Hayaletlerle çarpışma sesi

        try {
            BGM = new AudioStream(new FileInputStream("pacguydeath.wav"));
            MD = BGM.getData();
            loop = new AudioDataStream(MD);
        } catch (IOException error) {

        }
        MGP.start(loop);

    }

}
