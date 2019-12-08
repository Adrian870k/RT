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

    public boolean entrar(String name, String pass) {

        for (int i = 0; i < mvc.mvc.lista.size(); i++) {
            if ((mvc.mvc.lista.get(i).getNombre().equals(name)) && (mvc.mvc.lista.get(i).getClave().equals(pass))) {
                return true;
            }
        }

        return false;
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

    public void quitar(int hora, int dia, String sala) {
        Nodo auxiliar = primerElemento;

        while (auxiliar != null) {
            if (sala.equalsIgnoreCase(auxiliar.nombre)) {
                auxiliar.horario[hora][dia] = null;
            }

            auxiliar = auxiliar.siguiente;
        }

    }

    public String reservar(String actividad, int hora, int dia) {
        Nodo auxiliar = primerElemento;

        while (auxiliar != null) {
            System.out.println("entra");
            if (auxiliar.actividad.equalsIgnoreCase(actividad) && auxiliar.horario[hora][dia] == null) {
                auxiliar.horario[hora][dia] = "Ocupado";
                return auxiliar.nombre;
            }
            auxiliar = auxiliar.siguiente;
        }
        return "No";
    }

    public void consultar(String sala, String mat[][]) {
        Nodo auxiliar = primerElemento;

        while (auxiliar != null) {
            System.out.println("entra");
            if (auxiliar.nombre.equalsIgnoreCase(sala)) {
                for (int i = 0; i < 16; i++) {
                    for (int j = 0; j < 6; j++) {
                        mat[i][j] = auxiliar.horario[i][j];
                    }
                }

            }
            auxiliar = auxiliar.siguiente;
        }

    }

}
