/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import vista.Horarios;

/**
 *
 * @author yordan.quintero
 */
public class adm {

    public static void main(String[] args) {
//        user p = new user();
        //   p.setTitle("Usuarios");
//        p.setLocationRelativeTo(null);
//        p.setVisible(true);
//        salas s = new salas();
//        
//        s.setTitle("Salas");
//        s.setLocationRelativeTo(null);
//        s.setVisible(true);

        Horarios a = new Horarios();
        a.setTitle("Salas");
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.mostrarHorarios();

    }

}
