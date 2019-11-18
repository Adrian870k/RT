package logica;

import java.util.ArrayList;
import java.util.List;
import vista.Chat;
import model.modelo;

public class Preguntas {

    ArrayList<String> pregunta = new ArrayList<>();

    public String Preguntar(int c) {
        pregunta.add(0, "Cual sala desea reservar");
        pregunta.add(1, "Elija la hora en la cual quiere reservar la sala");
        pregunta.add(2, "cuales son las salas disponibles");
        pregunta.add(3, "software de esta sala");
        pregunta.add(4, "Cuanto es el maximo ");
        pregunta.add(5, "software de esta sala");

        if (c == 0) {
            return pregunta.get(0);
        } else if (c == 1) {

            return pregunta.get(1);
        } else if (c == 2) {
            return pregunta.get(2);
        }
        return null;
    }

}
