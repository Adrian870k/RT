package vista;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginPantalla extends JFrame {

	private JPanel panel;
	private JTextField textoUsuario;

	public LoginPantalla() {
		super("Real Time Reservation");
		Color color1 = new Color(255, 255, 255);
		this.getContentPane().setLayout(new GridBagLayout());
		this.getContentPane().setBackground(color1);

		

	}

	public static void main(String[] args) {

//		        Preguntas p = new Preguntas();
		// p.traerPreguntas();
		LoginPantalla frame = new LoginPantalla();

		frame.setBounds(0, 0, 700, 700);
//		        frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
