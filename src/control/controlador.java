/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import logica.Preguntas;
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
        this.chat.jButtonPregunta3.addActionListener(this);
    }

    public void inicio() {
        chat.setTitle("Chatbot");
        chat.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Preguntas sig = new Preguntas();

        Object control = e.getSource();
        if (control.equals(chat.jButtonPregunta1)) {

            mod.setPreguntaUno(chat.jButtonPregunta1.getText());

            mod.respuestaBoton1();
            

            chat.jTextPaneCharla.setText(mod.getCuadroTexto());
            chat.jTextPaneCharla.setText(model.modelo.cadenaDialogoOrganizada += "Selecciona las opciones para reservar \n");
            chat.panelRecHor.setVisible(true);

       

            chat.jButtonPregunta1.setText(sig.Preguntar(0));

        }  else if (control.equals(chat.jButtonPregunta3)) {

            mod.setPreguntaTres(chat.jButtonPregunta3.getText());
            mod.respuestaBoton3();
           chat.jTextPaneCharla.setText(mod.getCuadroTexto());
            chat.jButtonPregunta3.setText(sig.Preguntar(2));

        }
    }
    
    public void procesar(){
    
        
    }
   
    
    

}
