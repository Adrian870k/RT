package vista;



	import java.awt.Color;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	import javax.swing.JPanel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	public class PantallaInicio extends JFrame implements ActionListener {

	   
	    private JButton butonAceptar;
	    private JPanel panel;
	    private JLabel label1;
	    private JTextArea cajaTexto;
	    private JButton boton1;
	    private  JButton boton3;
	    private JButton boton2;
	    private ArrayList<String> texto = new ArrayList<String>();

	    public PantallaInicio() {
	        super("Real Time Reservation");
	        Color color1 = new Color(73,108,117); 
	        this.getContentPane().setLayout(new GridBagLayout());
	        this.getContentPane().setBackground(color1);

	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.gridx = 0; // El área de texto empieza en la columna cero.
	        constraints.gridy = 0; // El área de texto empieza en la fila cero
	        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
	        constraints.gridheight = 2;

	        cajaTexto = new JTextArea("¿Como te puedo ayudar?");
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.gridheight = 2;
	        cajaTexto.setBackground(color1.brighter());
	// El area de texto debe estirarse en ambos sentidos. Ponemos el campo fill.
	        constraints.fill = GridBagConstraints.BOTH;
	        constraints.weighty = 1.0;
	        this.getContentPane().add(cajaTexto, constraints);
	        constraints.weighty = 0.0;

	        boton1 = new JButton("Deseo reservar una sala");
	        constraints.gridx = 2;
	        constraints.gridy = 0;
	        constraints.gridwidth = 1;
	        constraints.gridheight = 1;
	        constraints.weighty = 1.0;
	        boton1.addActionListener(this);
	// El botón 1 debe ocupar la posición NORTH de su celda
	        constraints.anchor = GridBagConstraints.NORTH;
	// El botón 1 no debe estirarse. Habíamos cambiado este valor en el
	// area de texto, asi que lo restauramos.
	        constraints.fill = GridBagConstraints.NONE;
	        this.getContentPane().add(boton1, constraints);
	// Restauramos valores por defecto
	        constraints.anchor = GridBagConstraints.CENTER;
	        constraints.weighty = 0.0;

	        boton2 = new JButton("Disponibiles");
	        constraints.gridx = 2;
	        constraints.gridy = 1;
	        constraints.gridwidth = 1;
	        constraints.gridheight = 1;
	        constraints.weighty = 1.0;
	// El boton 2 debe ocupar la posición NORTH de su celda.
	        constraints.anchor = GridBagConstraints.NORTH;
	        this.getContentPane().add(boton2, constraints);
	// Restauramos valores por defecto.
	        constraints.weighty = 0.0;
	        constraints.anchor = GridBagConstraints.CENTER;
	        boton2.addActionListener(this);

	        boton3 = new JButton("¿Enviar?");
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        constraints.gridheight = 1;
	        this.getContentPane().add(boton3, constraints);
	        boton3.addActionListener(this);
	        
	        
	        butonAceptar = new JButton("¿Cuantas horas puedo reservar?");
	        constraints.gridx = 2;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        constraints.gridheight = 1;
	        butonAceptar.addActionListener(this);
	        this.getContentPane().add(butonAceptar, constraints);

	        JTextField campoTexto = new JTextField("Campo texto");
	        constraints.gridx = 1;
	        constraints.gridy = 2;
	        constraints.gridwidth = 1;
	        constraints.gridheight = 1;
	        constraints.weightx = 1.0;
	        // El campo de texto debe estirarse sólo en horizontal.
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        this.getContentPane().add(campoTexto, constraints);
	    }

	    public static void main(String[] args) {

//	        Preguntas p = new Preguntas();
	        //p.traerPreguntas();
	        PantallaInicio frame = new PantallaInicio();

	        frame.setBounds(0, 0, 700, 700);
//	        frame.setResizable(false);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    }

	    @Override
	    public void actionPerformed(ActionEvent ev) {
	        Object control = ev.getSource();
	        String varB;
	        cajaTexto.setText("");
	        
	        // preguntas p = new preguntas();
	        if (control.equals(butonAceptar)) {

	            texto.add("\n¿Cuantas horas puedo reservar?");
	            texto.add("\nPuedes reservar maximo 2 veces al día");

	        } else if (control.equals(boton1)) {
	            texto.add("\ncomo te va\n");
	        }
	        else if(control.equals(boton2)) {
	        	texto.add("\nEstas son las salas disponibles");
	        	texto.add("\nsala 203");
	        	texto.add("\nsala 205");
	        	texto.add("\nsala 208");
	        	texto.add("\nsala 303");
	        	
	        	
	        	
	        	
	        }
	        String var = texto.toString();
	        System.out.println(var);
	        cajaTexto.setText(var.replace("[", " ").replace("]", " ").replace(",", ""));
	        //Estos seran los metodos
	        
//	        Preguntas preguntas = new Preguntas();
//	        String p = preguntas.lasPreguntas();
//	        boton3.setText(p);
	        

	    }

	}