package Listener;

import BackGround.Map;
import BackGround.OyunPenceresi2;
import Paint.IYON;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerr implements KeyListener, IYON {

    Map map = null;
    OyunPenceresi2 oyunPenceresi2 = null;

    public KeyListenerr(Map map) {
        this.map = map;
    }

    public KeyListenerr(OyunPenceresi2 oyunPenceresi2) {
        this.oyunPenceresi2 = oyunPenceresi2;
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (map != null) {
            switch (ke.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    map.getPacguy().setYon(Sol);
                    map.getPacguy().image();
                    break;
                case KeyEvent.VK_RIGHT:
                    map.getPacguy().setYon(Sag);
                    map.getPacguy().image();
                    break;
                case KeyEvent.VK_UP:
                    map.getPacguy().setYon(Yukari);
                    map.getPacguy().image();
                    break;
                case KeyEvent.VK_DOWN:
                    map.getPacguy().setYon(Asagi);
                    map.getPacguy().image();
                    break;
                default:
                    break;
            }

        } else 
        {
            
            switch (ke.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (oyunPenceresi2.getPacguy().getY() == 25 || oyunPenceresi2.getPacguy().getY() == 75 || oyunPenceresi2.getPacguy().getY() == 275 || oyunPenceresi2.getPacguy().getY() == 325) {
                        oyunPenceresi2.getPacguy().setYon(2);
                        oyunPenceresi2.getPacguy().setYon2(2);
                        oyunPenceresi2.getPacguy().image();
                    } else {
                        oyunPenceresi2.getPacguy().setYon2(2);
                    }

                    break;
                case KeyEvent.VK_RIGHT:
                    if (oyunPenceresi2.getPacguy().getY() == 25 || oyunPenceresi2.getPacguy().getY() == 75 || oyunPenceresi2.getPacguy().getY() == 275 || oyunPenceresi2.getPacguy().getY() == 325) {
                        oyunPenceresi2.getPacguy().setYon(1);
                        oyunPenceresi2.getPacguy().setYon2(1);
                        oyunPenceresi2.getPacguy().image();
                    } else {
                        oyunPenceresi2.getPacguy().setYon2(1);
                    }

                    break;
                case KeyEvent.VK_UP:
                    if (oyunPenceresi2.getPacguy().getX() == 25 || oyunPenceresi2.getPacguy().getX() == 200 || oyunPenceresi2.getPacguy().getX() == 375 || oyunPenceresi2.getPacguy().getX() == 550 || oyunPenceresi2.getPacguy().getX() == 725) {
                        oyunPenceresi2.getPacguy().setYon(4);
                        oyunPenceresi2.getPacguy().setYon2(4);
                        oyunPenceresi2.getPacguy().image();

                    } else {
                        oyunPenceresi2.getPacguy().setYon2(4);
                    }

                    break;
                case KeyEvent.VK_DOWN:
                    if (oyunPenceresi2.getPacguy().getX() == 25 || oyunPenceresi2.getPacguy().getX() == 200 || oyunPenceresi2.getPacguy().getX() == 375 || oyunPenceresi2.getPacguy().getX() == 550 || oyunPenceresi2.getPacguy().getX() == 725) {
                        oyunPenceresi2.getPacguy().setYon(3);
                        oyunPenceresi2.getPacguy().setYon2(3);
                        oyunPenceresi2.getPacguy().image();

                    } else {
                        oyunPenceresi2.getPacguy().setYon2(3);
                    }

                    break;
                default:
                    break;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
