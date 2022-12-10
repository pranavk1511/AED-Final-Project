/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author 91983
 */
public class Styling {
    public void changelock(){
   try{
       UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
   }catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
   }
}
}
