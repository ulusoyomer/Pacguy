/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listener;

import BackGround.Cerceve;
import BackGround.Map;
import BackGround.OyunPenceresi;
import BackGround.OyunPenceresi2;
import BackGround.StartGui;
import Paint.PacGuy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qq
 */
public class TimStartGui implements ActionListener {

    StartGui startGui;
    Map map;
    Cerceve cerceve;
    OyunPenceresi2 oyunPenceresi2;

    public TimStartGui(StartGui startGui) {
        this.startGui = startGui;

    }

    public TimStartGui(Map map) {
        this.map = map;

    }

    public TimStartGui(Cerceve cerceve) {
        this.cerceve = cerceve;
    }

    
    
    ///// startGui
    public TimStartGui(OyunPenceresi2 oyunPenceresi2) {
        this.oyunPenceresi2 = oyunPenceresi2;
    }
        
    
    public <E extends PacGuy> void Starthareket(E e) {
        if (e.getX() == 720) {
            e.setYon(2);
            startGui.getPacGuy().image();
        }
        if (e.getX() == -120) {
            e.setYon(1);
            startGui.getPacGuy().image();
        }
        e.Fhareket();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        //////
        if (startGui != null) {
            if (ae.getSource() == startGui.getTimer()) {
                Starthareket(startGui.getPacGuy());
                Starthareket(startGui.getbghost());
                Starthareket(startGui.getGhost());
                Starthareket(startGui.getYghost());
                Starthareket(startGui.getRghost());
            }
            /////
        } else if (cerceve != null) {
            if (ae.getSource() == cerceve.getstartGui().getEasy()) {
                System.out.println("Easy");
                cerceve.getstartGui().getTimer().stop();
                cerceve.getJFrame().setVisible(false);
                cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
                OyunPenceresi oyunPenceresi = new OyunPenceresi(11);
            } else if (ae.getSource() == cerceve.getstartGui().getMedium()) {
                System.out.println("Medium");
                cerceve.getstartGui().getTimer().stop();
                cerceve.getJFrame().setVisible(false);
                cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
                OyunPenceresi oyunPenceresi = new OyunPenceresi(8);
            } else if (ae.getSource() == cerceve.getstartGui().getHard()) {
                System.out.println("Hard");
                cerceve.getstartGui().getTimer().stop();
                cerceve.getJFrame().setVisible(false);
                cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
                OyunPenceresi oyunPenceresi = new OyunPenceresi(4);
            } else if (ae.getSource() == cerceve.getstartGui().getMap2()) {
                System.out.println("Esra");
                cerceve.getstartGui().getTimer().stop();
                cerceve.getJFrame().setVisible(false);
                cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
                OyunPenceresi2 oyunPenceresi2 = new OyunPenceresi2();
            }
        } ////////////////
        else if (oyunPenceresi2 != null) {
            if (ae.getSource() == oyunPenceresi2.getTimer()) {
                oyunPenceresi2.getPacguy().Map2haraket();
                oyunPenceresi2.getGhost().Map2haraket();
                oyunPenceresi2.getRghost().Map2haraket();
                oyunPenceresi2.getYghost().Map2haraket();
                oyunPenceresi2.Yemkontrol();
                try {
                    oyunPenceresi2.GhostKontrol();
                } catch (InterruptedException ex) {
                    Logger.getLogger(TimStartGui.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (ae.getSource() == oyunPenceresi2.getTimer1()) {
                oyunPenceresi2.GhostYon();
            }/////////////
        } else {
            if (ae.getSource() == map.getTimer()) {
                map.Maphareket();
                map.carpisma2();

            }
            if (ae.getSource() == map.getTimer2()) {
                try {
                    map.carpisma4();
                } catch (InterruptedException ex) {
                    Logger.getLogger(TimStartGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                map.carpisma3();
                map.getGhosts().hareket2();
                map.getRGhosts().hareket2();
                map.getYGhosts().hareket2();
                map.getBGhosts().hareket2();
            }
            if (ae.getSource() == map.getTimer3()) {
                map.RHaylet();
            }
        }
    }



}
