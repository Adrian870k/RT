package mvc;

import ListaSimple.lista;
import Vista.Login;
import admin.Persona;
import admin.sala;
import java.util.ArrayList;

/**
 * @author yordan.quintero
 */

public class mvc {

    public static ArrayList<sala> listaSalas = new ArrayList<>();
    public static ArrayList<Persona> lista = new ArrayList();
    public static lista p = new lista();

    public static void main(String[] args) {

        sala a = new sala("1", "Sala201", "23", "Desarrollo", "Ninguna");
        sala b = new sala("2", "Sala202", "30", "Base de datos", "Ninguna");
        sala c = new sala("3", "Sala203", "20", "Redes", "Ninguna");
        sala d = new sala("4", "Sala204", "21", "Redes", "Ninguna");
        sala e = new sala("5", "Sala205", "20", "Desarrollo", "Ninguna");

        mvc.listaSalas.add(a);
        mvc.listaSalas.add(b);
        mvc.listaSalas.add(c);
        mvc.listaSalas.add(d);
        mvc.listaSalas.add(e);

        Persona ab = new Persona("1", "Juan Velazques", "abc123", "Maestro");
        Persona ac = new Persona("2", "Carlos Muñoz", "abc123", "Maestro");
        Persona ad = new Persona("3", "Alberto Ateortua", "abc123", "Maestro");
        Persona ae = new Persona("4", "Jaime Jimenez", "abc123", "Maestro");
        Persona af = new Persona("5", "Eduard Hernandez", "abc123", "Maestro");

        mvc.lista.add(ab);
        mvc.lista.add(ac);
        mvc.lista.add(ad);
        mvc.lista.add(ae);
        mvc.lista.add(af);
        
        
        
        
        
        for (int i = 0; i < listaSalas.size(); i++) {
            String [][] m = new String[11][6];
            p.insertar(mvc.listaSalas.get(i).getNombre(), m , mvc.listaSalas.get(i).getRecurso());
        }
        
        p.mostrarMat();
        
        

        Login ch = new Login();
        ch.setLocationRelativeTo(null);
        ch.setVisible(true);
//        modelo md = new modelo();
//        Chat ch = new Chat();
//        ch.setLocationRelativeTo(null);
//        ch.panelPresentacion.setVisible(false);
//        ch.panelRecHor.setVisible(false);
//        controlador ctr = new controlador(ch, md);
//
//        ctr.inicio();
//
//        ch.setVisible(true);

    }

}
