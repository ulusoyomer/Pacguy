/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackGround;

import Listener.TimStartGui;
import Paint.PAC;
import Paint.PacGuy;
import Paint.bghost;
import Paint.ghosts;
import Paint.rghost;
import Paint.yghost;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.*;
import java.io.*;

/**
 *
 * @author qq
 */
public class StartGui extends JPanel {

    PacGuy pacGuy = null;
    bghost bghost = null;
    ghosts ghost = null;
    yghost yghost = null;
    rghost rghost = null;
    PAC pac = null;
    JButton medium, hard, easy ,map2 = null;
    Timer timer = null;
    TimStartGui timStartGui = null;
    AudioPlayer MGP = AudioPlayer.player;
    AudioStream BGM = null;
    AudioData MD = null;
    ContinuousAudioDataStream loop = null;

    public StartGui() {
        setBounds(0, 0, 600, 600);
        setBackground(Color.black);
        setLayout(null);
        add(getPac());
        add(getPacGuy());
        add(getbghost());
        add(getGhost());
        add(getYghost());
        add(getRghost());
        add(getEasy());
        add(getMedium());
        add(getHard());
        add(getMap2());
        music();
        timer = new Timer(6, getTimStartGui());
        timer.start();
    }

    public ContinuousAudioDataStream getLoop() {
        return loop;
    }

    public void setLoop(ContinuousAudioDataStream loop) {
        this.loop = loop;
    }

    public Timer getTimer() {
        return timer;
    }
    public AudioPlayer getMgp() {
        return MGP;
    }

    public PacGuy getPacGuy() {
        if (pacGuy == null) {
            pacGuy = new PacGuy();
            pacGuy.setLocation(150, 450);
        }
        return pacGuy;
    }

    public PAC getPac() {
        if (pac == null) {
            pac = new PAC();
            pac.setBounds(75, 10, 400, 400);
        }
        return pac;
    }

    public bghost getbghost() {
        if (bghost == null) {
            bghost = new bghost();
            bghost.setLocation(110, 450);
        }
        return bghost;
    }

    public ghosts getGhost() {
        if (ghost == null) {
            ghost = new ghosts();
            ghost.setLocation(70, 450);
        }
        return ghost;
    }

    public yghost getYghost() {
        if (yghost == null) {
            yghost = new yghost();
            yghost.setLocation(35, 450);
        }
        return yghost;
    }

    public rghost getRghost() {
        if (rghost == null) {
            rghost = new rghost();
            rghost.setLocation(0, 450);
        }
        return rghost;
    }

       public JButton getEasy() {
        if (easy == null) {
            easy = new JButton();
            Icon icon = new ImageIcon(getClass().getResource("Easy.png"));
            easy.setIcon(icon);
            easy.setBounds(150, 300, 100, 30);
        }
        return easy;
    }
       
    public JButton getMedium() {
        if (medium == null) {
            medium = new JButton();
            Icon icon = new ImageIcon(getClass().getResource("Medium.png"));
            medium.setIcon(icon);
            medium.setBounds(250, 300, 100, 30);
        }
        return medium;
    }

 

    public JButton getHard() {
        if (hard == null) {
            hard = new JButton();
            Icon icon = new ImageIcon(getClass().getResource("Hard.png"));
            hard.setIcon(icon);
            hard.setBounds(350, 300, 100, 30);
        }
        return hard;
    }
    public JButton getMap2(){
        if(map2 == null){
            map2 = new JButton("2. Harita");
            map2.setBounds(400, 400, 95, 25);
            map2.setBackground(Color.green);
        }
        return map2;
    }
    public TimStartGui getTimStartGui(){
        if(timStartGui == null){
            timStartGui = new TimStartGui(this);
        }
        return timStartGui;
    }

    public void music() {

        try {
            BGM = new AudioStream(new FileInputStream("pacguytheme.wav"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        } catch (IOException error) {

        }
        MGP.start(loop);

    }

}
