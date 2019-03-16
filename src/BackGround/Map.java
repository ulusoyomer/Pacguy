/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackGround;

import Listener.KeyListenerr;
import Listener.TimStartGui;
import Paint.Engeller;
import Paint.IYON;
import Paint.PacGuy;
import Paint.Yem2;
import Paint.bghost;
import Paint.ghosts;
import Paint.rghost;
import Paint.yghost;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.*;
import java.io.*;

/**
 *
 * @author qq
 */
public class Map extends JPanel implements IYON {

    public int zorluk;
    Engeller engel = null;
    ArrayList<PacGuy> gList = null;
    ArrayList<Engeller> eList = null;
    ArrayList<Yem2> yList = null;
    PacGuy pacGuy = null;
    KeyListenerr keyListenerr = null;
    Timer timer = null;
    Timer timer2 = null;
    Timer timer3 = null;
    TimStartGui timStartGui = null;
    Yem2 yem;
    int i = 0;
    Score score = null;
    ghosts ghost;
    bghost bghost;
    rghost rghost;
    yghost yghost;
    Random random;
    AudioPlayer MGP = AudioPlayer.player;
    AudioStream BGM = null;
    AudioData MD = null;
    AudioDataStream loop = null;

    public Map(int zorluk) {
        this.zorluk = zorluk;
        random = new Random(System.currentTimeMillis());
        timer = new Timer(9, getTimStartGui());
        timer2 = new Timer(this.zorluk, getTimStartGui());
        timer3 = new Timer(2000, getTimStartGui());
        addKeyListener(getKeyListenerr());
        setVisible(true);
        setFocusable(true);
        eList = new ArrayList<Engeller>();
        yList = new ArrayList<Yem2>();
        gList = new ArrayList<PacGuy>();
        gList.add(getGhosts());
        gList.add(getBGhosts());
        gList.add(getRGhosts());
        gList.add(getYGhosts());
        setBounds(0, 0, 600, 600);
        setBackground(Color.black);
        setLayout(null);
        add(getEngeller());
        add(getScore());
        eList.add(engel);
        Engel1();
        add(getPacguy());
        add(getYem());
        yList.add(getYem());
        YemEkle();
        timer.start();
        timer2.start();
        timer3.start();
    }

    public Timer getTimer() {
        return timer;
    }

    public Timer getTimer2() {
        return timer2;
    }

    public Timer getTimer3() {
        return timer3;
    }

    public Engeller getEngeller() {
        if (engel == null) {
            engel = new Engeller();
            engel.setBounds(35, 50, 75, 100);
        }
        return engel;
    }

    public Yem2 getYem() {
        if (yem == null) {
            yem = new Yem2();
            yem.setBounds(0, 10, 11, 11);
        }
        return yem;
    }

    public void Engel1() {
        Engeller en = new Engeller();
        en.setBounds(295, 40, 200, 220);
        eList.add(en);
        add(en);
        Engeller en1 = new Engeller();
        en1.setBounds(100, 285, 65, 150);
        eList.add(en1);
        add(en1);
        Engeller en2 = new Engeller();
        en2.setBounds(380, 355, 100, 50);
        eList.add(en2);
        add(en2);
        add(getBGhosts());
        add(getGhosts());
        add(getYGhosts());
        add(getRGhosts());

    }

    public void RHaylet() {
        int g, r, y, b;
        g = 1 + random.nextInt(4);
        r = 1 + random.nextInt(4);
        y = 1 + random.nextInt(4);
        b = 1 + random.nextInt(4);
        ghost.setYon(g);
        rghost.setYon(r);
        yghost.setYon(y);
        bghost.setYon(b);

    }

    public PacGuy getPacguy() {
        if (pacGuy == null) {
            pacGuy = new PacGuy();
            pacGuy.setLocation(0, 400);
        }
        return pacGuy;
    }

    public ghosts getGhosts() {
        if (ghost == null) {
            ghost = new ghosts();
            ghost.setBounds(0, 0, ghost.getGenislik(), ghost.getGenislik());
        }
        return ghost;
    }

    public bghost getBGhosts() {
        if (bghost == null) {
            bghost = new bghost();
            bghost.setBounds(545, 0, bghost.getGenislik(), bghost.getGenislik());
        }
        return bghost;
    }

    public rghost getRGhosts() {
        if (rghost == null) {
            rghost = new rghost();
            rghost.setBounds(430, 450, rghost.getGenislik(), rghost.getGenislik());
        }
        return rghost;
    }

    public yghost getYGhosts() {
        if (yghost == null) {
            yghost = new yghost();
            yghost.setBounds(300, 300, yghost.getGenislik(), yghost.getGenislik());
        }
        return yghost;
    }

    public Score getScore() {
        if (score == null) {
            score = new Score();
        }
        return score;
    }

    public KeyListenerr getKeyListenerr() {
        if (keyListenerr == null) {
            keyListenerr = new KeyListenerr(this);
        }
        return keyListenerr;
    }

    public TimStartGui getTimStartGui() {
        if (timStartGui == null) {
            timStartGui = new TimStartGui(this);

        }
        return timStartGui;
    }

    public boolean carpisma() {
        for (int i = 0; i < eList.size(); i++) {
            if (new Rectangle(pacGuy.getX(), pacGuy.getY(), 25, 25).intersects(new Rectangle(eList.get(i).getX(), eList.get(i).getY(), eList.get(i).getWidth(), eList.get(i).getHeight()))) {

                return true;
            }
        }

        return false;

    }

    public void carpisma3() {
        for (int j = 0; j < gList.size(); j++) {
            for (int k = 0; k < eList.size(); k++) {
                if (new Rectangle(gList.get(j).getX(), gList.get(j).getY(), 25, 25).intersects(new Rectangle(eList.get(k).getX(), eList.get(k).getY(), eList.get(k).getWidth(), eList.get(k).getHeight()))) {
                    if (gList.get(j).getYon() == Asagi) {
                        gList.get(j).setYon(Yukari);
                    } else if (gList.get(j).getYon() == Yukari) {
                        gList.get(j).setYon(Asagi);
                    } else if (gList.get(j).getYon() == Sag) {
                        gList.get(j).setYon(Sol);
                    } else {
                        gList.get(j).setYon(Sag);
                    }

                }

            }
        }
    }

    public void carpisma4() throws InterruptedException {
        for (int i = 0; i < gList.size(); i++) {
            if (new Rectangle(pacGuy.getX(), pacGuy.getY(), 25, 25).intersects(new Rectangle(gList.get(i).getX(), gList.get(i).getY(), 20, 23))) {
                music2();
                timer.stop();
                timer2.stop();
                timer3.stop();
                if (score.getCan() > 0) {
                    ghost.setLocation(0, 0);
                    bghost.setLocation(545, 0);
                    yghost.setLocation(300, 300);
                    rghost.setLocation(430, 450);
                    pacGuy.setLocation(0, 400);
                    score.getpList().get(score.getCan()).setVisible(false);
                    score.getpList().remove(score.getCan());
                    score.setScore(score.getScore() - 10);
                    score.setCan(score.getCan() - 1);
                    Thread.sleep(1000);
                    score.repaint();
                    timer2.start();
                    timer.start();
                    timer3.start();
                } else {
                    timer.stop();
                    timer2.stop();
                    timer3.stop();
                    JOptionPane.showMessageDialog(this, "Oyun bitti");
                }

            }

        }

    }

    public void carpisma2() {
        for (int i = 0; i < yList.size(); i++) {
            if (new Rectangle(pacGuy.getX(), pacGuy.getY(), 25, 25).intersects(new Rectangle(yList.get(i).getX(), yList.get(i).getY(), 11, 11))) {
                yList.get(i).setBounds(0, 0, 0, 0);
                yList.remove(i);
                score.setScore(score.getScore() + 1);
                score.repaint();
                music();
                if (yList.size() <= 38) {
                    timer.stop();
                    timer2.stop();
                    timer3.stop();
                    JOptionPane.showMessageDialog(this, "Oyun bitti");
                }

            }

        }
    }

    public void YemEkle() {
        for (int i = 0; i < 17; i++) {
            Yem2 ye1 = new Yem2();
            ye1.setBounds(0, i * 30, 11, 11);
            this.i++;
            yList.add(ye1);
            add(ye1);
            for (int k = 0; k < 9; k++) {
                Yem2 ye = new Yem2();
                ye.setBounds(yList.get(this.i).getX() + 60, yList.get(this.i).getY(), 11, 11);
                this.i++;
                yList.add(ye);
                add(ye);

            }

        }
        yList.get(0).setBounds(0, 0, 0, 0);
        yList.remove(0);

    }

    public void Maphareket() {

        if (pacGuy.getYon2() == Sag) {
            if (!carpisma()) {
                pacGuy.setYon2(0);
            } else if (pacGuy.getYon() == Asagi) {
                pacGuy.asagi();
            } else if (pacGuy.getYon() == Sol) {
                pacGuy.sol();
            } else if (pacGuy.getYon() == Yukari) {
                pacGuy.yukari();
            }
        } else if (pacGuy.getYon2() == Asagi) {
            if (!carpisma()) {
                pacGuy.setYon2(0);

            } else if (pacGuy.getYon() == Sag) {
                pacGuy.sag();
            } else if (pacGuy.getYon() == Sol) {
                pacGuy.sol();
            } else if (pacGuy.getYon() == Yukari) {
                pacGuy.yukari();
            }
        } else if (pacGuy.getYon2() == Sol) {
            if (!carpisma()) {
                pacGuy.setYon2(0);
            } else if (pacGuy.getYon() == Sag) {
                pacGuy.sag();
            } else if (pacGuy.getYon() == Asagi) {
                pacGuy.asagi();
            } else if (pacGuy.getYon() == Yukari) {
                pacGuy.yukari();
            }
        } else if (pacGuy.getYon2() == Yukari) {
            if (!carpisma()) {
                pacGuy.setYon2(0);
            } else if (pacGuy.getYon() == Sag) {
                pacGuy.sag();
            } else if (pacGuy.getYon() == Sol) {
                pacGuy.sol();

            } else if (pacGuy.getYon() == Asagi) {
                pacGuy.asagi();
            }
        }
        if (pacGuy.getYon2() == 0) {
            if (pacGuy.getYon() == Sag) {
                if (carpisma()) {
                    pacGuy.setYon2(pacGuy.getYon());
                    pacGuy.setYon(0);
                } else {
                    if (pacGuy.getX() < 555) {
                        pacGuy.sag();
                    }
                }
            } else if (pacGuy.getYon() == Asagi) {
                if (carpisma()) {
                    pacGuy.setYon2(pacGuy.getYon());
                    pacGuy.setYon(0);
                } else {
                    if (pacGuy.getY() < 480) {
                        pacGuy.asagi();
                    }
                }
            } else if (pacGuy.getYon() == Sol) {
                if (carpisma()) {
                    pacGuy.setYon2(pacGuy.getYon());
                    pacGuy.setYon(0);
                } else {
                    if (pacGuy.getX() > 0) {
                        pacGuy.sol();
                    }
                }
            } else if (pacGuy.getYon() == Yukari) {
                if (carpisma()) {
                    pacGuy.setYon2(pacGuy.getYon());
                    pacGuy.setYon(0);
                } else {
                    if (pacGuy.getY() > 0) {
                        pacGuy.yukari();
                    }
                }
            }
        }

    }

    public void music() {

        try {
            BGM = new AudioStream(new FileInputStream("pacguyeatfruit.wav"));
            MD = BGM.getData();
            loop = new AudioDataStream(MD);
        } catch (IOException error) {

        }
        MGP.start(loop);

    }

    public void music2() {

        try {
            BGM = new AudioStream(new FileInputStream("pacguydeath.wav"));
            MD = BGM.getData();
            loop = new AudioDataStream(MD);
        } catch (IOException error) {

        }
        MGP.start(loop);

    }

    public void carpisma7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void hareket2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
