package model;

import logica.Preguntas;
import vista.Chat.*;

public class modelo {

    private String preguntaUno;
    private String preguntaDos;
    private String preguntaTres;
    private String preguntaAle;
    private String encabezadoPregX;
    private String cuadroTexto;
    public static String cadenaDialogoOrganizada = "";
    int sw;
    

    public String getPreguntaUno() {
        return preguntaUno;
    }

    public void setPreguntaUno(String preguntaUno) {
        this.preguntaUno = preguntaUno;
    }

    public String getPreguntaDos() {
        return preguntaDos;
    }

    public void setPreguntaDos(String preguntaDos) {
        this.preguntaDos = preguntaDos;
    }

    public String getPreguntaTres() {
        return preguntaTres;
    }

    public void setPreguntaTres(String preguntaTres) {
        this.preguntaTres = preguntaTres;
    }

    public String getPreguntaAle() {
        return preguntaAle;
    }

    public void setPreguntaAle(String preguntaAle) {
        this.preguntaAle = preguntaAle;
    }

    public String getEncabezadoPregX() {
        return encabezadoPregX;
    }

    public void setEncabezadoPregX(String encabezadoPregX) {
        this.encabezadoPregX = encabezadoPregX;
    }

    public String getCuadroTexto() {
        return cuadroTexto;
    }

    public void setCuadroTexto(String cuadroTexto) {
        this.cuadroTexto = cuadroTexto;
    }

    public String respuestaBoton1() {
         
       
         
        cadenaDialogoOrganizada +=   preguntaUno+"\n";
        
        
        
        return this.cuadroTexto = cadenaDialogoOrganizada;
    }

    public String respuestaBoton2() {
        cadenaDialogoOrganizada +=   preguntaDos+"\n";
        return this.cuadroTexto = cadenaDialogoOrganizada;
    }
     public String respuestaBoton3() {
         cadenaDialogoOrganizada +=   preguntaTres+"\n";
        return this.cuadroTexto = cadenaDialogoOrganizada;
    }
      public String respuestaBotonAle() {
        return this.cuadroTexto = preguntaAle;
    }
}
