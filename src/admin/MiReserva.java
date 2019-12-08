package admin;

public class MiReserva {

    String sala, dia, hora;
    int id,posicionHor,posicionDia;

    public MiReserva(int id, String sala, String dia, String hora, int posicionHor, int posicionDia) {
        this.sala = sala;
        this.dia = dia;
        this.hora = hora;
        this.id = id;
        this.posicionHor = posicionHor;
        this.posicionDia = posicionDia;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosicionHor() {
        return posicionHor;
    }

    public void setPosicionHor(int posicionHor) {
        this.posicionHor = posicionHor;
    }

    public int getPosicionDia() {
        return posicionDia;
    }

    public void setPosicionDia(int posicionDia) {
        this.posicionDia = posicionDia;
    }


}
