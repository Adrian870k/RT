package controlador;

import modelo.Cliente;
import vista.ClienteVista;

public class ClienteControlador {
	private ClienteVista vista;
	private Cliente mod;

	public ClienteControlador(Cliente modelo, ClienteVista vista) {

		this.mod = modelo;
		this.vista = vista;

	}

	public int getId() {
		return mod.getId();

	}

	public void setId(int id) {
		this.mod.setId(id);
	}

	public String getNombreCompleto() {
		return mod.getNombreCompleto();

	}

	public void setNombreCompleto(String nombreCompleto) {
		this.mod.setNombreCompleto(nombreCompleto);
	}

	public String getMaterias() {
		return mod.getMaterias();

	}

	public void setMaterias(String materias) {
		this.mod.setMaterias(materias);

	}

	public String getTiempo() {
		return getTiempo();

	}

	public void setTiempo(String tiempo) {
		this.mod.setTiempo(tiempo);

	}
	public void actualizarVista() {
		vista.mostrarCliente(mod.getId(),mod.getNombreCompleto(), mod.getMaterias(),mod.getTiempo());
	}
}
