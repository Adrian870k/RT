/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

import model.modelo;

/**
 *
 * @author yordan.quintero
 */
public class controlador implements ActionListener {

    private vista.Chat chat;
    private model.modelo mod;
    int cp1 = 0, cp2 = 1, cp3 = 2;

    public controlador(vista.Chat view, model.modelo mod) {
        this.chat = view;
        this.mod = mod;
        this.chat.jButtonPregunta1.addActionListener(this);
      
    }

    public void inicio() {
        chat.setTitle("Chatbot");
        chat.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        

        
    }
    
    public void procesar(){
    
        
    }
   
    
    

}
