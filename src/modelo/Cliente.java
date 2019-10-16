package modelo;

public class Cliente {
private int id;
private String nombreCompleto;
private String materias;
private String tiempo;
 public Cliente() {
	 
	 
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombreCompleto() {
	return nombreCompleto;
}
public void setNombreCompleto(String nombreCompleto) {
	this.nombreCompleto = nombreCompleto;
}
public String getMaterias() {
	return materias;
}
public void setMaterias(String materias) {
	this.materias = materias;
}
public String getTiempo() {
	return tiempo;
}
public void setTiempo(String tiempo) {
	this.tiempo = tiempo;
}

}
