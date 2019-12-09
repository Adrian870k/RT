package mvc;

import ListaSimple.lista;
import Vista.Login;
import admin.MiReserva;
import admin.Persona;
import admin.sala;
import java.util.ArrayList;

/**
 * @author yordan.quintero
 */
public class Main {

    public static ArrayList<sala> listaSalas = new ArrayList<>();
    public static ArrayList<Persona> lista = new ArrayList<>();
    public static ArrayList<MiReserva> listaReserva = new ArrayList<>();
    public static int contador = 0;

    public static lista p = new lista();

    public static void main(String[] args) {

        sala a = new sala("1", "Sala201", "23", "Desarrollo", "Ninguna");
        sala b = new sala("2", "Sala202", "30", "Base de datos", "Ninguna");
        sala c = new sala("3", "Sala203", "20", "Redes", "Ninguna");
        sala d = new sala("4", "Sala204", "21", "Redes", "Ninguna");
        sala e = new sala("5", "Sala205", "20", "Desarrollo", "Ninguna");

        Main.listaSalas.add(a);
        Main.listaSalas.add(b);
        Main.listaSalas.add(c);
        Main.listaSalas.add(d);
        Main.listaSalas.add(e);

        Persona ab = new Persona("1", "Juan Velazques", "abc123", "Maestro");
        Persona ac = new Persona("2", "Carlos Muñoz", "abc123", "Maestro");
        Persona ad = new Persona("3", "Alberto Ateortua", "abc123", "Maestro");
        Persona ae = new Persona("4", "Jaime Jimenez", "abc123", "Maestro");
        Persona af = new Persona("5", "Eduard Hernandez", "abc123", "Maestro");
        Persona aq = new Persona("1", "Luis", "abc", "Maestro");

        Main.lista.add(ab);
        Main.lista.add(ac);
        Main.lista.add(ad);
        Main.lista.add(ae);
        Main.lista.add(af);
        Main.lista.add(aq);
        
        for (int i = 0; i < listaSalas.size(); i++) {
            String[][] m = new String[16][6];
            p.insertar(Main.listaSalas.get(i).getNombre(), m, Main.listaSalas.get(i).getRecurso());
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
