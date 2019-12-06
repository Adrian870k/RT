/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/**
 *
 * @author yordan.quintero
 */
public class Nodo {

    public String nombre;
    public String actividad;
    public String horario[][] = new String[15][6];
    Nodo siguiente;

    public Nodo(String name, String[][] mat, String act) {
        this.nombre = name;
        this.horario = mat;
        this.actividad = act;
        this.siguiente = null;
    }

}
