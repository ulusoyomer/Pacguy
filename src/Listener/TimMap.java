
package Listener;

import BackGround.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimMap implements ActionListener{
    Map map;
    

    public TimMap(Map map) {
        this.map = map;
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == map.getTimer()){
        map.hareket2();
        map.carpisma2();
        
        }
        if(ae.getSource() == map.getTimer2()){
            map.carpisma7();
            map.carpisma3();
        map.getGhosts().hareket2();
        map.getRGhosts().hareket2();
        map.getYGhosts().hareket2();
        map.getBGhosts().hareket2();
        }
        if(ae.getSource() == map.getTimer3()){
            map.RHaylet();
        }
        
    }
    
}
