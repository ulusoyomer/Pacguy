/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listener;

import BackGround.Cerceve;
import BackGround.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author qq
 */
public class ActionListenerr implements ActionListener{
   
    Cerceve cerceve;

    public ActionListenerr(Cerceve cerceve) {
        
        this.cerceve= cerceve;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == cerceve.getstartGui().getEasy()){
            System.out.println("Easy");
            cerceve.getstartGui().getTimer().stop();
            cerceve.getJFrame().setVisible(false);
            cerceve.setZorluk(12);
            cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
           // cerceve.getOyun().setVisible(true);

            
           
           
            

           
            
        }
        else if(ae.getSource() == cerceve.getstartGui().getMedium()){
           System.out.println("Medium");
            cerceve.getstartGui().getTimer().stop();
            cerceve.getJFrame().setVisible(false);
            cerceve.setZorluk(9);
            cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
           // cerceve.getOyun().setVisible(true);
            
            
        }
        else{
            System.out.println("Hard");
            cerceve.getstartGui().getTimer().stop();
            cerceve.getJFrame().setVisible(false);
            cerceve.setZorluk(5);
            cerceve.getstartGui().getMgp().stop(cerceve.getstartGui().getLoop());
           // cerceve.getOyun().setVisible(true);
            
            
            
        }
        
    }
    
}
