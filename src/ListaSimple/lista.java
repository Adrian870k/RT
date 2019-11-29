/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

import java.util.Arrays;

/**
 *
 * @author yordan.quintero
 */
public class lista {

    Nodo primerElemento;

    public lista() {
        this.primerElemento = null;

    }

    public void insertar(String nombre, String[][] mat, String activ) {

        Nodo nuevoElemento = new Nodo(nombre, mat, activ);

        if (primerElemento == null) {
            nuevoElemento.siguiente = null;
            primerElemento = nuevoElemento;
        } else {
            nuevoElemento.siguiente = primerElemento;
            primerElemento = nuevoElemento;
        }
    }

    public void mostrarMat() {
        Nodo auxiliar = primerElemento;
        String numeros = "";

        while (auxiliar != null) {
            System.out.println(auxiliar.nombre);
            System.out.println("");
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(auxiliar.horario[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println(auxiliar.actividad);

            auxiliar = auxiliar.siguiente;
        }

    }
}
