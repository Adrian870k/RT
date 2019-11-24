/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import control.controlador;
import logica.Preguntas;
import model.modelo;
import vista.Chat;

/**
 *
 * @author yordan.quintero
 */
public class mvc {
    public static void main(String[] args) {
        modelo md = new modelo();
        Chat ch = new Chat();
        ch.setLocationRelativeTo(null);
        controlador ctr = new controlador(ch, md);

        ctr.inicio();

        ch.setVisible(true);

    }

}
