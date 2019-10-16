package mvc;

import controlador.ClienteControlador;
import modelo.Cliente;
import vista.ClienteVista;

public class Mvc {
public static void main(String[] args) {
	Cliente modelo = llenarDatosCliente();
	ClienteVista vista= new ClienteVista();
	
	ClienteControlador contro = new ClienteControlador(modelo, vista);
	
	contro.actualizarVista();
	
	contro.setNombreCompleto("palacio");
	contro.setMaterias("Sistemico");
	contro.setTiempo("Completo");
	contro.actualizarVista();
	
	
}
private static Cliente llenarDatosCliente() {
	Cliente clien = new Cliente();
	clien.setId(1);
	clien.setNombreCompleto("pablo");
	clien.setMaterias("Soporte");
	clien.setTiempo("Medio");
	return clien;
	
}
}
